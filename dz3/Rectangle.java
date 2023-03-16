package dz3;

public class Rectangle  extends Figure {

    public Rectangle(int a, int b){
        super(new int[]{a,b,a,b});
    }
    public Rectangle(){
        this(2, 4);
    }
    public double area(){
        return sides[0]*sides[1];
    }
   
    @Override
    public double perimeter() {
        int sum = 0;
        for(int side : sides)
            sum += side;
        return sum;
        
    }
    @Override
    public String toString() {
        return String.format("Прямоугольник");
    }
   
    }