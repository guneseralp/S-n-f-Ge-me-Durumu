import java.util.Scanner;

public class sinif {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        int mat, türkçe,kimya, fizik, muzik;

        System.out.print("Matematik notunu giriniz: ");
        mat= inp.nextInt();
        System.out.print("Turkce notunu giriniz: ");
        türkçe=inp.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kimya=inp.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fizik=inp.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        muzik=inp.nextInt();
        double avarage= (mat+fizik+türkçe+kimya+muzik)/5;

        if (avarage <= 55){
            System.out.println("Sınıfta kaldınız.");
            System.out.print("Ortalamanız: " + avarage);
        }
        else {
            System.out.println("Sınıfı geçtiniz.");
        }
    }
}
