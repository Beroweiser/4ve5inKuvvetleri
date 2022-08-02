/**
 * 4ve5inkuvvetleri
 */
import java.util.Scanner;

public class DortVeBesinkuvvetleri {

    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısı giriniz : ");
        n = input.nextInt();

        for (int i = 1,k = 1 ; i < n ;i *= 4,k *= 5){
            System.out.print("4 ün katları "+i +" ----- ");
            if (k >= n ) {
                continue;
            }
            System.out.println("5 in katları "+k);
        }
        input.close();
    }
}