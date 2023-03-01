import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        //basamak sayısını kullanıcıdan alan ve * lar ile ekrana ters üçgen yazdıran program.
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Basamak sayısını giriniz : ");
        number = input.nextInt();

        for (int i = number; i>=1 ; i--){
            for (int k = number - i ; k>=1 ; k--){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= 2*i-1 ; j++ ){
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
