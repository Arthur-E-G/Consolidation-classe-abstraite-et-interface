package forme;

interface Forme
{
    double calculerAire();
    double calculerPerimetre();
}

abstract class FormeGeometrique implements Forme
{
    protected String name;
    protected String color;

    public FormeGeometrique(){}

    public FormeGeometrique(String newName, String newColor){

        this.name = newName;
        this.color = newColor;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }

}
