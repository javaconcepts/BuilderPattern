package BuilderPattern.components;

public class Engine {

    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double vol, double mil) {
        this.volume = vol;
        this.mileage = mil;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        }
        else{
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume(){
        return volume;
    }

    public double getMileage(){
        return mileage;
    }

}
