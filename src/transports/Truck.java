package transports;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("начать движение");
    }

    @Override
    public void finishTheMovement() {

        System.out.println("закончить движение");
    }

    @Override
    public String toString() {
        return "Грузовик: " + super.toString();
    }

    @Override
    public void getPitStop() {
        System.out.println("Сделать остановку грузовику");
    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время круга грузовика");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость грузовика за круг ");
    }
}


