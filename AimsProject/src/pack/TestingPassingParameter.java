public class TestingPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle, dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
    }

    public static void correctSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        // Store the old information of dvd1
        String oldTitle1 = dvd1.getTitle();
        String oldCategory1 = dvd1.getCategory(); 
        String oldDirector1 = dvd1.getDirector();
        int oldLength1 = dvd1.getLength();
        float oldCost1 = dvd1.getCost();
        
        // Create new DVDs with swapped information
        dvd1 = new DigitalVideoDisc(dvd2.getTitle(), dvd2.getCategory(), dvd2.getDirector(), dvd2.getLength(), dvd2.getCost());
        dvd2 = new DigitalVideoDisc(oldTitle1, oldCategory1, oldDirector1, oldLength1, oldCost1);
    }
}
