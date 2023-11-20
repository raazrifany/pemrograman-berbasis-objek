import java.util.Scanner;
public class materi4_Latihan2 {
    public static void main(String args[]) {
    	int bil, i, jml=0;
    	Scanner inputData = new Scanner(System.in);
    	
    	System.out.print("Masukan Banyak Bilangan : ");
    	bil = inputData.nextInt();
    	
    	System.out.print("Output : ");
    	for(i=1; i<=bil; i++){
    		System.out.print(" "+i);
    		jml = jml + i;
    	}
    	
    	System.out.print(" = "+jml);
    	
    }
}