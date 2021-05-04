package object;
/**
 * PrintClass
 */
public class PrintClass {
    // 캡슐화 즉 변수에 직접적으로 접글하는것을 막기 위해 private를 붙여준다.
    // 보통 이렇게 정의한 변수는 public가 붙은 getter/setter을 만들어 주어 접근한다.
    // 보통 정보를 은닉하기 위해 변수를 받을 때 무결성을 지키기 위해 사용한다고 한다.
    // 객체지향적인 개발을 한다면 private로 변수의 접근을 막고 필요한 데이터에만 getter/setter 메소드를 생성해
    // 접을을 제어한다는 장점이 있겟지만 현실은 모든 변수에 getter/setter을 만들어주기 때문에 무슨의미가 있나 싶기도하다.
    private String name;
    private int age;

    public PrintClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("이름은 : " + name);
        System.out.println("나이는 : " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}