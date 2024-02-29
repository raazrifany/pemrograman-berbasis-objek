import javax.swing.*;
public class B_10522031_DzilaniWardah{
    public static void main(String args[]){
        int uts, uas, nilaiAkhir;
        String namaMhs;
        namaMhs = JOptionPane.showInputDialog("Masukan Nama Mahasiswa : ");
        uts = Integer.valueOf(JOptionPane.showInputDialog("Masukan Nilai UTS : "));
        uas = Integer.valueOf(JOptionPane.showInputDialog("Masukan Nilai UAS : "));
        
        nilaiAkhir = (uts + uas)/2;

        System.out.println("Nama Mahasiswa = "+namaMhs);
        System.out.println("Nilai UTS = "+uts);
        System.out.println("Nilai UAS = "+uas);
        System.out.println("Nilai Akhir = "+nilaiAkhir);
    }
}
