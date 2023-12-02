import javax.swing.*;
public class cobaquizprauts {
public static void main(String args[]) {
    	String[] namaPelanggan = new String[10];
    	String[] kodeItem = new String[10];
    	String[] namaItem = new String[10];
    	int[] jumlah = new int[10];
    	int[] harga = new int[10];
    	int[] total = new int[10];
    	String jawab;
    	int i,j;
    	
    	
	    System.out.println("====================================================================");
	    System.out.println("No\tNama Pelanggan\t Nama Item\t\t  Jumlah\t Harga\t Total Bayar");
	    System.out.println("====================================================================");
	    
    	i=0;
    	do{
	    	namaPelanggan[i] = JOptionPane.showInputDialog("Nama Pelanggan : ");
	    	kodeItem[i] = JOptionPane.showInputDialog("Kode Item : ");
	    	jumlah[i] = Integer.valueOf(JOptionPane.showInputDialog("Jumlah"));
	    	
	    	if(kodeItem[i].equalsIgnoreCase("H001")){
	    		namaItem[i] = "Handphone";
	    		harga[i] = 400000;
	    	}else if(kodeItem[i].equalsIgnoreCase("E002")){
	    		namaItem[i] = "External Memory";
	    		harga[i] = 100000;
	    	}else if(kodeItem[i].equalsIgnoreCase("M003")){
	    		namaItem[i] = "Modem";
	    		harga[i] = 300000;
	    	}else{
	    		namaItem[i] = "Tidak Ditemukan";
	    		harga[i] = 0;
	    	}
	    	
	    	total[i] = harga[i]*jumlah[i];
	    	i++;
	    	jawab = JOptionPane.showInputDialog("Apakah mau tambah data lagi? Y/T ");
    	}while(jawab.equalsIgnoreCase("Y"));
    	
	    for(j = 0; j < i; j++) {
    		System.out.printf("%-4d%-17s%-18s%-10d%-8d%-8d\n",
        	(j + 1), namaPelanggan[j], namaItem[j], jumlah[j], harga[j], total[j]);
		}
	    
	    System.out.println("====================================================================");
    }
}
