import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pesan = new Scanner(System.in);
        String Nama;
        int Jumlah, Pilihan, Harga = 0;

        System.out.print("Masukkan Nama : ");
        Nama = pesan.nextLine();

        System.out.println("Pilihan ");
        System.out.println("1. Nasi Goreng (Rp.15.000.00)\n2. Mie Ayam (Rp.10.000.00)\n3. Bakso (Rp.13.000.00)");
        System.out.print("Masukkan Pilihan : ");
        Pilihan = pesan.nextInt();

        System.out.print(" Jumlah Pesan : ");
        Jumlah = pesan.nextInt();

        switch (Pilihan) {
            case 1:
                System.out.println("Nasi Goreng");
                Harga = 15000;
                break;
            case 2:
                System.out.println("Mie Ayam");
                Harga = 10000;
                break;
            case 3:
                System.out.println("Bakso");
                Harga = 13000;
                break;
            default:
                System.out.println("Salah Pilih ");
                System.exit(0);
        }

        System.out.println("#===================");
        System.out.println("DATA PESANAN");
        System.out.println("Nama Pemesan : " + Nama);
        System.out.println("Pesanan : " + ((Pilihan == 1) ? "Nasi Goreng" : (Pilihan == 2) ? "Mie Ayam" : (Pilihan == 3) ? "Bakso" : "maaf salah !"));
        System.out.println("Harga : " + Harga);
        System.out.println("Jumlah Pesanan : " + Jumlah);
        System.out.println("Total Bayar : " + (Harga * Jumlah));
    }
}
