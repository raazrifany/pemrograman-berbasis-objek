import javax.swing.*;
public class tugas3_1 {
    public static void main(String[] args) {
        int hargaBeli, jml, subtotal;
        String namaBarang;
        namaBarang = JOptionPane.showInputDialog("Masukan Nama Barang : ");
        hargaBeli = Integer.valueOf(JOptionPane.showInputDialog("Masukan Harga Beli : "));
        jml = Integer.valueOf(JOptionPane.showInputDialog("Masukan Jumlah Barang : "));
        
        Anak panggil = new Anak();
        panggil.output(namaBarang, hargaBeli, jml);
    }
}
