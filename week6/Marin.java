package week6;

public class Marin extends Unit {
    Marin(){
        this.vital = 40;
        this.offensePower = 6;
        this.offenseType = "air";
        System.out.println("마린을 생성합니다.");
    }

    @Override
    public void move() {
        System.out.print("마린이 ");
        super.move();
    }

    @Override
    public void Attack() {
        System.out.println("마린이 스팀팩으로 공격합니다.");
    }
}
