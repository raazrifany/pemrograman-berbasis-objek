import javax.swing.*;
public class belajarquiz3 {
    public static void main(String args[]) {
    	String[] nama = new String[10];
    	String[] jurusan = new String[10];
    	String[] kelas = new String[10];
    	int[] jml = new int[10];
    	int[] harga = new int[10];
    	int[] bayar = new int[10];
    	String jawab;
    	
    	System.out.println("========================================================");
    	System.out.println("No Nama Pembeli\tJurusan\tKelas\tJml Tiket\tHarga\tBayar");
    	System.out.println("========================================================");
    	
    	int i=0;
    	do{
    		nama[i] = JOptionPane.showInputDialog("Nama Pembeli : ");
    		jurusan[i] = JOptionPane.showInputDialog("Jurusan : ");
    		kelas[i] = JOptionPane.showInputDialog("Kelas : ");
    		jml[i] = Integer.valueOf(JOptionPane.showInputDialog("Jumlah Tiket : "));
    		
    		if(jurusan[i].equalsIgnoreCase("Bandung")){
    			if(kelas[i].equalsIgnoreCase("Ekonomi")){
    				harga[i] = 20000;
    			}else if(kelas[i].equalsIgnoreCase("Bisnis")){
    				harga[i] = 40000;
    			}
    		}else if(jurusan[i].equalsIgnoreCase("Jakarta")){
    			if(kelas[i].equalsIgnoreCase("Ekonomi")){
    				harga[i] = 40000;
    			}else if(kelas[i].equalsIgnoreCase("Bisnis")){
    				harga[i] = 60000;
    			}
    		}else{
    			if(kelas[i].equalsIgnoreCase("Ekonomi")){
    				harga[i] = 0;
    			}else if(kelas[i].equalsIgnoreCase("Bisnis")){
    				harga[i] = 0;
    			}
    		}
    		
    		bayar[i] = jml[i]*harga[i];
    		
    		i++;
    		jawab = JOptionPane.showInputDialog("Input lagi? : ");
    	}while(jawab.equalsIgnoreCase("Y"));
    	
    	for(int j=0; j<i; j++){
    		System.out.print(j+1);
    		System.out.print(". "+nama[j]);
    		System.out.print("       "+jurusan[j]);
    		System.out.print(" "+kelas[j]);
    		System.out.print("   "+jml[j]);
    		System.out.print("          "+harga[j]);
    		System.out.println("   "+bayar[j]);
    	}
    }
    
    
}