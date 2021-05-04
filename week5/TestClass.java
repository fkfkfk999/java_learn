package week5;

public class TestClass {
    public static void main(String[] args) {
        Student ce = new Student();
        ce.math = 80;
        ce.english = 70;
        ce.science = 90;
        System.out.println("평균정수 : " + ce.getAvg());
    }
}
