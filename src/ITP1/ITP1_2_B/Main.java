package ITP1.ITP1_2_B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a < b && b < c ? "Yes" : "No");
        sc.close();
    }
}
