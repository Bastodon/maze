import java.io.IOException;
import java.util.Scanner;

//-author : LERAY----//
//-date : 11/03/2022-//

public class Controleur
{
    public static void main(String[] args) throws IOException
    {
        String fichier = "";
        System.out.print("Entrez le nom du fichier de labyrinthe et son format (exemple : fichier.txt) : ");
        Scanner sc = new Scanner(System.in);
        fichier = sc.next();
        Lirefichier.lireFichier(fichier);
    }
}