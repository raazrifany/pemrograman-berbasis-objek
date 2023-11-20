import java.util.Scanner;
public class materi5_Latihan2 {
    public static void main(String args[]) {
    	int bagiHasil, i, saldoAwal, saldoAkhir, total; String ulang;
    	
    	do{
    		Scanner inputData = new Scanner(System.in);
	    	System.out.println("\n---------------------");
	    	System.out.print("Saldo Awal : "); saldoAwal = inputData.nextInt();
	    	System.out.print("Bagi Hasil : "); bagiHasil = inputData.nextInt();
	    	System.out.print("Saldo Akhir : "); saldoAkhir = inputData.nextInt();
	    	
	    	System.out.println("======================");
	    	
	    	total=0;
	    	for(i=1; total<saldoAkhir; i++){
	    		total = saldoAwal + (saldoAwal*bagiHasil/100);
	    		System.out.println("Saldo Bulan " +i+ " = " +total);
	    		saldoAwal = total;
	    	}
	    	
	    	System.out.print("Mau hitung lagi [Y/T] : "); ulang = inputData.next();
    	}while(ulang.equalsIgnoreCase("Y"));
    }
}