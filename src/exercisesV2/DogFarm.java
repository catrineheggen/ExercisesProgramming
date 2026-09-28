package exercisesV2;

public class DogFarm {


        public static void main(String[] args) {
            Dog dog = new Dog("Fido", "Tax", 7);
            dog.bark();

            dog.printAge();
            dog.oneYearOlder();
            dog.printAge();
            dog.setAge(736);
            dog.printAge();
            dog.oneYearOlder();
            dog.oneYearOlder();
            dog.oneYearOlder();
            dog.oneYearOlder();
            dog.printAge();
            int human = dog.getHumanAge();
            System.out.println("Human age is: " +human);
            dog.printAge();
        }

    }