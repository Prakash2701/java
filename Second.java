class Second {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods
        // from Main)
        System.out.println("Enter 1 name and  2 age and 3 year");
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}
