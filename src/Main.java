import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,total=0,i=0;
        Scanner inp =new Scanner(System.in);
        do {
            System.out.print("Bir sayı giriniz:");
            n = inp.nextInt();
            if (n%2==0) {
                total += n;
                i++;
            }
        }while (n%2==0);
        System.out.print("Girilen çift sayıların ortalaması:" + (total/i));
        }



    }
