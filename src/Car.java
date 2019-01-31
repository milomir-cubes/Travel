
public class Car {

    private String model;
    private int maxSpeed;
    private double weight;
    private String license;

    private double mileage;
    private int currentFuel;
    private int maxFuel;
    private int consumption; //per 1 km

    private int seats;
    private int currentPassengers;

    public Car() {
        this.model = "Demo";
        this.maxSpeed = 120;
        this.weight = 1000;
        this.license = "test drive";
        this.mileage = 0;
        this.maxFuel = 50;
        this.consumption = 1;
        this.currentFuel = 50;
        this.seats = 5;
        this.currentPassengers = 1;
    }

    public Car(String customModel, String customLicense) {
        this.model = customModel;
        this.license = customLicense;
    }

    public Car(String model, int maxSpeed, double weight, String license, double mileage, int currentFuel, int maxFuel, int consumption) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.license = license;
        this.mileage = mileage;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
        this.consumption = consumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void setCurrentPassengers(int currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

    public void printAttributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Maksimalna brzina: " + this.maxSpeed);
        System.out.println("Težina je: " + this.weight);
        System.out.println("Registracija: " + this.license);
        System.out.println("Kilometraža: " + this.mileage);
        System.out.println("Potrošnja: " + this.consumption);
        System.out.println("Stanje rezervoara: " + this.currentFuel);
        System.out.println("Broj putnika je: " + this.currentPassengers);
        System.out.println("Broj mesta je: " + this.seats);

        System.out.println();
    }

    public void travel(int distance) {
        if (this.currentFuel > distance * this.consumption) {
            this.mileage = this.mileage + distance;
            this.currentFuel = this.currentFuel - this.consumption * distance;
        } else {
            System.out.println("Nema dovoljno goriva za toliki put");
        }
    }

    public void fuelUp() {
        System.out.println("U automobil " + this.model + " je sipano " + (this.maxFuel - this.currentFuel) + "  litara goriva");
        this.currentFuel = this.maxFuel;
    }

    public void fuelUp2() {
        double fuiled = this.maxFuel - this.currentFuel;
        this.currentFuel = this.maxFuel;
        System.out.println("U automobil " + this.model + " je sipano " + fuiled + "  litara goriva");
    }

    /**
     * Increments number of passengers by 1.
     */
    public void getIn() {
        if (this.currentPassengers + 1 <= this.seats) {
            this.currentPassengers = this.currentPassengers + 1;
            System.out.println("Ušao je jedan putnik");
        } else {
            System.out.println("Nema dovoljno mesta");
        }
    }

    /**
     * Increments number of passengers by passed number.
     *
     * @param numberOfPassengers
     */
    public void getIn(int numberOfPassengers) {
        if (this.currentPassengers + numberOfPassengers <= this.seats) {
            this.currentPassengers = this.currentPassengers + numberOfPassengers;
            System.out.println("Ušlo je: " + numberOfPassengers);
        } else {
            System.out.println("Nema dovoljno mesta");
        }
    }

    public void getOut() {
        if (this.currentPassengers > 0) {
            this.currentPassengers = this.currentPassengers - 1;
            System.out.println("Jedan putnik je izašao. Trenutni broj: " + this.currentPassengers);
        } else {
            System.out.println("Nema više putnika u automobilu.");
        }

    }

    public void getOut(int numberOfPassengers) {
        if (this.currentPassengers >= numberOfPassengers) {
            this.currentPassengers = this.currentPassengers - numberOfPassengers;
            System.out.println(numberOfPassengers + " putnika je izašlo. Trenutni broj: " + this.currentPassengers + "\n");
        } else {
            System.out.println("Nema " + numberOfPassengers + " putnika u automobilu.\n");
        }
    }
}
