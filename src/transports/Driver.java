package transports;

public abstract class Driver<T extends Transport & Competing> {

    private final String fullName;
    private final Character driverLicense;
    private double experience;
    private T licenseCar;

    protected Driver(String fullName, Character driverLicense, double experience, T licenseCar) {
        if (fullName == null || fullName.isEmpty()) {
            throw new NullPointerException("Укажите ФИО водителя");
        } else {
            this.fullName = fullName;
        }
        if (driverLicense != 'B' && driverLicense != 'C' && driverLicense != 'D') {
            throw new IllegalArgumentException("Нет прав, иди в автошколу");
        } else {
            this.driverLicense = driverLicense;
        }
        if (licenseCar != null) {
            this.licenseCar = licenseCar;
        }
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public Character getDriverLicense() {
        return driverLicense;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        if (experience <= 0) {
            throw new NullPointerException("Иди учиться водить!");
        } else {
            this.experience = experience;
        }
    }

    public void startMoving() {
        licenseCar.startMoving();
    }

    public void stopsMoving() {
        licenseCar.stopsMoving();
    }

    public void refills() {
        System.out.println(getFullName() + "Заправляется");
    }

    public void driverInfo() {
        System.out.println("Водитель " + fullName + " управляет " + licenseCar.getBrand() + " " +
                licenseCar.getModel() + " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return "Имя водителя: " + fullName + ". Категория прав " + driverLicense + ". Опыт вождения:" + experience;
    }
}



