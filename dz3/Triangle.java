package dz3;

public class Triangle extends Figure {

    public Triangle(int a, int b, int c) {
        super(new int[] { a, b, c });
    }

    public Triangle() {
        this(2, 4, 3);
    }

    @Override
    public double perimeter() {
        int sum = 0;
        for (int side : sides)
            sum += side;
        return sum;

    }

    public double area() {
        double p = perimeter() / 2.0;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    @Override
    public String toString() {
        return String.format("Треугольник");
    }
}
