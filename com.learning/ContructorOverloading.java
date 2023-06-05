public class ContructorOverloading {
//
    int id;
    String name;
    int age;

     ContructorOverloading(int i, String userName){
        id = i;
        name = userName;
    }

     ContructorOverloading(int i, String userName, int userAge){
        id = i;
        name = userName;
        age = userAge;
    }

     ContructorOverloading(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    void  display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        ContructorOverloading constructor = new ContructorOverloading(101,"Dixon");
        ContructorOverloading constructor2 = new ContructorOverloading(101,"Dixon",26);
        ContructorOverloading constructor3 = new ContructorOverloading("Dixon", 26);
        constructor.display();
        constructor2.display();
        constructor3.display();
    }
}