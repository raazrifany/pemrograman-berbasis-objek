import javax.swing.*;
public class materi3_latihan {
    public static void main(String args[]){
    	String nama, jurusan, kelas; int jml, harga=0, bayar;
    	
    	nama = JOptionPane.showInputDialog("Nama Pembeli : ");
    	jurusan = JOptionPane.showInputDialog("Jurusan : ");
    	kelas = JOptionPane.showInputDialog("Kelas : ");
    	jml = Integer.valueOf(JOptionPane.showInputDialog("Jumlah Tiket : "));
    	
    	if(jurusan.equalsIgnoreCase("Bandung")){
    			if(kelas.equalsIgnoreCase("Ekonomi")){
    				harga = 20000;
    			}else if(kelas.equalsIgnoreCase("Bisnis")){
    				harga = 40000;
    			}
    		}else if(jurusan.equalsIgnoreCase("Jakarta")){
    			if(kelas.equalsIgnoreCase("Ekonomi")){
    				harga = 40000;
    			}else if(kelas.equalsIgnoreCase("Bisnis")){
    				harga = 60000;
    			}
    		}else{
    			if(kelas.equalsIgnoreCase("Ekonomi")){
    				harga = 0;
    			}else if(kelas.equalsIgnoreCase("Bisnis")){
    				harga = 0;
    			}
    		}
    		
    		bayar = jml*harga;
    		
    		System.out.println("Nama Pembeli = "+nama);
    		System.out.println("Jurusan      = "+jurusan);
    		System.out.println("Kelas        = "+kelas);
    		System.out.println("Jumlah Tiket = "+jml);
    		System.out.println("Harga        = "+harga);
    		System.out.println("Jumlah Bayar = "+bayar);
    }
}
