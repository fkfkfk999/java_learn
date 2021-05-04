package week6;

public class SiegeTank extends Unit {
    SiegeTank(){
        this.vital = 150;
        this.offensePower = 30;
        System.out.println("시즈탱크를 생성합니다.");
    }

    @Override
    public void move() {
        System.out.print("탱크가 ");
        super.move();
    }

    @Override
    public void Attack() {
        System.out.println("탱크가 시즈모드로 공격합니다.");
    }
}
