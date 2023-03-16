package dz3;

public class Program {
    public static void main(String[] args) {
        Figure[] figures = { new Rectangle(), new Circle(), new Triangle(), new Square() };
        for (Figure figure : figures)
           Print(figure);;

    }

    private static void Print(Figure figure) {

        System.out.println(figure);
        System.out.println(String.format("Area: %f", figure.area()));
        System.out.println(String.format("Perim: %f", figure.perimeter()));

    }

}
