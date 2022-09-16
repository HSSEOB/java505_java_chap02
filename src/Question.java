import java.util.Scanner;

public class Question {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        // 문제 1) 점수를 입력 받아 점수 및 등급을 출력하는 프로그램을 작성하세요.
        // else if 문을 사용하여 작성 -
        // A+ = 95 이상, A = 90이상, B+ = 85이상, B=80이상, C+=75이상  C= 70이상  D= 60이상, 나머지 F
        //중첩 if문을 사용하여 각각의 +대의 점수를
        System.out.println("점수를 입력하세요 - ");
        int grade = scan.nextInt();

        if (grade >= 90) {
            if (grade >= 95) {
                System.out.println("당신의 점수는 " + grade + "이고 평가는 A+ 입니다.");
            } else
                System.out.println("당신의 점수는 " + grade + "이고 평가는 A 입니다.");
        } else if (grade >= 80) {
            if (grade >= 85) {
                System.out.println("당신의 점수는 " + grade + "이고 평가는 B+ 입니다.");
            } else System.out.println("당신의 점수는 " + grade + "이고 평가는 B 입니다.");

        } else if (grade > 70) {
            if (grade >= 75) {
                System.out.println("당신의 점수는 " + grade + "이고 평가는 C+ 입니다.");
            } else System.out.println("당신의 점수는 " + grade + "이고 평가는 C 입니다.");

        } else if (grade >= 60) {
            System.out.println("당신의 점수는 " + grade + "이고 평가는 D 입니다.");

        } else System.out.println("당신의 점수는 " + grade + "이고 평가는 F 입니다.");


        System.out.println("\n----------- 실습 문제 6 ------------\n");

        System.out.println("돈의 액수를 입력하세요");
        int won = scan.nextInt();
        int a = won / 50000;
        int b = won % 50000;
        int c = b / 10000;
        int d = b % 10000;
        int e = d / 1000;
        int f = d % 1000;
        int g = f / 500;
        int h = f % 500;
        int i = h / 100;
        int j = h % 100;
        int k = j / 10;
        int l = j % 10;

        if (won >= 50000) {
            System.out.println("오만원권은 " + a + "장 " + "만원권은 " + c + "장 " + "천원권은 " + e + "장 " + "오백원은 " + g + "개" + "백원은 " + i + "개 " + "십원은 " + k + "개 " + "일원은 " + l + "개 이다.");
        }
        if (won >= 10000 & won < 50000) {
            System.out.println("만원권은 " + c + "장 " + "천원권은 " + e + "장 " + "오백원은 " + g + "개 " + "백원은 " + i + "개 " + "십원은 " + k + "개 " + "일원은 " + l + "개 이다.");
        }
        if (1000 <= won & won < 10000) {
            System.out.println("천원권은 " + e + "장 " + "오백원은 " + g + "개 " + "백원은 " + i + "개 " + "십원은 " + k + "개 " + "일원은 " + l + "개 이다.");
        }
        if (won < 1000 & won >= 500) {
            System.out.println("오백원은 " + g + "개 " + "백원은 " + i + "개 " + "십원은 " + k + "개 " + "일원은 " + l + "개 이다.");
        }
        if (won < 500 & won >= 100) {
            System.out.println("백원은 " + i + "개 " + "십원은 " + k + "개 " + "일원은 " + l + "개 이다.");
        }
        if (won < 100) {
            System.out.println("일원은 " + l + "개 이다.");
        }

        System.out.println("\n------------- 문제 7번 ----------------\n");
        System.out.print("학점을 입력하세요 >> ");
        String grade1 = scan.next();
        switch (grade1) {
            case "A":
            case "B":
                System.out.println("Excellent");
                break;
            case "C":
            case "D":
                System.out.println("Good");
                break;
            default:
                System.out.println("Bye");
        }

        System.out.println("\n------------- 문제 9번 ----------------\n");

        System.out.print("1~99 사이의 정수를 입력하세요 >> ");
        int n = scan.nextInt();
        int first = n / 10;
        int second = n % 10;
        int count = 0;

        if (first == 3 || first == 6 || first == 9) {
            if (second == 3 || second == 6 || second == 3) {
                System.out.println("박수짝짝");
            } else System.out.println("박수짝");
        }
        else
        {
            if (second == 3 || second == 6 || second == 9) {
                System.out.println("박수짝");
            }
            else System.out.println("박수없음");
        }


        System.out.println("\n------------- 문제 9-1번 ----------------\n");



        scan.close();
    }
}






