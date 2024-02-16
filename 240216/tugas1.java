import javax.swing.*;
public class cobajavavs{
    public static void main(String args[]){
        int hargaBeli, jml, subtotal;
        String namaBarang;
        namaBarang = JOptionPane.showInputDialog("Masukan Nama Barang : ");
        hargaBeli = Integer.valueOf(JOptionPane.showInputDialog("Masukan Harga Beli : "));
        jml = Integer.valueOf(JOptionPane.showInputDialog("Masukan Jumlah Barang : "));
        
        subtotal = hargaBeli * jml;

        System.out.println("Nama Barang = "+namaBarang);
        System.out.println("Harga Beli = "+hargaBeli);
        System.out.println("Jumlah Barang = "+jml);
        System.out.println("Subtotal = "+subtotal);
    }
}
