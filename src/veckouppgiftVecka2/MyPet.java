package veckouppgiftVecka2;

public class MyPet {
    private String name; //attribut
    private int hunger;
    private int energy;
    private int happiness;

    public MyPet(String mypetName, int mypetHunger, int mypetEnergy, int mypetHappiness) {
        name = mypetName;
        hunger = mypetHunger;
        energy = mypetEnergy;
        happiness = mypetHappiness;
    }

    public void printInfo() {
        System.out.println("Namn: " + name);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energi: " + energy);
        System.out.println("Glädje: " + happiness);
        System.out.println("Välmående: " + (energy + happiness - hunger));
    }

    public void nyDag() {
        hunger = hunger + 5;
        energy = energy - 3;
    }

    public int getHunger(){
        return hunger;
    }

    public int getEnergy(){
        return energy;
    }

    public void petFeeling(){
        if (hunger > 50){
            System.out.println("Djuret är hungrigt!");
        }
        if (energy < 20){
            System.out.println("Djuret är trött!");
        }
        if (happiness >= 50){
            System.out.println("Djuret är glad!");
        } else {
            System.out.println("Djuret är ledset.");
        }

    }

}


