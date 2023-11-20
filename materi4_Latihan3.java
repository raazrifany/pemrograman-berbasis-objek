import java.util.Scanner;
public class materi4_Latihan3 {
    public static void main(String args[]) {
    	int bunga, waktu; double saldoAwal;
    	
    	Scanner inputData = new Scanner(System.in);
    	
    	System.out.print("Saldo Awal"); saldoAwal = inputData.nextDouble();
    	System.out.print("Bunga"); bunga = inputData.nextInt();
    	System.out.print("Waktu"); waktu = inputData.nextInt();
    	
    	for (i = 1; i <= waktu; i++) {
            saldoAkhir = saldoAwal + (saldoAwal * bunga / 100);
            System.out.println("Saldo Bulan " + i + " = " + saldoAkhir);
            saldoAwal = saldoAkhir; // Update saldoAwal untuk iterasi berikutnya
        }
    }
}