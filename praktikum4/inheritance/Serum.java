package inheritance;

public class Serum extends ProdukSkincare {

    public Serum(String nama, double harga) {
        super(nama, harga);
    }

    public void manfaat() {
        System.out.println(nama + " bermanfaat untuk mencerahkan wajah ");
    }
}
