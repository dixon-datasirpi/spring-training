//1. No argument Constructor
public class Constructor {

   Constructor() {
       System.out.println("this is no argument constructor");
   }

   public static void main(String[] args) {
       Constructor constructor = new Constructor();
   }
}

// 2. parameterized constructor
public  class Constructor {

   Constructor(String message) {
       System.out.println("Message :"+ message);
   }

   public static void main(String[] args) {
       Constructor constructor = new Constructor("Welcome to Full stack training session");

   }
}