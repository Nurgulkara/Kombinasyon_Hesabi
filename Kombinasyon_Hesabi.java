import java.util.Scanner;

public class Kombinasyon_Hesabi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, r;
        System.out.print("N degerini giriniz:");
        n = inp.nextInt();

        System.out.print("R degerini giriniz:");
        r = inp.nextInt();
        int faktoriyel_1 = 1;
        int faktoriyel_2 = 1;
        int faktoriyel_3 = 1;
        int fark = n - r;

        for (int i = 1; i <= n; i++) {

            faktoriyel_1 = faktoriyel_1 * i;
        }
       System.out.println("N Sayısının Faktöriyeli : " + faktoriyel_1);

        for (int j = 1; j <= r; j++) {

            faktoriyel_2 = faktoriyel_2 * j;
        }
       System.out.println("R Sayısının Faktöriyeli : " + faktoriyel_2);
        for (int k = 1; k <= fark; k++) {

            faktoriyel_3 = faktoriyel_3 * k;
        }
       System.out.println("(N-R)'nin Faktöriyeli : " + faktoriyel_3);

        int carpim = faktoriyel_2 * faktoriyel_3;
        int kombinasyon = faktoriyel_1 / carpim;

        System.out.println(n + " Sayisinin " + r + "'li" + " Kombinasyonu = " + kombinasyon);
    }

}

