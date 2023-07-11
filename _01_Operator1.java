package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2.5
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1 (나머지 연산: 몫을 나눈 나머지 값)

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6 (우선순위 *,/ -> +,-)
        System.out.println((2 + 2) * 2); // 8 (우선순위 () -> * )
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9 (연산 먼저 수행 후 val 출력)
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10 (val 먼저 출력 후 연산 실행)
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println(("대기 인원 : " + waiting++)); // 대기 인원 : 0
        System.out.println(("대기 인원 : " + waiting++)); // 대기 인원 : 1
        System.out.println(("대기 인원 : " + waiting++)); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3

            }
}
