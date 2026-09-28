package exercisesV3;

public class Lamp {

    //namn:     isOn
    //datatyp:  boolean

    //attribut
    private boolean isOn;

    public Lamp(boolean isOn) {
        this.isOn = isOn;
    }
    //Konstruktorn ska ta in ett boolean-attribut isOn.

    //Skapa metoder turnOn och turnOff för att slå på och av lampan.

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean getIsOn() {
        return isOn;
    }

    //Skapa ett Lamp-objekt i main och växla mellan på och av.

}