import java.util.Scanner;


public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println("a+b = " + c);

        c= a-b;
        System.out.println("a-b = " + c);

        c= a*b;
        System.out.println("a*b = "+ c);

        c= 10/3;
        System.out.println("10/3 = " + c);

        c = 10%3;
        System.out.println("10%3 = " + c);

/*        System.out.println("정수를 입력하세요");
        int time = scanner.nextInt(); //정수입력
        int second = time % 60;
        int minute = (time / 60)% 60;
        int hour = (time/60)/60;

        System.out.println(time+"초는");
        System.out.println(hour+"시간,");
        System.out.println(minute+"분,");
        System.out.println(second+"초입니다,");
        scanner.close();*/

        System.out.println("-------------------문자열 연결 연산자----------------------");

        System.out.println("하나의 긴 문자열을 표현하기 위해서는 String 타입의 변수에 긴 문자열을 저장하여 출력");

        System.out.println("여러개의 문자열 변수에 저장된 내용을 한줄로 표현하고 싶을 경우 사용하는 것이 문자열 연결 연산자");

        String str1 = "String 타입의 변수에 긴 문자열을 입력하여 println() 함수를 통해서 화면에 출력";
        System.out.println(str1);

        System.out.println("2개 이상의 "+ "문자열을 + 연산자를 사용하여" + "연산을 진행하면" + " 하나의 긴 문자열로 출력 됨.");

        String str2 = "2개 이상의";
        String str3 = "문자열을 + 연산자를 사용하여";
        String str4 = "연산을 진행하면";
        String str5 = " 하나의 긴 문자열로 출력 됨.";
        System.out.println(str2+str3+str4+str5);

        String str6 = str2+str3+str4+str5;
        System.out.println(str6);

        //문자열과 기본 데이터 타입을 연산 시 모두 문자열로 변환 된다.
        String str7 = "다커버린";
        String str8 = " 원숭이";
        int age = 22;
        int age2 = 28;

        System.out.println(str7 + age + "세" );
        // () 안의 데이터를 먼저 연산
        System.out.println(str7 + str8 +(age+age2) +"세" );
        // 연산자의 우선순위 때문에 왼쪽부터 차례대로 연산을 진행하여 문자열과 숫자의 연산이 먼저 발생한 뒤에 문자열과 두번째 숫자와의
        // 연산이 발생하여 다커버린 원숭이 2228세 라는 형태로 화면에 출력 된다.
        System.out.println(str7 + str8 +age+age2 +"세" );
//
        //전위 연산 혹은 후위 연산을 다른 연산식과 함계 사용할 경우 실행되는 시점이 달라진다.


        System.out.println("\n---------------------증감 연산자-------------------\n");

        int op = 10;
        System.out.println("변수 op의 값 : "+op);
        op++;
        System.out.println("op++ 이후의 값 : "+op);
        ++op;
        System.out.println("변수 ++op의 값 : "+op);
        --op;
        System.out.println("변수 --op의 값 : "+op);
        op--;
        System.out.println("변수 op--의 값 : "+op);

        System.out.println("\n");

        op =  10;
        System.out.println("현재 변수의 op의 값 : " + op);


        System.out.println("++op 실행 시 : " + ++op);
        System.out.println("현재 op의 값 : " + op);
        System.out.println("op++ 실행 시 : " + op++);
        System.out.println("현재 op의 값 : " + op);
        System.out.println("--op 실행 시 : " + op--);
        System.out.println("현재 op의 값 : " + op);
        System.out.println("op-- 실행 시 : " + --op);
        System.out.println("현재 op의 값 : " + op);

        System.out.println("\n--------------------- 비교 연산자 ------------------------------------\n");

        System.out.println('a'>'b'); //거짓
        System.out.println(3>=2); //참
        System.out.println(-1<0); //참
        System.out.println(3.45<=2); //거짓
        System.out.println(3==2); //거짓
        System.out.println(3!=2); //참

        System.out.println("\n--------------------- 논리 연산자 ------------------------------------\n");

        System.out.println(!(3!=2)); //거짓
        System.out.println((3>2)&&(3>4)); //거짓
        System.out.println((3!=2)||(-1>0)); //참
        System.out.println((3!=2)^(-1>0)); // 거짓 x 참 o . 같을 경우 거짓이고 다를 경우가 참이다.

        System.out.println("\n--------------------- 조건 연산자(3항연산자)------------------------------\n");

        int num1 = 3;
        int num2 = 5;

        System.out.println("두 수의 차는 : " + ((num1 > num2)?(num1-num2):(num2-num1)));

        System.out.println("\n--------------------- if-else 조건문------------------------------\n");

        if (num1>num2){
            System.out.println("두 수의 차는 : " + (num1 - num2));
        }
        else {
            System.out.println("두 수의 차는 : " + (num2 - num1));
        }
    }
}
