package dz3;

public class Square extends Figure {
    public Square(int a){
        super(new int[]{a});
    }
    public Square(){
        this(2);
    }
    public double area(){
        return sides[0]*sides[0];
    }
   
    @Override
    public double perimeter() {
 
        return sides[0]*4 ;
        
    }
    @Override
    public String toString() {
        return String.format("Квадрат");
    }

}
