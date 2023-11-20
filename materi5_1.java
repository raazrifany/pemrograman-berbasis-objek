import javax.swing.*;
public class materi5_1 {
    public static void main(String args[]) {
    	//contoh sebelum latihan
    	int[] nilai = new int [10]; String[] nama = new String[10];
    	String jawab=""; int i=0;
    	do{
    		nama[i]=JOptionPane.showInputDialog("Masukan Nama : ");
    		nilai[i]=Integer.valueOf(JOptionPane.showInputDialog("Masukan Nilai : "));
    		i++;
    		jawab=JOptionPane.showInputDialog("Mau tambah lagi ? ");
    	}while(jawab.equalsIgnoreCase("Y"));
    	
    	System.out.println("================================");
    	System.out.println("Nama\t\t\t\tNilai");
    	System.out.println("================================");
    	for(int j=0; j<i; j++){
    		System.out.println(nama[j]+ "\t\t\t\t" +nilai[j]);
    	}
    }
}