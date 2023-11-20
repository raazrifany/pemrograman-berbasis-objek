import javax.swing.*;
public class materi6_latihan2 {
    public static void main(String args[]) {
	    String[] nama = new String[10];
	    String[] jurusan = new String[10];
	    String[] kelas = new String[10];
	    int[] tiket = new int[10];
	    int[] bayar = new int[10];
	    int[] harga = new int[10];
	    String jawab; int i,j;
    
    	System.out.println("| Kelas/Jurusan | Bandung | Jakarta |");
    	System.out.println("|     Bisnis    |  40000  |  60000  |");
    	System.out.println("|     Ekonomi   |  20000  |  40000  |");
    	
    	System.out.println("\n=================================================================================");
    	System.out.println("No\tNama Pembeli\tJurusan\t\tKelas\t\tJumlah Tiket\t\tHarga\t\tBayar");
    	System.out.println("=================================================================================");
    	
    	i=0;
    	do{
    		nama[i] = JOptionPane.showInputDialog("Nama Pembeli : ");
    		jurusan[i] = JOptionPane.showInputDialog("Jurusan : ");
    		kelas[i] = JOptionPane.showInputDialog("Kelas : ");
    		
    		if (jurusan[i].equalsIgnoreCase("Bandung")){
	    		if(kelas[i].equalsIgnoreCase("Bisnis")){
	    			harga[i] = 40000;
	    		}else if(kelas[i].equalsIgnoreCase("Ekonomi")){
	    			harga[i] = 20000;
	    		}
	    	}else if(jurusan[i].equalsIgnoreCase("Jakarta")){
	    		if(kelas[i].equalsIgnoreCase("Bisnis")){
	    			harga[i] = 60000;
	    		}else if(kelas[i].equalsIgnoreCase("Ekonomi")){
	    			harga[i] = 40000;
	    		}
	    	}
	    	
    		tiket[i] = Integer.valueOf(JOptionPane.showInputDialog("Jumlah Tiket : "));
    		bayar[i] = harga[i]*tiket[i];
    		jawab = JOptionPane.showInputDialog("Input Lagi ? ");
    		i++;
    	}while(jawab.equalsIgnoreCase("Y"));
    	
    	
    	for(j=0; j<i; j++){
    		System.out.println((j+1)+"\t"+nama[j]+"\t\t\t"+jurusan[j]+"\t\t"+kelas[j]+"\t\t"+tiket[j]+"\t\t\t\t\t"+harga[j]+"\t\t"+bayar[j]);
    	}
    }
}