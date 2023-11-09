import java.util.Scanner;
public class praktikum4_2Latihan1 {
	public static void main(String args[]){
		int i=1, batasAkhir;
		
		Scanner inputData = new Scanner(System.in);
		System.out.print("Batas Akhir : "); batasAkhir = inputData.nextInt();
		
		while(i<=batasAkhir){
			System.out.println("Looping ke-"+i);
			i++;
		}
	}
}