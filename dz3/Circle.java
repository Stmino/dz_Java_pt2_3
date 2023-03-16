package dz3;

public class Circle extends Figure {
    
    protected Circle(int a){
        super(new int[]{a});
    }
 public Circle(){
    this(2);
 }       
  
    @Override
    public double area() {
        return 2*Math.PI*sides[0]*sides[0];
    }

    @Override
    public double perimeter() {
        return Math.PI*sides[0];
    }

    @Override
    public String toString() {
        return String.format("Круг");
    }

    
}
