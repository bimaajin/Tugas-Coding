package PraktikumIII;
import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int p1,p2=0,mminum,minuman,harga,diskon10,diskon5,tdiskon,total1,total2;
        minuman = 10000;
        System.out.println("Menu \n1. Beli minuman \n2. Keluar");
        p1 = input.nextInt();
       
        if (p1 == 1){
            System.out.println("Masukkan jumlah minuman yang ingin anda beli");
            p2 = input.nextInt();
             harga = minuman * p2;
             diskon10 = harga * 10/100;
             total1 = harga - diskon10;
             diskon5 = harga * 5/100;
            if (p2 > 5){
                System.out.println("Anda membeli minuman sebanyak "+p2+" buah \n dengan total harga Rp. "+ harga +" dan potongan Rp. "+diskon10+"\n total belanja keseluruhan Rp. "+total1);
            }
            else if (harga > 30000 && harga < 50000){
                System.out.println("Anda membeli minuman sebanyak "+p2+" buah \n dengan total harga Rp. "+harga+" dan potongan Rp. "+diskon5+"\n total belanja keseluruhan Rp. "+total1);
            }
            else {
                System.out.println("Anda membeli minuman sebanyak "+p2+" buah \n dengan total harga Rp. "+harga+" dan potongan Rp.0\n total belanja keseluruhan Rp. "+harga);
            }
        }
        else if (p1 == 2){
            System.out.println("Anda keluar dari program");
        }
        else {
            System.out.println("Menu tidak tersedia");
        }
    }
}
