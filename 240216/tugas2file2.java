public class ProsesOutput {
    public int proses(int hargaBeli, int jml){
        int subtotal = hargaBeli * jml;
        return subtotal;
    }

    public void output(String namaBarang, int hargaBeli, int jml){
        int subtotal = proses(hargaBeli, jml);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Beli : "+hargaBeli);
        System.out.println("Jumlah Barang : "+jml);
        System.out.println("Subtotal : "+subtotal);
    }
}
