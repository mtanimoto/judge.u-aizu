package ITP1.ITP1_4_A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d %d %f\n", a / b, a % b, Double.valueOf(a) / Double.valueOf(b));
        sc.close();
    }

}
