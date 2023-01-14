class Circle {

    double radius;

    // write methods here

    public double getLength() {
        double lenght = 2 * Math.PI * radius;
        return lenght;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return  area;
    }

}