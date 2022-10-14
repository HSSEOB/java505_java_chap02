import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("논리 연산을 입력하세요 >> ");
        boolean A = scanner.nextBoolean();
        String logig = scanner.next();
        boolean B = scanner.nextBoolean();

        switch(logig) {
            case "AND":
                System.out.println(A&B);
                break;
            case "OR":
                System.out.println(A||B);
                break;
        }
        scanner.close();
    }
}
