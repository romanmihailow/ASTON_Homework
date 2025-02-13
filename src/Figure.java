abstract class Figure {
    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public abstract void setFillColor(String color);

    public abstract String getFillColor();

    public abstract void setLineColor(String color);

    public abstract String getLineColor();

    public void printInfo() {
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill color: " + getFillColor());
        System.out.println("Line color: " + getLineColor());
        System.out.println();
    }

    // Статический блок в интерфейсе, который создаст и выведет фигуры.
    static {
        Figure circle = new Circle(5);
        circle.setFillColor("Black");
        circle.setLineColor("Red");
        System.out.println("Circle:");
        circle.printInfo();

        Figure rectangle = new Rectangle(4, 5);
        rectangle.setFillColor("Green");
        rectangle.setLineColor("Blue");
        System.out.println("Rectangle:");
        rectangle.printInfo();

        Figure triangle = new Triangle(3, 4, 5);
        triangle.setFillColor("Yellow");
        triangle.setLineColor("Purple");
        System.out.println("Triangle:");
        triangle.printInfo();
    }
}

class Circle extends Figure {
    private double radius;
    private String fillColor;
    private String lineColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public void setLineColor(String color) {
        this.lineColor = color;
    }

    @Override
    public String getLineColor() {
        return lineColor;
    }
}

class Rectangle extends Figure {
    private double width;
    private double height;
    private String fillColor;
    private String lineColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public void setLineColor(String color) {
        this.lineColor = color;
    }

    @Override
    public String getLineColor() {
        return lineColor;
    }
}

class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String lineColor;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public void setLineColor(String color) {
        this.lineColor = color;
    }

    @Override
    public String getLineColor() {
        return lineColor;
    }
}
