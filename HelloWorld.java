import java.util.ArrayList;
import java.util.Arrays;


public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

       var str = "Hello Var";
       var i = 33;
       var strList = new ArrayList<>();
       strList.add("Hello Var List");
       strList.add(33);
       
       for (Object object : strList) {
            System.out.println(object);
       }
    }
}