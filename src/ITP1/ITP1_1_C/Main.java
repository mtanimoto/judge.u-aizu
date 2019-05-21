package ITP1.ITP1_1_C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("%d %d\n", x * y, x * 2 + y * 2);
        sc.close();
    }
}