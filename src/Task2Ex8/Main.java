package Task2Ex8;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n : ");
        int n = sc.nextInt();
        int i = 1 ;
        float sum = 0;
        for(i=1;i<=n;i++)
        {
            sum = sum + (float) 1 / i ;
        }
        System.out.println("Сумма = " + sum);
    }
}


