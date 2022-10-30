package transports;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль начал движение");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Автомобиль закончил движение");
    }

    @Override
    public String toString() {
        return "Автомобиль: " + super.toString();
    }

    @Override
    public void getPitStop() {
        System.out.println("Сделать остановку машине");
    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время круга машины");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость  машины за круг ");
    }
}
