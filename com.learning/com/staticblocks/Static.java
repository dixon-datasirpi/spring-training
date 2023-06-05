package com.staticblocks;
public class Static {
        int age;
        static String name;   // static keyword

        static {
            Static.name ="Dixon";     // static block
        }

        void display(){
            System.out.println("Name :" + name);
            System.out.println("Age :" + age);
        }

        public static void main(String[] args) {
            Static user = new Static();
            Static user1 = new Static();

            user.name ="Dixon";
            user.age =25;

            user1.name = "jasber raja";
            user1.age = 12;
            user.display();
            user1.display();
        }
}
