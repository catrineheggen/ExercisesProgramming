package exercisesV3;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Metod som returnerar area
    public int area() {

        return width * height;
    }

    // metod som returnerar omkrets
    public int circumference() {
        return (width + height) * 2;
    }

    // Metod som returnerar om rektangeln är en kvadrat, true/false
    public boolean isSquare() {
        if (width == height) return true;
        else return false;
    }
}
       //public datatyp metodNamn() {
        //    return värde;
         //}
         //metodNamn? area / circumference / isSquare
        //datatyp?   int  / int           / boolean
        //värde?     width*height / width+height*2 / width=height


