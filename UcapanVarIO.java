package tipedata;
import java.util.Scanner;
public class UcapanVarIO {
    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan kalimat :");
        String kalimat = masukan.nextLine();       
        System.out.print("Masukan kalimat lainnya:");
        String kalimat1 = masukan.nextLine();
        System.out.println(kalimat);
        System.out.println(kalimat1);
    }
    
}
