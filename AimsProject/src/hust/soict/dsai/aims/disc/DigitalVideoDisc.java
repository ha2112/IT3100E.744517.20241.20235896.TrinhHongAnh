package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
   private String title;
   private String category;
   private String director;
   private int length;
   private float cost;
   private static int nbDigitalVideoDisc = 0;
   private int id;

   public DigitalVideoDisc(String var1) {
      this.title = var1;
      ++nbDigitalVideoDisc;
      this.id = nbDigitalVideoDisc;
   }

   public DigitalVideoDisc(String var1, String var2, float var3) {
      this.category = var1;
      this.title = var2;
      this.cost = var3;
      ++nbDigitalVideoDisc;
      this.id = nbDigitalVideoDisc;
   }

   public DigitalVideoDisc(String var1, String var2, String var3, float var4) {
      this.director = var1;
      this.category = var2;
      this.title = var3;
      this.cost = var4;
      ++nbDigitalVideoDisc;
      this.id = nbDigitalVideoDisc;
   }

   public DigitalVideoDisc(String var1, String var2, String var3, int var4, float var5) {
      this.title = var1;
      this.category = var2;
      this.director = var3;
      this.length = var4;
      this.cost = var5;
      ++nbDigitalVideoDisc;
      this.id = nbDigitalVideoDisc;
   }

   public String getTitle() {
      return this.title;
   }

   public String getCategory() {
      return this.category;
   }

   public String getDirector() {
      return this.director;
   }

   public int getLength() {
      return this.length;
   }

   public float getCost() {
      return this.cost;
   }

   public void setTitle(String var1) {
      this.title = var1;
   }

   public int getId() {
      return this.id;
   }
}
