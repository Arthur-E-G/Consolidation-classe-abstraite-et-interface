import java.util.Scanner;

import forme.Cercle;
import forme.Rectangle;
import forme.Triangle;

public class ApplicationDessin
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Triangle vp = new Triangle("Isocèle", "Vert", 13.0, 13.0, 17.0);
        Rectangle rg = new Rectangle("Carré", "Rouge", 4, 4);
        Cercle cl = new Cercle("Rond", "Black", 5);

        System.out.println("\n\n");
        System.out.println(vp.getName() + " est un triangle " + vp.getColor() +  " et de perimetre : " + vp.calculerPerimetre() + " et d'aire : " + vp.calculerAire());
    }
}