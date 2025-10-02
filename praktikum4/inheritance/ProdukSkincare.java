package inheritance;

public class ProdukSkincare {
    protected String nama;
    protected double harga;

    public ProdukSkincare(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void infoProduk() {
        System.out.println("Produk: " + nama + " | Harga: Rp" + harga);
    }
}
