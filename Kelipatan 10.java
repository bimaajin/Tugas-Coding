package PraktikumIII;
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        int nilai,hnilai;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan angka");
        nilai = input.nextInt();
        hnilai = nilai % 10;
        if (nilai == 0){
            System.out.println("Salah");
        }
        else if (hnilai == 0){
            System.out.println("Benar");
        }
        else{
            System.out.println("Salah");
        }
    }
}
