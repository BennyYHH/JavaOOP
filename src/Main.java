import school.Student;
public class Main {
    public static void main(String[] arg){
        Student student = new Student("Benny", 22, "male", 1597538426);
        System.out.println("Student Name:" + student.getName());
        System.out.println("Student Age:" + student.getAge());
        System.out.println("Student Gender:" + student.getGender());
        System.out.println("Student ID:" + student.getId());
    }
}
