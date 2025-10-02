package inheritance;

public class MainSkincare {
    public static void main(String[] args) {
        Serum serum = new Serum("Serum Vitamin C", 150000);
        Moisturizer moisturizer = new Moisturizer("Moisturizer Aloe Vera", 100000);

        serum.infoProduk();
        serum.manfaat();

        moisturizer.infoProduk();
        moisturizer.manfaat();
    }
}
