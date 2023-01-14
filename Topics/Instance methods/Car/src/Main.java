class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        speed = speed + 5;
    }
    void brake () {
        if (this.speed < 6) {
            speed = 0;
        }
        else {
            speed = speed - 5;
        }
    }
}