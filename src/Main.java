import transports.*;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Lada", "Granta", 1.7);
        System.out.println(car.toString());

        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        System.out.println(car1.toString());

        Car car2 = new Car("BMW", "Z8", 3.0);
        System.out.println(car2.toString());

        Car car3 = new Car("Kia", "Sportage 4 поколение", 2.4);
        System.out.println(car3.toString());

        Truck truck = new Truck("Валдай", "NEXT", 7.0);
        System.out.println(truck.toString());

        Truck truck1 = new Truck("Тонар", "7502", 19.0);
        System.out.println(truck1.toString());

        Truck truck2 = new Truck("JAC", "Sunray", 4.6);
        System.out.println(truck2.toString());

        Truck truck3 = new Truck("MAN", "TGX 4X4", 10.5);
        System.out.println(truck3.toString());

        Bus bus = new Bus("IKARUS", "417", 3.8);
        System.out.println(bus.toString());

        Bus bus1 = new Bus("VOLVO", "7900", 4.1);
        System.out.println(bus1.toString());

        Bus bus2 = new Bus("IVECO", "Urbanway 10", 3.5);
        System.out.println(bus2.toString());

        Bus bus3 = new Bus("SETRA", "Comfort Class 500", 5.0);
        System.out.println(bus3.toString());

        DriverB anton = new DriverB("Антон", 'B', 5, car);
        DriverC platon = new DriverC("Платон", 'C', 3, truck);
        DriverD simon = new DriverD("Саймон", 'D', 4, bus);

        System.out.println(anton);
        anton.driverInfo();

        System.out.println(platon);
        platon.driverInfo();

        System.out.println(simon);
        simon.driverInfo();

    }
}
