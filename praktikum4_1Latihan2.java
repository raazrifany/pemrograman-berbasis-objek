import java.util.Scanner;
public class praktikum4_1Latihan2{
	public static void main(String args[]){
		int batasAkhir, i;
		Scanner inputData = new Scanner(System.in);
		System.out.print("Batas Akhir : "); batasAkhir = inputData.nextInt();
		
		for(i=1; i<=batasAkhir; i++){
			if(i%2==1){
				System.out.println("Looping ke-"+i);
			}
		}
	}
}