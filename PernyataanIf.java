package Percabangan;
public class PernyataanIf {
    public static void main(String[] args) {
        int diskon = 0;
        int totalBelanja = 500000;
        if (totalBelanja >= 100000){
            diskon = 30 * totalBelanja/100;
        }
        else {
            
        }
        int total = totalBelanja-diskon;
        System.out.println("Diskon = Rp." + diskon);
        System.out.println("Total Belanja = Rp." + total);
    }
    
}
