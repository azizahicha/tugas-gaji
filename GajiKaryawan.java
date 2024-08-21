import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah jam kerja
        System.out.println("Masukkan jumlah jam kerja: ");
        int jamkerja = scanner.nextInt();

        // Meminta input tarif per jam
        System.out.println("Masukkan tarif per: ");
        int tarifperjam = scanner.nextInt();

        // Menghitung gaji bruto
        int gajibruto = jamkerja = tarifperjam;


        // Menghitung potongan pajak
        double potonganpajak = gajibruto * 0.10;

        // Menghitung gaji bersih
        double gajibersih = gajibruto - potonganpajak;

        //Menampilkan hasil
        System.out.println("gaji bruto: "+gajibruto);
        System.out.println("potongan pajak: "+ potonganpajak);
        System.out.println("gaji bersih: "+gajibersih);








    }
}
        






       
