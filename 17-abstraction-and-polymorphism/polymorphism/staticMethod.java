class staticMethod {
    public static void main(String[] args) {
        Car c1 = new Maruti();
        m1.start();
    }
}

class Car{
    static void start(){
        System.out.println("car started");
    }
}

class Maruti extends Car{
    static void start(){
        System.out.println("maruti started");
    }
}
