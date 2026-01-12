package fundamentals;
//variables are either static or instance
//they use camelCase
//allcaps are for constants

class Student{

    String studentName;
    static int studentCount = 0;
    static final String SCHOOL_NAME = "CSAEA";

    

    Student(String n) {
        studentName = n;
        System.out.println(n + " is a student at " + SCHOOL_NAME );
        studentCount++;
        System.out.println(studentCount);
    }


}

public class Variables {

    public static void main(String[] args) {
        
        new Student("Alex");
        new Student("Michael Parise");
        new Student("nick");
        new Student("watt");
        new Student("joe");
        new Student("brody");
        new Student("wyatt");
        new Student("shren");
        


    }



}
