import javax.swing.JOptionPane;
public class Tugas2_B_10522031_DzilaniWardah {
    public static void main(String args[]){
        int uts, uas;
        String namaMhs;
        namaMhs = JOptionPane.showInputDialog("Masukan Nama Mahasiswa : ");
        uts = Integer.valueOf(JOptionPane.showInputDialog("Masukan Nilai UTS : "));
        uas = Integer.valueOf(JOptionPane.showInputDialog("Masukan Nilai UAS : "));
        
        ProsesOutput panggil = new ProsesOutput();
        panggil.proses(uts, uas);
        panggil.output(namaMhs, uts, uas);
    }
}

class ProsesOutput {
    public int proses(int uts, int uas){
        int nilaiAkhir = (uts + uas)/2;
        return nilaiAkhir;
    }

    public void output(String namaMhs, int uts, int uas){
        int nilaiAkhir = proses(uts, uas);
        System.out.println("Nama Mahasiswa = "+namaMhs);
        System.out.println("Nilai UTS = "+uts);
        System.out.println("Nilai UAS = "+uas);
        System.out.println("Nilai Akhir = "+nilaiAkhir);
    }
}
