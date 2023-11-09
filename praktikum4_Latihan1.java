import java.util.Scanner;
public class praktikum4_Latihan1 {
	public static void main(String args[]){
		int bil, i, jumlah=0;
		
		Scanner inputData = new Scanner(System.in);
		System.out.print("Masukan Banyak Bilangan : "); bil = inputData.nextInt();
		
		System.out.print("Output : ");
		for(i=1; i<=bil; i++){
			System.out.print(" "+i);
			jumlah = jumlah + i;
		}
		
		System.out.print(" = "+jumlah);
	}
}