package forme;

public class Cercle extends FormeGeometrique
{
    static final double PI = Math.PI;
    protected double radius = 0;

    public Cercle(){}

    public Cercle(String newName, String newColor, double newRadius){
        super(newName, newColor);
        this.radius = newRadius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double calculerAire(){
        return PI * Math.pow(radius, 2);
    }
    public double calculerPerimetre(){
        return 2 * PI * radius;
    }
}