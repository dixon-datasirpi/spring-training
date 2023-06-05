public class DefaultContructor {
        int a= 10;
        String b = "dixon";
        float c = 2.0F;

        public static void main(String[] args) {
            DefaultContructor constructor = new DefaultContructor();
            System.out.println("Int default value :" + constructor.a);
            System.out.println("String default value :" + constructor.b);
            System.out.println("Float default value :" + constructor.c);
        }
}
