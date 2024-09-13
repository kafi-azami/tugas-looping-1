package inheritance;

//Driver Class

import java.util.Scanner;
public class produkd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Berapakah objek yang akan di buat?");
        System.out.println("cd atau dvd?");
        String pilihan = in.next();
        for (int i=50; i >=1; i--){
            System.out.println(i+ ",");
        }

        //condition
        if (pilihan.equals("Cd")) {
            Cd c1 = new Cd();
            c1.print();
        } else if (pilihan.equals("Cd")){
            DVD d1 = new DVD();
            d1.print();
        } else {
            System.out.println("Input salah");
        }

    }
}
    