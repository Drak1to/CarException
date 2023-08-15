public class Car {
    private int power;
    private int year;
    private Helm helm;
    private Engine engine;

    public Car(int power, int year, Helm helm, Engine engine) {
        this.power = power;
        this.year = year;
        this.helm = helm;
        this.engine = engine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", year=" + year +
                ", helm=" + helm +
                ", engine=" + engine +
                '}';
    }
}
