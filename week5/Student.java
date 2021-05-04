package week5;

public class Student{
        String name;
        String grade;
        int math;
        int english;
        int science;
        
        public Student() {
        }
        public Student(String name, String grade, int math, int english, int science) {
                this.name = name;
                this.grade = grade;
                this.math = math;
                this.english = english;
                this.science = science;
        }        
        
        public int getAvg(){
           return (this.math + this.english + this.science)/3;
        }

        public void add(int num1, int num2){
                System.out.println(num1 + num2);
        }
        public void add(int num1, int num2, int num3){
                System.out.println(num1 + num2 + num3);
        }
        public void add(String str1, String str2){
                System.out.println(str1 + str2);
        }
        public void add(float num1, float num2){
                System.out.println(num1 + num2);
        }
}
