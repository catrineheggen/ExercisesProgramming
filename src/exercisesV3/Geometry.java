package exercisesV3;

public class Geometry {
    static void main(String[] args) {

        Circle circle = new Circle(10); // skapar objektet
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());


        if(circle.hasSmallArea()) {
            System.out.println("Det är en liten area");
        } else {
            System.out.println("Det är en stor area");
        }

        Rectangle rectangle = new Rectangle(8, 8);
        System.out.println(rectangle.area());
        System.out.println(rectangle.circumference());

        /*if(rectangle.isSquare()){
            System.out.println("Det är en kvadrat");

        } else {
            System.out.println("Det är INTE en kvadrat");
        }*/

    }
}
