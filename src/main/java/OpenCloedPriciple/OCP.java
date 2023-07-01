package OpenCloedPriciple;

interface Shape {
    abstract double berechneFläche();
}

class Rectangle implements Shape {
    int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double berechneFläche() {
        return length * width;
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneFläche() {
        return Math.PI * Math.pow(radius, 2);
    }
}
