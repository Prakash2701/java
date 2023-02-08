abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
   public void walk(){
    int legs =4;
    System.out.println ("walk on 4 legs" +"  "+legs);
   }
}

class kabutar extends Animal {
    public void walk() {
        System.out.println("walk on 2 legs");
    }
}