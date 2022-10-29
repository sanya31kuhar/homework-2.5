package transports;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
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
        return "Автобус: " + super.toString();
    }

    @Override
    public void getPitStop() {
        System.out.println("Сделать остановку автобусу");
    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время круга автобуса");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость автобуса за круг ");
    }
}
