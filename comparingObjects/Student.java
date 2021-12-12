import java.util.Comparator;

public class Student implements Comparable <Student> {
    private int rollNo;
    private float marks;
    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student sagar = new Student(1, 90.99f);
        Student kc = new Student(2, 78.89f);

        if(sagar.compareTo(kc) < 0){
            System.out.println("KC has more marks");

        }
        else{
            System.err.println("SAGAR has more marks.");
        }
    }

    @Override
    public int compareTo(Student o) {
       int diff = (int) (this.marks - o.marks);
       return diff;
    }
    
    
}
