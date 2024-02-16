import javax.swing.*;
public class Tugas2_KODE_10522010_Rayvanka2 {
    public static void main(String args[]){
        int hargaBeli, jml, subtotal;
        String namaBarang;
        namaBarang = JOptionPane.showInputDialog("Masukan Nama Barang : ");
        hargaBeli = Integer.valueOf(JOptionPane.showInputDialog("Masukan Harga Beli : "));
        jml = Integer.valueOf(JOptionPane.showInputDialog("Masukan Jumlah Barang : "));
        
        ProsesOutput1 panggil = new ProsesOutput1();
        panggil.proses(hargaBeli, jml);
        panggil.output(namaBarang, hargaBeli, jml);
    }
}

class ProsesOutput1 {
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

