package encapsulation;

public class Enacapsulation {

        public static void main(String[] args) {
            EncapsulationModel userDetails = new EncapsulationModel();
//      \
            userDetails.setName("Dixon");
            userDetails.setAge(25);

            System.out.println(userDetails.getName());
            System.out.println(userDetails.getAge());
        }
}
