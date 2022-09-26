package Percabangan;
import java.util.Scanner;
public class BankATM {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int saldo = 100000;
        int uang;
        System.out.println("Selamat Datang di Bank");
        System.out.println("Saldo saat ini = Rp."+saldo);
        System.out.println("Menu :");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Ambil Uang");
        System.out.println("3. Simpan Uang");
        System.out.println("Cukup ketik angka menu saja");
        int pertanyaan1 = input.nextInt();
        if (pertanyaan1 == 1){
            System.out.println("Sisa saldo = Rp." + saldo);
            System.out.println("Terima kasih sudah bertransaksi");
        }
        else if(pertanyaan1 == 2){
            System.out.println("Masukkan saldo yang ingin daimbil");
            int ambil = input.nextInt();
            int ya = saldo - ambil;
            if (ya < 0){
                System.out.println("Maaf, saldo tidak mecukupi");
            }
            else {
                System.out.println("Sisa saldo = Rp." + ya);
            }
        }
        else if (pertanyaan1 == 3){
            System.out.println("Masukkan jumlah uang");
            int nabung = input.nextInt();
            int nabung1 = saldo + nabung;
            System.out.println("Saldo anda = Rp."+ nabung1);
        }
        else {
            System.out.println("Maaf, menu yang anda masukkan salah");
        }
    }
    
}


    

