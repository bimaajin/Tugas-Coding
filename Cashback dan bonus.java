package PraktikumIII;
import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jbarang,jumlah,bonus,total;
        System.out.println("Masukkan jumlah barang");
        jbarang = input.nextInt();
        bonus = jbarang/2;
        total = jbarang + bonus;
        int bonusb = jbarang % 5;
        int cb = jbarang % 5;
        int cashb = (jbarang/5) * 15000;
        if (jbarang >= 2){
            if (jbarang >= 5){
            System.out.println("Cashback anda = "+cashb);
            System.out.println("Anda membeli "+jbarang+" item dengan bonus sebanyak "+bonus+" item,total item yang anda dapatkan sebanyak "+total+" item ");
            }
            else {
                 System.out.println("Anda membeli "+jbarang+" item dengan bonus sebanyak "+bonus+" item,total item yang anda dapatkan sebanyak "+total+" item ");   
                    }
            
        }
        
        
    }
}
       