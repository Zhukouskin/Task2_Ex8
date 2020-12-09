package Task2Ex8;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n : ");
        int n = sc.nextInt();
        float sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + (float) 1 / i ;
        }
        System.out.println("Сумма = " + sum);
    }
}


