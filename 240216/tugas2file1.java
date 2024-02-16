import javax.swing.*;
public class Tugas2_KODE_10522010_Rayvanka {
    public static void main(String args[]){
        int hargaBeli, jml, subtotal;
        String namaBarang;
        namaBarang = JOptionPane.showInputDialog("Masukan Nama Barang : ");
        hargaBeli = Integer.valueOf(JOptionPane.showInputDialog("Masukan Harga Beli : "));
        jml = Integer.valueOf(JOptionPane.showInputDialog("Masukan Jumlah Barang : "));
        
        ProsesOutput panggil = new ProsesOutput();
        panggil.proses(hargaBeli, jml);
        panggil.output(namaBarang, hargaBeli, jml);
    }
}
