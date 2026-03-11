public class Interface {
    public static void main(String[] args) {

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

interface Car{
    void start();
    void stop();
    void accelerate();
    void brake();
}

class Maruti implements Car{
    public void start(){
        System.out.println("maruti started");
    }
    public void stop(){
        System.out.println("maruti stopped");
    }
    public void accelerate(){
        System.out.println("maruti is accelerating");
    }
    public void brake(){
        System.out.println("maruti is braking");
    }
}

class TataEV implements Car{
    public void start(){
        System.out.println("tata ev started");
    }
    public void stop(){
        System.out.println("tata ev stopped");
    }
    public void accelerate(){
        System.out.println("tata ev is accelerating");
    }
    public void brake(){
        System.out.println("tata ev is braking");
    }
}