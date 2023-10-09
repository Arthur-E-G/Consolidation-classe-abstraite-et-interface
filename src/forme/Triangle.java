package forme;

public class Triangle extends FormeGeometrique
{
    protected double aside;
    protected double bside;
    protected double cside;
    private double p = 0;

    public Triangle(){}
    public Triangle(String newName, String newColor, double newAside, double newBside, double newCside){

        super(newName, newColor);
        this.aside = newAside;
        this.bside = newBside;
        this.cside = newCside;
    }

    public double getAside(){
        return bside;
    }
    public void setAside(double newAside){
        this.aside = newAside;
    }
    public double getBside(){
        return bside;
    }
    public void setBside(double newBside){
        this.bside = newBside;
    }
    public double getCside(){
        return cside;
    }
    public void setCside(double newCside){
        this.cside = newCside;
    }

    public double calculerAire(){
        p = 0.5 * (aside + bside + cside);
        return Math.sqrt(p * (p - aside) * (p - bside) * (p - cside));
    }
    public double calculerPerimetre(){
        return aside + bside + cside;
    }
}