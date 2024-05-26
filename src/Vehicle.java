public class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;

    int getRange() {
        int range = fuelCap * mpg;
        return range;
    }
}

/*class VehicleDemo {
      public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        range = minivan.fuelCap * minivan.mpg;
        System.out.println("Минивен может перевести " + minivan.passengers + " пассажиров"
                + " на расстояние " + range + " миль.");

    }
} */

class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelCap = 14;
        sportCar.mpg = 12;

        range1 = minivan.fuelCap * minivan.mpg;
        range2 = sportCar.fuelCap * sportCar.mpg;

        System.out.println("Минивен может перевести " + minivan.passengers + " пассажиров"
                + " на расстояние " + range1 + " миль.");
        System.out.println("Минивен может перевести " + minivan.passengers + " пассажиров"
                + " на расстояние " + range2 + " миль.");
    }
}
