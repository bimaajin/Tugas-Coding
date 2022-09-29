package PraktikumIII;
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double ip,sks;
        System.out.println("Masukkan IP : ");
        ip = input.nextDouble();
        if (ip >= 3.5 && ip <= 4){
            System.out.println("Jatah SKS = 24");
        }
        else if (ip >= 3 && ip < 3.5){
            System.out.println("Jatah SKS = 23");
        }
        else if (ip >= 2.75 && ip < 3){
            System.out.println("Jatah SKS = 22");
        }
        else if (ip >= 2.5 && ip < 2.75){
            System.out.println("Jatah SKS = 20");
        }
        else if (ip >= 0 && ip <2.5){
            System.out.println("Jatah SKS = 18");
        }
        else {
            System.err.println("Sistem error");
        }
    }
}
