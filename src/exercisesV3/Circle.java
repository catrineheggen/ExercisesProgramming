package exercisesV3;

public class Circle {

    private double radius; //attribut

    public Circle(double radius) {   // konstruktor
        this.radius = radius;
    }

    // Metod som returnerar cirkelns area
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    //Metod som returnerar cirkelns omkrets
    public double calculateCircumference() {
        return 3.14 * radius * 2;
    }

    public boolean hasSmallArea() {
        return ((3.14 * radius * radius) < (3.14 * radius * 2));
    }  //return ger här en true/false direkt utan if/else

    // Lägg till en metod hasSmallArea
    //som kontrollerar om arean är mindre än omkretsen av cirkeln
    //metodNamn? calculateArea
    //datatyp?   double
    //värde?    area: pi*r*r/3.14*r*r/2*math.PI*radius
    //     omkrets 2 × pi × r

    //metodNamn? hasSmallArea
    //datatyp?   boolean
    //värde?    (3.14*radius*radius) < (3.14 * radius * 2)
    //           radius < 2

}
