import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double km,tutar;

        System.out.print("Mesafeyi KM Cinsinden Giriniz:");
        km=input.nextDouble();
        tutar=10 + (2.20 * km);
        tutar=(tutar<20 ? tutar=20 : tutar);
        System.out.print("Taksimetre Tutarı:" + tutar + "TL");
    }
}
