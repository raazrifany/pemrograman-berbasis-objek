import java.util.Scanner;
public class materi3_latihan1 {
    public static void main(String args[]) {
    	int angka, hasilMod;
    	
    	Scanner inputData = new Scanner(System.in);
    	System.out.print("Masukan angka : "); angka = inputData.nextInt();
    	
    	/**if 
    	if(angka%2 == 0){
    		System.out.println("Angka " +angka+ " = Genap");
    	}else{
    		
    		System.out.println("Angka " +angka+ " = Ganjil");
    	}**/
    	
    	/** switch **/
    	hasilMod = angka%2;
    	switch(hasilMod){
    		case 0 : System.out.println("Angka " +angka+ " = Genap"); break;
    		case 1 : System.out.println("Angka " +angka+ " = Ganjil"); break;
    		default : System.out.println("Angka " + angka + " = Bilangan lain"); break;
    	}
    	
    	
    }
    
    
}