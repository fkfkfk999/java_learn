package week6;

public class TestUnit {
    public static void main(String[] args) {
        Unit marin = new Marin();
        marin.move();
        marin.Attack();
        Unit tank = new SiegeTank();
        tank.move();
        tank.Attack();
    }
}
