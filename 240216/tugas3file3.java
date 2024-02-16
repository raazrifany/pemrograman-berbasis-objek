public class Anak {
    public void output(String namaBarang, int hargaBeli, int jml) {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBeli);
        System.out.println("Jumlah Barang: " + jml);
        
        Induk panggil = new Induk();
        panggil.proses(hargaBeli, jml);
    }
}
