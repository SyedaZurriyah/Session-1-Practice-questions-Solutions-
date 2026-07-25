public class Main1 {
    
    public static void main(String[] args){
        Car1 bmw = new Car1();
        Car1 audi = new Car1();

        bmw.setDetails("bmw", "black");
        audi.setDetails("audi", "white");

        bmw.stopEngine();
        audi.startEngine();

        bmw.setFuelLevel(75.0f);
        audi.setFuelLevel(80.0f);
        bmw.moveFast();
        audi.moveSlow();

        bmw.changeGear(2);
        audi.changeGear(5);

        bmw.moveLeft();
    
        audi.moveRight();
        audi.enableTurboMode();

        bmw.show();
        audi.show();
    }
}

