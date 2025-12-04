//java is a strongly typed language.

class DataTypesExamples {
    
    int myint = 42;
    double mydouble = 189.75;
    char mychar = 'Q';
    boolean mybool = false;
}


public class DataTypes { // tester class
    public static void main(String [] args) { // code starts reading here

        DataTypesExamples dt = new DataTypesExamples();

        System.out.println("myInt: " + dt.myint);
        System.out.println("myChar: " + dt.mychar);
        System.out.println("myDouble: " + dt.mydouble);
        System.out.println("myBool: " + dt.mybool);

        
    }

}