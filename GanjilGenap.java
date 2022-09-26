package Percabangan;
import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan angka ");
        angka = input.nextInt();
        String kondisi = angka % 2 == 0?angka+"Adalah bilangan genap" : angka+" Adalah bilangan ganjil";
        System.out.println(kondisi);
    }
}
