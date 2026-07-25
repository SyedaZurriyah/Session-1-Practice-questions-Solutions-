public class Car1{
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private float fuelLevel;
    private int gear;
    private String direction;
    private boolean turboMode;
    public Car1(){
        this.brand = "unknown";
        this.color = "unappointed";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100.0f;
        this.gear = 0;
        this.direction = "straight";
        this.turboMode = false;
    }
    public void setDetails(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
    public void startEngine(){
        this.engineOn=true;
        System.out.println(this.brand + "engine started");
    }
    public void stopEngine(){
      this.speed =0;
      this.engineOn = false;
      this.turboMode = false;
        System.out.println(this.brand +"engine is off");
    }
     public void moveFast() {
        if (!engineOn) {
            System.out.println(this.brand + ": Cannot accelerate. Engine is OFF.");
            return;
        }
        int boost = turboMode ? 40 : 20;
        this.speed += boost;
        System.out.println(this.brand + " accelerated. Current Speed: " + this.speed + " km/h");
    }
     public void moveSlow() {
        if (!engineOn) {
            System.out.println(this.brand + ": Engine is OFF.");
            return;
        }
        this.speed -= 10;
    
        if (this.speed < 0) {
            this.speed = 0;
        }
        System.out.println(this.brand + " slowed down. Current Speed: " + this.speed + " km/h");
    }
    public void moveLeft() {
        this.direction = "left";
        System.out.println(this.brand + " turned left.");
    }

    public void moveRight() {
        this.direction = "right";
        System.out.println(this.brand + " turned right.");
    }
    public void enableTurboMode() {
        if (!engineOn) {
            System.out.println(this.brand + ": Cannot enable Turbo Mode while engine is OFF!");
            return;
        }
        this.turboMode = true;
        System.out.println(this.brand + ": TURBO MODE ENGAGED");
    }


    public void setFuelLevel(float fuelLevel) {
        if (fuelLevel < 0) {
            this.fuelLevel = 0.0f;
        } else {
            this.fuelLevel = fuelLevel;
        }
    }
     public void changeGear(int gear) {
        if (gear < 0) {
            System.out.println("Invalid gear!");
        } else {
            this.gear = gear;
        }
    }

    public String getBrand(){
        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean isEngineOn(){
        return this.engineOn;
    }
    public float getFuelLevel(){
        return this.fuelLevel;
    }
    public int getGear(){
        return this.gear;
    }
    public String getDirection(){
        return this.direction;
    }
    public boolean isTurboMode(){
        return this.turboMode;
    }
    public void show(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed + " km/hr");
        System.out.println("Engine status: " + (this.engineOn ? "ON" : "OFF"));
        System.out.println("Fuel Level: " + this.fuelLevel);
        System.out.println("Gear: " + this.gear);
        System.out.println("Direction: " + this.direction);
        System.out.println("Turbo mode: " + (this.turboMode ? "ENABLED" : "DISABLED"));
        System.out.println();
    }

    
}