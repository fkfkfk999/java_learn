/**
 * ScopeTest
 */
public class ScopeTest {
    String id = "fkfkfk9";
    int age = 33;
    static String nickName = "네파리안";
    
    public void printInfo() {
        int checkAge = 19;
        System.out.println("별칭 : " + nickName);
        System.out.println("아이디 : " + id);
        if(checkAge < age) System.out.println("성인입니다.");
    }
}
