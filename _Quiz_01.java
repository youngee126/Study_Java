package Chap_01;
/*
(실행 결과)
703번 버스
약 5분 후 도착
남은 거리 1.4km?
*/
public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 번호 (703, 상암08)
        String busNumber = "703";

        // 남은 시간 (3분, 5분)
        int minute = 5;

        // 남은 거리 (1.5km, 1.4km)
        Double Distance = 1.4;

        // 결과 출력
        System.out.println(busNumber + "번 버스" );
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + Distance + "km");
    }
}
