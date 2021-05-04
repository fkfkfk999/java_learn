package week6;

public abstract class Unit {
    public int vital;
    public int offensePower;
    public final String offenseType = "ground";

    Unit(){
       System.out.println("유닛을 생성합니다."); 
    }

    public void move(){
        System.out.println("이동합니다.");
    }

    public abstract void Attack();
}
