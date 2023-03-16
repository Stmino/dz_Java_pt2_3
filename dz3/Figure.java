package dz3;

public  abstract class Figure  implements Area, Perim{
    protected int[] sides;
    protected Figure(int[] sides){
        this.sides=sides;
    }
    
}

