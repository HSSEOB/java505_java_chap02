import java.util.Scanner;

public class If {
    private static Scanner scan;
    public static void main(String[] args){
        scan = new Scanner(System.in);

        // if문 : 가장 많이 사용되는 조건문으로 조건식의 결과가 참일 경우 해당 코드 블럭을 실행하는 형태의 조건문.

        // 종류 -

        //  1.단순 if문 : 조건식의 결과가 참일 경우 해당 코드 블럭을 실행하는 형태의 조건문 -
        System.out.println("숫자를 입력하세요 : ");
        int n = scan.nextInt();

        if (n%2==0){
            System.out.println("입력된 숫자는 짝수입니다.");
        }
        System.out.println("입력한 숫자는 : " +n+"입니다.");

        //  2.if ~ else 문 : 조건식의 결과가 참일 경우 바로 아래의 코드블럭을 실행하고, 결과가 거짓일 경우엔 else 아래의 코드블럭을 실행하는 형태. -
        //  단순 if 문과는 다르게 반드시 둘 중 하나가 선택 되어야 하는 조건문.
        System.out.print("부먹 찍먹 ? ");
        String input = scan.next();

        if(input.equals("부먹")){
            System.out.println("당신은 부먹파");
        }
        else{
            System.out.println("당신은 찍먹파");
        }
        System.out.println("탕수육 존맛");

        //  3.else if 문 : 조건식이 여러개가 존재하고, 해당 조건식의 결과가 참인 코드블럭을 실행하는 형태 -
        // 조건식을 여러개 사용하기에 단계별로 조건식을 설정해야 함. 그렇지 않으면 문법적으론 문제가 없으나 의도와는 다른 결과를 얻을 수 있다.
        // 마지막에 존재하는 else 문은 생략 가능하다. else 구문으로 갈 수 없도록 모든 조건을 다 입력한 경우가 해당.
        // 만약 else문으로 빠지는 경우 아무른 처리를 하지 않는다.
        System.out.println("점수를 입력해 주세요 - ");
        int grade = scan.nextInt();

        if (grade>=90){
            System.out.println("당신의 점수는 "+grade+"이고, 평가는 A 입니다.");
        }
        else if (grade>=80) {
            System.out.println("당신의 점수는 "+grade+"이고, 평가는 B 입니다.");
        }
        else if (grade>=70) {
            System.out.println("당신의 점수는 "+grade+"이고, 평가는 C 입니다.");
        }
        else if (grade>=60) {
            System.out.println("당신의 점수는 "+grade+"이고, 평가는 D 입니다.");
        }
        else {
            System.out.println("당신의 점수는 "+grade+"이고, 평가는 F 입니다.");
        }


        // 4. 중첩 if 문 : if, if~else, else if 문의 코드블럭에 if문을 사용하는 방식 -
        System.out.println("\n---------중첩 if 문 ------------\n");
        int grade1 = scan.nextInt();

        if (grade1 >= 90) {
            System.out.println("당신의 점수는 \"+grade+\"이고, 평가는 A 입니다.");
        }
        else {
            if(grade1>80) {
                System.out.println("당신의 점수는 \"+grade+\"이고, 평가는 B 입니다.");
            }
            else {
                if(grade1>=70) {
                    System.out.println("당신의 점수는 \"+grade+\"이고, 평가는 C 입니다.");
            }
                else {
                    if(grade1>=60){
                        System.out.println("당신의 점수는 \"+grade+\"이고, 평가는 D 입니다.");
                    }
                    else System.out.println("당신의 점수는 \"+grade+\"이고, 평가는 F 입니다. 낙제입니다");
                }
            }
        }



        scan.close();
    }
}
