import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float tutar, kdvliTutar, kdvsizTutar;

        System.out.print("KDV'si hesaplanacak tutarı giriniz: ");
        tutar = input.nextFloat();

        if(tutar > 0 && tutar <= 1000) {
            kdvliTutar = ((tutar+tutar*18)/100)+tutar;
            kdvsizTutar = kdvliTutar - tutar;
            System.out.println("KDV'Li tutar:" + kdvliTutar);
            System.out.println("KDV tutarı: " + kdvsizTutar);
        } else if (tutar > 1000) {
            kdvliTutar = ((tutar+tutar*8)/100)+tutar;
            kdvsizTutar = kdvliTutar - tutar;
            System.out.println("KDV'Li tutar:" + kdvliTutar);
            System.out.println("KDV tutarı: " + kdvsizTutar);
        }


        System.out.println("KDV'siz tutar:" + tutar);


    }
}