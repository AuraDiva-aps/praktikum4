package inheritance;

public class Moisturizer extends ProdukSkincare {

    public Moisturizer(String nama, double harga) {
        super(nama, harga);
    }

    public void manfaat() {
        System.out.println(nama + " bermanfaat untuk melembapkan kulit ");
    }
}
