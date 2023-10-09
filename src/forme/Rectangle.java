package forme;

public class Rectangle extends FormeGeometrique
{
    protected double longueur = 0;
    protected double largeur = 0;

    public Rectangle(){}

    public Rectangle(String newName, String newColor, double newLongueur, double newLargeur){
        super(newName, newColor);
        this.longueur = newLongueur;
        this.largeur = newLargeur;
    }

    public double getLongueur(){
        return longueur;
    }
    public void setLongueur(double newLongueur){
        this.longueur = newLongueur;
    }

    public double getLargeur(){
        return largeur;
    }
    public void setLargeur(double newLargeur){
        this.largeur = newLargeur;
    }

    public double calculerAire(){
        return longueur * largeur;
    }
    public double calculerPerimetre(){
        return 2 * (longueur + largeur);
    }
}