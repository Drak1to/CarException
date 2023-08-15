import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Car[][]cars= {

                {
                    new Car(getRandomPower(50, 250), getRandomYear(1900, 2023), new Helm(getRandomRadius(10,20), "Leather"),
                        new Engine(getRandomNumberOfCylinders(2,8))),
                        new Car(getRandomPower(50, 250), getRandomYear(1900, 2023), new Helm(getRandomRadius(10,20), "Leather"),
                                new Engine(getRandomNumberOfCylinders(2,8)))},
                {new Car(getRandomPower(50, 250), getRandomYear(1900, 2023), new Helm(getRandomRadius(10,20), "Alcantara"),
                        new Engine(getRandomNumberOfCylinders(2,8))),
                        new Car(getRandomPower(50, 250), getRandomYear(1900, 2023), new Helm(getRandomRadius(10,20), "Alcantara"),
                                new Engine(getRandomNumberOfCylinders(2,8)))}


                };
//        boolean = cars;
//        Arrays.fill(cars,true);
        System.out.println(Arrays.deepToString(cars));



        }



    public static int getRandomPower(int min, int max) throws IllegalAccessException {
        if (max <= min){
            throw new IllegalAccessException("Number of min cannot be >= than max");
        }
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
    public static int getRandomYear(int min, int max) throws IllegalAccessException {
        if (max <= min){
            throw new IllegalAccessException("Number of min cannot be >= than max");
        }
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
    public static int getRandomRadius(int min, int max) throws IllegalAccessException {
        if (max <= min){
            throw new IllegalAccessException("Number of min cannot be >= than max");
        }
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
    public static int getRandomNumberOfCylinders(int min, int max) throws IllegalAccessException {
        if (max <= min){
            throw new IllegalAccessException("Number of min cannot be >= than max");
        }
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }





}
