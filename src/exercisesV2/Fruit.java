package exercisesV2;

public class Fruit {

    // Skapa ett attribut
    // som heter color
    // och som innehåller fruktens färg inskrivet i text.

    // definition av attribut:
    // private datatyp variabelnamn; anger inget värde
    //         (datatyp variabelnamn = värde;)

    //definition av en konstruktor utan parametrar
    //public klassNamn() {
    // attributNamn = parameterNamn;


    private String color;
    public Fruit(){
        color = "red";
    }

    //definition av en konstruktor med parametrar
    //public klassNamn(dataTyp parameterNamn) {
    // attributNamn = parameterNamn;
    //}
    // ge color ett värde

    public Fruit(String myColor) {
        color = myColor;

    }
    // Metod som inte returnerar något(bara gör saker)
    // public void metodNamn()
    // }
    public void print(){
        System.out.println("Fruktens färg är: " + color);
    }


}
