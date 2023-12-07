import javax.swing.*;
public class A_10522010_RayvankaAzrifany {
    public static void main(String args[]) {
    	String jawab;
    	String [] namaPembeli = new String[10];
    	String [] idBarang = new String[10];
    	String [] namaBarang = new String[10];
    	int [] jml = new int[10];
    	int [] harga = new int[10];
    	int [] subtotal = new int[10];
    	int i,j;
    	
    	i=0;
    	do{
    		namaPembeli[i] = JOptionPane.showInputDialog("Nama Pembeli : ");
	    	idBarang[i] = JOptionPane.showInputDialog("ID Barang : ");
	    	jml[i] = Integer.valueOf(JOptionPane.showInputDialog("Jumlah : "));
	    	
	    	if(idBarang[i].equalsIgnoreCase("B002")){
	    		namaBarang[i] = "Pemrograman Java";
	    		harga[i] = 80000;
	    	}else if(idBarang[i].equalsIgnoreCase("B003")){
	    		namaBarang[i] = "Pemrograman C";
	    		harga[i] = 70000;
	    	}else if(idBarang[i].equalsIgnoreCase("B004")){
	    		namaBarang[i] = "Pemrograman PHP";
	    		harga[i] = 60000;
	    	}else{
	    		namaBarang[i] = "Tidak ada";
	    		harga[i] = 0;
	    	}
	    	
	    	subtotal[i] = harga[i]*jml[i];
	    	
	    	i++;
    		jawab = JOptionPane.showInputDialog("Apakah mau input lagi? Y/T : ");
    	}while(jawab.equalsIgnoreCase("Y"));
    
    
    /**	for(j=0; j<i; j++){
	    	System.out.println("=====================");
	    	System.out.println("Nama pembeli = "+namaPembeli[j]);
	    	System.out.println("ID Barang = "+idBarang[j]);
	    	System.out.println("Nama Barang = "+namaBarang[j]);
	    	System.out.println("Jumlah = "+jml[j]);
	    	System.out.println("Harga = "+harga[j]);
	    	System.out.println("Subtotal = "+subtotal[j]);
    	}**/
    	
	    System.out.println("===============================================================================");
	    System.out.println("No  Nama Pembeli        ID Barang  Nama Barang          Jumlah  Harga  Subtotal");
    	for(j=0; j<i; j++){
	    //	System.out.println("No  Terazono Keita      ID Barang  Pemrograman Java     Jumlah  80000  80000000");
	    	System.out.printf("%-4d%-20s%-11s%-21s%-8d%-7d%-8d\n",(j+1), namaPembeli[j], idBarang[j], namaBarang[j], jml[j], harga[j], subtotal[j]);
    	}
	    System.out.println("===============================================================================");
    }
}
