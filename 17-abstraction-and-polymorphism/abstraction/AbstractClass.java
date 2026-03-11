public class AbstractClass {
    public static void main(String[] args) {
        // Car c1 = new Car(); // Car is abstract; cannot be instantiated

        Maruti m1 = new Maruti();
        m1.start();
        m1.accelerate();
        m1.brake();
        m1.stop();

        System.out.println("--------------------------------");
        TataEV t1 = new TataEV();
        t1.start();
        t1.accelerate();
        t1.brake();
        t1.stop();
    }
}

abstract class Car{
    boolean isEngineRunning;
    void start(){
        if(isEngineRunning){
            System.out.println("car is already started");
            return;
        }
        isEngineRunning = true;
        System.out.println("car started");
    }
    void stop(){
        if(!isEngineRunning){
            System.out.println("car is already stopped");
            return;
        }
        isEngineRunning = false;
        System.out.println("car stopped");
    }
    // abstract methods
    abstract void accelerate();
    abstract void brake();
}

class Maruti extends Car{
    void accelerate(){
        System.out.println("maruti is accelerating");
    }
    void brake(){
        System.out.println("maruti is braking");
    }
}

class TataEV extends Car{
    void accelerate(){
        System.out.println("tata ev is accelerating");
    }
    void brake(){
        System.out.println("tata ev is braking");
    }
}