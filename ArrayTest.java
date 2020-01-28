import java.util.Arrays;
import java.util.Scanner;

/**
 * ArrayTest
 */
public class ArrayTest {

    public static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.print("원하시는 기능의 숫자를 입력해주세요. : ");
            Scanner scanner = new Scanner(System.in);
            int selectNum = scanner.nextInt();

            if (selectNum == 1) {// 최소
                int[] arr = inputArraySize(scanner);
                arrAsc(arr);
                System.out.println("최소값은 : " + arr[0]);
            } else if (selectNum == 2) {// 최대
                int[] arr = inputArraySize(scanner);
                arrAsc(arr);
                System.out.println("최대값은 : " + arr[arr.length - 1]);
            } else if (selectNum == 3) {// 오름차순
                int[] arr = inputArraySize(scanner);
                arrAsc(arr);
                System.out.println(Arrays.toString(arr));
            } else if (selectNum == 4) {// 내림차순
                int[] arr = inputArraySize(scanner);
                arrDesc(arr);
                System.out.println(Arrays.toString(arr));
            } else if (selectNum == 5) {// 모두
                int[] arr = inputArraySize(scanner);
                arrAsc(arr);
                System.out.println("최소값은 : " + arr[0]);
                System.out.println("최대값은 : " + arr[arr.length - 1]);
                System.out.println(Arrays.toString(arr));
                arrDesc(arr);
                System.out.println(Arrays.toString(arr));
            } else if (selectNum == 6) {// 로또
                lottoPrint();
            } else if (selectNum == 7) {// 종료
                break;
            }
        }
    }

    // 메뉴를 출력해준다.
    public static void printMenu() {
        System.out.println("간단한 배열예제 프로그램!");
        System.out.println("1.최소 값");
        System.out.println("2.최대 값");
        System.out.println("3.오름차순 정렬");
        System.out.println("4.내림차순 정렬");
        System.out.println("5.모두 출력");
        System.out.println("6.로또 번호 출력");
        System.out.println("7.프로그램 종료");
    }

    // 배열을 만들어 리턴한다.
    public static int[] inputArraySize(Scanner scanner) {
        // 배열 크기를 받아와 정의해준다.
        System.out.print("배열의 크기를 입력해주세요. : ");
        int[] arr = new int[scanner.nextInt()];
        System.out.println("배열에 들어갈 숫자를 입력해주세요.");
        // 배열로 반복하면서 정의해준다.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "번째 : ");
            arr[i] = scanner.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("이미 입력한 숫자는 입력할 수 없습니다.");
                    i--;
                }
            } // End for j
        } // End for i

        return arr;
    }

    // 넘어온 배열을 오름차순 해준다.
    public static void arrAsc(int[] arr) {
        // 배열의 순서를 변경해줄 때 임시로 쓰는 변수
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            } // End for j
        } // End for i
    }

    // 넘어온 배열을 오름차순 해준다.
    public static void arrDesc(int[] arr) {
        // 배열의 순서를 변경해줄 때 임시로 쓰는 변수
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            } // End for j
        } // End for i
    }

    public static void lottoPrint() {
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 45 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    i--;
            } // End for j
        } // End for i

        System.out.println(Arrays.toString(arr));
    }
}