package veckoUppgiftVecka4;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ParkingMeterTest {

    @Test
    public void testParking60Minutes() {
        // Skapar ett OBJEKT av klassen ParkingMeter
        // ParkingMeter() = konstruktorn
        ParkingMeter parking = new ParkingMeter();
        // Anropa metoden calculatePrice och spara resultatet i variabeln actual
        // 60 = argumentet
        // actual = lokal variabel där returvärdet sparas
        int actual = parking.calculatePrice(60);


        // ASSERT / kontroll
        // 15 = förväntat resultat
        // actual = faktiskt resultat
        assertEquals(15, actual);
    }
    @Test
    public void testParking30Minutes() {
        // Skapar ett OBJEKT av klassen ParkingMeter
        // ParkingMeter() = konstruktorn
        ParkingMeter parking = new ParkingMeter();
        // Anropa metoden calculatePrice och spara resultatet i variabeln actual
        // 30 = argumentet
        // actual = lokal variabel där returvärdet sparas
        int actual = parking.calculatePrice(30);

        // ASSERT / kontroll
        // 0 = förväntat resultat
        // actual = faktiskt resultat
        assertEquals(0, actual);
    }
    @Test
    public void testParking120Minutes() {
        // Skapar ett OBJEKT av klassen ParkingMeter
        // ParkingMeter() = konstruktorn
        ParkingMeter parking = new ParkingMeter();
        // Anropa metoden calculatePrice och spara resultatet i variabeln actual
        // 120 = argumentet
        // actual = lokal variabel där returvärdet sparas
        int actual = parking.calculatePrice(120);

        // ASSERT / kontroll
        // 30 = förväntat resultat
        // actual = faktiskt resultat
        assertEquals(30, actual);
    }
    @Test
    public void testParking180Minutes() {
        // Skapar ett OBJEKT av klassen ParkingMeter
        // ParkingMeter() = konstruktorn
        ParkingMeter parking = new ParkingMeter();
        // Anropa metoden calculatePrice och spara resultatet i variabeln actual
        // 180 = argumentet
        // actual = lokal variabel där returvärdet sparas
        int actual = parking.calculatePrice(180);

        // ASSERT / kontroll
        // 45 = förväntat resultat
        // actual = faktiskt resultat
        assertEquals(45, actual);
    }
    @Test
    public void testParking121Minutes() {
        // Skapar ett OBJEKT av klassen ParkingMeter
        // ParkingMeter() = konstruktorn
        ParkingMeter parking = new ParkingMeter();
        // Anropa metoden calculatePrice och spara resultatet i variabeln actual
        // 121 = argumentet
        // actual = lokal variabel där returvärdet sparas
        int actual = parking.calculatePrice(121);

        // ASSERT / kontroll
        // 45 = förväntat resultat
        // actual = faktiskt resultat
        assertEquals(45, actual);
    }
    @Test
    public void testParkingMaxPrice() {
        // Skapar ett OBJEKT av klassen ParkingMeter
        // ParkingMeter() = konstruktorn
        ParkingMeter parking = new ParkingMeter();
        // Anropa metoden calculatePrice och spara resultatet i variabeln actual
        // 420 = argumentet
        // actual = lokal variabel där returvärdet sparas
        int actual = parking.calculatePrice(420);

        // ASSERT / kontroll
        // 100 = förväntat resultat
        // actual = faktiskt resultat
        assertEquals(100, actual);
    }
    @Test
    public void testParking0Minutes() {
        // Skapar ett OBJEKT av klassen ParkingMeter
        // ParkingMeter() = konstruktorn
        ParkingMeter parking = new ParkingMeter();
        // Anropa metoden calculatePrice och spara resultatet i variabeln actual
        // 0 = argumentet
        // actual = lokal variabel där returvärdet sparas
        int actual = parking.calculatePrice(0);

        // ASSERT / kontroll
        // 0 = förväntat resultat
        // actual = faktiskt resultat
        assertEquals(0, actual);
    }
    @Test
    public void testParkingNegativeMinutes() {
        // Skapar ett OBJEKT av klassen ParkingMeter
        // ParkingMeter() = konstruktorn
        ParkingMeter parking = new ParkingMeter();
        // Anropa metoden calculatePrice och spara resultatet i variabeln actual
        // -30 = argumentet
        // actual = lokal variabel där returvärdet sparas
        int actual = parking.calculatePrice(-30);

        // ASSERT / kontroll
        // -1 = förväntat resultat
        // actual = faktiskt resultat
        assertEquals(-1, actual);
    }

}
