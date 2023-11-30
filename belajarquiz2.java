import javax.swing.*;
public class belajarquiz2 {
    public static void main(String args[]) {
    	String[] nim = new String[10]; 
    	String[] nama = new String[10]; 
    	int[] uts = new int[10]; 
    	int[] uas = new int[10]; 
    	double[] nilaiAkhir = new double[10];
    	char[] index = new char[10];
    	String jawab;
    		
    	System.out.println("============================================");
    	System.out.println("No NIM\tNama\tUTS\tUAS\tNilai Akhir\tIndex");
    	System.out.println("============================================");
    	
    	//input data
    	int i=0;
    	do{
    		nim[i] = JOptionPane.showInputDialog("NIM : ");
    		nama[i] = JOptionPane.showInputDialog("Nama : ");
    		uts[i] = Integer.valueOf(JOptionPane.showInputDialog("Nilai UTS : "));
    		uas[i] = Integer.valueOf(JOptionPane.showInputDialog("Nilai UAS : "));
    		
    		nilaiAkhir[i] = (uts[i]*0.5) + (uas[i]*0.5);
    		if(nilaiAkhir[i] >= 80 && nilaiAkhir[i] <=100){
    			index[i]='A';
    		}else if(nilaiAkhir[i]>=70 && nilaiAkhir[i]<80){
    			index[i]='B';
    		}else if(nilaiAkhir[i]>=55 && nilaiAkhir[i]<70){
    			index[i]='C';
    		}else if(nilaiAkhir[i]>=40 && nilaiAkhir[i]<55){
    			index[i]='D';
    		}else if(nilaiAkhir[i]>=0 && nilaiAkhir[i]<40){
    			index[i]='E';
    		}else{
    			index[i]='-';
    		}
    		
    		i++;
    		jawab = JOptionPane.showInputDialog("Input lagi? : ");
    	}while(jawab.equalsIgnoreCase("Y"));
    	
    	//output
    	for(int j=0; j<i; j++){
    		System.out.print(j+1);
    		System.out.print("  "+nim[j]);
    		System.out.print("\t"+nama[j]);
    		System.out.print("\t"+uts[j]);
    		System.out.print("\t"+uas[j]);
    		System.out.print("\t\t"+nilaiAkhir[j]);
    		System.out.println("\t"+index[j]);
    	}
    }
}