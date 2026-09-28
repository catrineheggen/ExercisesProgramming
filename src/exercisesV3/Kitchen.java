package exercisesV3;

public class Kitchen {

    public static void main(String[] args) {

        Lamp lamp = new Lamp(false);

        if(lamp.getIsOn()) {
            System.out.println("Lampan lyser");
        } else {
            System.out.println("Lampan är släckt");
        }

        lamp.turnOn();

        if(lamp.getIsOn()) {
            System.out.println("Lampan lyser");
        } else {
            System.out.println("Lampan är släckt");
        }

        lamp.turnOff();

        if(lamp.getIsOn()) {
            System.out.println("Lampan lyser");
        } else {
            System.out.println("Lampan är släckt");
        }


    }

}