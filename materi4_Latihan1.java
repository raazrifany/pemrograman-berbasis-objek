import java.util.Scanner;
public class materi4_Latihan1 {
    public static void main(String args[]) {
    	int angka, i, bil;
    	System.out.println("=== For ===");
    	
    	Scanner inputData = new Scanner(System.in);
    	
    	System.out.print("Masukan Banyak Bilangan: ");
    	angka =  inputData.nextInt();
    	
    	System.out.print("Output =");
    	for(i=1; i<=angka; i++){
    		if(i%2==0){
    			System.out.print(" "+i);
    		}
    	}
    	
    	System.out.println("\n\n=== While ===");
    	
    	System.out.print("Masukan Banyak Bilangan: ");
    	bil =  inputData.nextInt();
    	
    	System.out.print("Output =");
    	i=1;
    	while(i<=bil){
    		if(i%2==0){
    			System.out.print(" "+i);
    		}
    		i++;
    	}
    } 
}