
// abstract clas
import java.util.Scanner;

abstract class f2 {
    Scanner myObj = new Scanner(System.in);
    public String fname = myObj.nextLine();

    public int age = myObj.nextInt();

    public abstract void study(); // abstract method
}

class Student extends f2 {

    public int graduationYear = myObj.nextInt();

    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }

}
