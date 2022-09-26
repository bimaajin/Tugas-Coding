package tipedata;
import java.util.Scanner;
public class LuasSegitigaIO {
    public static void main(String[] args) {
        double alas,tinggi,luas;
        Scanner input = new Scanner (System.in);
        System.out.println("Luas Segitiga");
        System.out.println("Alas =");
        alas = input.nextInt();
        System.out.println("Tinggi =");
        tinggi = input.nextInt();
        luas = (alas*tinggi)/2;
        System.out.println("Jadi, Luas Segitiga adalah " + luas);
    }
 }
