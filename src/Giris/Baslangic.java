package Giris;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ogrenci ismini giriniz");
        String isim = input.nextLine();

        System.out.println("Matematik notunu giriniz");
        int mat = input.nextInt();

        System.out.println("Fizik notunu giriniz");
        int fizik = input.nextInt();

        System.out.println("Kimya notunu giriniz");
        int kimya = input.nextInt();

        System.out.println("Turkce notunu giriniz");
        int tr = input.nextInt();

        System.out.println("Tarih notunu giriniz");
        int tarih = input.nextInt();

        System.out.println("Muzik notunu giriniz");
        int muzik = input.nextInt();

        double ort = (mat + fizik + kimya + tr + tarih + muzik) / 6;

        System.out.println(isim + " adli ogrencinin not artalamasi: " + ort);

        boolean gecti = ort > 60;
        String str = gecti ? "Sinifi Gecti":"Sinifta Kaldi";
        System.out.println(str);







    }
}
