import javax.swing.*;
public class materi3_latihan2 {
    public static void main(String args[]) {
    	int tugas, quiz, uts, uas; double nilaiAkhir; 
    	
    	tugas = Integer.valueOf(JOptionPane.showInputDialog("Nilai Tugas : ")); 
    	quiz = Integer.valueOf(JOptionPane.showInputDialog("Nilai Quiz : ")); 
    	uts = Integer.valueOf(JOptionPane.showInputDialog("Nilai UTS : ")); 
    	uas = Integer.valueOf(JOptionPane.showInputDialog("Nilai UAS : ")); 
    		
    	nilaiAkhir = (tugas*0.2) + (quiz*0.1) + (uts*0.3) + (uas*0.4);
    	
    	System.out.println("Nilai Tugas = " +tugas);
    	System.out.println("Nilai Quiz = " +quiz);
    	System.out.println("Nilai UTS = " +uts);
    	System.out.println("Nilai UAS = " +uas);
    	System.out.println("Nilai Akhir = " +nilaiAkhir);
    	
    	if(nilaiAkhir<= 100 && nilaiAkhir>=80){
    		System.out.println("Index = A");
    	}else if(nilaiAkhir<80 && nilaiAkhir>=70){
    		System.out.println("Index = B");
    	}else if(nilaiAkhir<70 && nilaiAkhir>=60){
    		System.out.println("Index = C");
    	}else if(nilaiAkhir<60 && nilaiAkhir>=50){
    		System.out.println("Index = D");
    	}else if(nilaiAkhir<50 && nilaiAkhir>=0){
    		System.out.println("Index = E");
    	}else{
    		System.out.println("Periksa kembali nilai yang dimasukan");
    		System.exit(0);
    	}
    	
    	
    }    
}