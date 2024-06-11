package Ch1;

public class Ex19_반복문_for {
    /*
    *   반복문: 같은 작업을 같은 자리에서 반복해서 실행
    *           
    *           for문은 몇번 반복해야 할지 알때 주로 사용(while문은 모를때 주로 사용)
    *
    *       1) for(초기식; 조건식; 증감식) { }
    *               ex) for(int i=0; i<??; i++) { }
    *
    *       2) 향상된 for문 (forEach)
    *           for문 처럼 초기식, 조건식, 증감식 을 정의하지 않아도 콜백함수를 통해 기능을 수행할 수 있음.
    *           forEach문은 오직 배열에서만 사용 가능.
    *
    *           for(변수타입 변수명 : 배열) { }
    * */
    public static void main(String[] args) {
        for(double i = 1; i <= 10; i++) {
//            System.out.println(i);
            System.out.printf("%.2f", i);
            System.out.println(" ");
        }

        int[] arr = {1,2,3,4,5};
        int idx = 0;
        for(int num : arr) {
            System.out.println(num +", " + idx++);
        }


    }
}





















