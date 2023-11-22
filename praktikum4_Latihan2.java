import java.util.Scanner;
public class praktikum4_Latihan2 {
    public static void main(String args[]) {
        int saldoAwal, bunga, waktu, i, saldoAkhir, jml_bunga = 0;

        Scanner inputData = new Scanner(System.in);

        System.out.print("Saldo Awal : "); saldoAwal = inputData.nextInt();
        System.out.print("Bunga : "); bunga = inputData.nextInt();
        System.out.print("Waktu : "); waktu = inputData.nextInt();

        for (i = 1; i <= waktu; i++) {
            saldoAkhir = saldoAwal + (saldoAwal * bunga / 100);
            System.out.println("Saldo Bulan " + i + " = " + saldoAkhir);
            saldoAwal = saldoAkhir; // Update saldoAwal untuk iterasi berikutnya
        }
    }
}
