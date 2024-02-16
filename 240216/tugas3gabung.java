import javax.swing.*;
public class tugas3 {
    public static void main(String[] args) {
        int hargaBeli, jml, subtotal;
        String namaBarang;
        namaBarang = JOptionPane.showInputDialog("Masukan Nama Barang : ");
        hargaBeli = Integer.valueOf(JOptionPane.showInputDialog("Masukan Harga Beli : "));
        jml = Integer.valueOf(JOptionPane.showInputDialog("Masukan Jumlah Barang : "));
        
        Anak1 panggil = new Anak1();
        panggil.output(namaBarang, hargaBeli, jml);
    }
}

class Induk1 {
    public void proses(int hargaBeli, int jumlah) {
        int subtotal = hargaBeli * jumlah;
        System.out.println("Subtotal: " + subtotal);
    }
}

class Anak1 extends Induk1 {
    public void output(String namaBarang, int hargaBeli, int jml) {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBeli);
        System.out.println("Jumlah Barang: " + jml);
        
        proses(hargaBeli, jml);
    }
}
