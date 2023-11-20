import javax.swing.*;
public class materi6_Latihan1 {
    public static void main(String args[]) {
    	String[] nim = new String[10];
    	String[] nama = new String[10];
    	String[] index = new String[10];
    	int[] uts = new int[10];
    	int[] uas = new int[10];
    	double[] nilaiAkhir = new double[10];
    	String jawab; int i=0, j;
    	
    	do{	
	    	nim[i] = JOptionPane.showInputDialog("NIM : ");
	    	nama[i] = JOptionPane.showInputDialog("Nama : ");
	    	uts[i] = Integer.valueOf(JOptionPane.showInputDialog("Nilai UTS : "));
	    	uas[i] = Integer.valueOf(JOptionPane.showInputDialog("Nilai UAS : "));
	    	nilaiAkhir[i] = (uts[i]*0.5) + (uas[i]*0.5);
	    	
	    	if(nilaiAkhir[i] <= 100 && nilaiAkhir[i] >= 80){
    			index[i] = "A";
	    	}else if(nilaiAkhir[i] < 80 && nilaiAkhir[i] >= 68){
    			index[i] = "B";
	    	}else if(nilaiAkhir[i] < 68 && nilaiAkhir[i] >= 56){
    			index[i] = "B";
	    	}else if(nilaiAkhir[i] < 56 && nilaiAkhir[i] >= 45){
    			index[i] = "C";
	    	}else if(nilaiAkhir[i] <45 && nilaiAkhir[i] >= 0){
    			index[i] = "D";
	    	}else{
    			index[i] = "Kesalahan input";
	    	}
	    	
	    	jawab = JOptionPane.showInputDialog("Input lagi?");
	    	i++;
    	}while(jawab.equalsIgnoreCase("Y"));
    	
	    System.out.println("===================================================================");
	   	System.out.println("No\tNIM\t\tNama\t\tUTS\t\tUAS\t\tNilai Akhir\t\tIndex");
	    System.out.println("===================================================================");
	    for(j=0; j<i; j++){
	    	System.out.println(j+"\t"+nim[j]+"\t\t"+nama[j]+"\t\t"+uts[j]+"\t\t"+uas[j]+"\t\t"+nilaiAkhir[j]+"\t\t\t"+index[j]);
	    }
	    System.out.println("===================================================================");
    }
}