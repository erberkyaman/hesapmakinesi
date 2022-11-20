import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        int n1,n2,selection;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz:");
        n1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        n2=input.nextInt();

        System.out.println("****İşlem Seçimi Yapın****");
        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        selection=input.nextInt();

        switch (selection){
            case 1:
                System.out.print("İşlem Sonucu:"+(n1+n2));
                break;
            case 2:
                System.out.print("İşlem Sonucu:"+(n1-n2));
                break;
            case 3:
                System.out.print("İşlem Sonucu:"+(n1*n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.print("İşlem Sonucu:"+(n1/n2));
                }else {
                    System.out.print("Bir Sayı Sıfıra Bölünemez!");
                }

                break;
            default:
                System.out.print("Hatalı İşlem Seçimi Yapıldı!");
        }

    }
}
