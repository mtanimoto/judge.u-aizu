package ITP1.ITP1_1_B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((long) Math.pow(x, 3));
        sc.close();
    }
}