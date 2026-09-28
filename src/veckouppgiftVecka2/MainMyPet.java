package veckouppgiftVecka2;

public class MainMyPet {
    static void main(String[] args) {
        MyPet daisy = new MyPet("Daisy", 50, 50, 80);
        daisy.printInfo();

        for (int day = 1; day <= 7; day++) {
            daisy.nyDag();
            System.out.println("Dag: " + day);
            System.out.println("Hunger: " + daisy.getHunger());
            System.out.println("Energi: " + daisy.getEnergy());
            daisy.petFeeling();
        }
    }
}