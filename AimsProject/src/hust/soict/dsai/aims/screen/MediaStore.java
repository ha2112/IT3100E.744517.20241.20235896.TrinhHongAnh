package hust.soict.dsai.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel {
	private Media media;
	private Cart cart;
	
	public MediaStore(Media media, Cart cart) {
		this.media = media;
		this.cart = cart;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel("" + media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container =  new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton addToCartButton = new JButton("Add to cart");
		addToCartButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cart.addMedia(media);
				JDialog noti = new JDialog();
				noti.setTitle("Notification");
				noti.setSize(300, 200);
				
				JLabel message = new JLabel(media.getTitle() + " added to cart.");
				message.setFont(new Font("Arial", Font.PLAIN, 20));
				message.setHorizontalAlignment(JLabel.CENTER);
				
				noti.add(message);
				noti.setVisible(true);
			}
		});
		
		
		
		container.add(addToCartButton);
		if (media instanceof Playable) {
			JButton play = new JButton("Play");
			play.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					playMedia();
				}
			});
			container.add(play);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	public void playMedia() {
		JDialog diag = new JDialog();
		diag.setTitle("Playing " + media.getTitle());
		diag.setSize(300, 200);
		
		 JLabel playingLabel = new JLabel("Now playing: " + media.getTitle());
	        playingLabel.setFont(new Font("Arial", Font.PLAIN, 16));
	        playingLabel.setHorizontalAlignment(JLabel.CENTER);
	        
	        diag.add(playingLabel);
	        diag.setModal(true);
	        diag.setVisible(true);  // Show the dialog
	}
}