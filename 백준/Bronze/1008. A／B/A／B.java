import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B;
        A = sc.nextDouble();
        B = sc.nextDouble();
        System.out.printf("%.9f\n", A/B);
    }
}