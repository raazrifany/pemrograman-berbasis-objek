import java.util.Scanner;
public class praktikum4_2Latihan2 {
	public static void main(String args[]){
		int i=1, batasAkhir;
		
		Scanner inputData = new Scanner(System.in);
		System.out.print("Batas Akhir : "); batasAkhir = inputData.nextInt();
		
		while(i<=batasAkhir){
			if(i%2==0){
				System.out.println("Looping ke-"+i);
			}
			i++;
		}
	}
}