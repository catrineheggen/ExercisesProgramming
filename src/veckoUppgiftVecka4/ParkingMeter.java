package veckoUppgiftVecka4;


public class ParkingMeter {

    public int calculatePrice(int minutes) {
        int pricePerHour = 15;
        int maxPrice = 100;

        if (minutes < 0){
            return -1;
        }
        if (minutes < 60) {
            return 0;
        }

        int hours = minutes / 60;
        if(minutes % 60 != 0) {
            hours = hours +1;

        }
        int price = hours * pricePerHour;
        if (price >= maxPrice){
            return maxPrice;
        }

        return price;

    }

}