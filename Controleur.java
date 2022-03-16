import java.io.IOException;
import java.util.Scanner;

//-author : LERAY----//
//-date : 11/03/2022-//

public class Controleur
{
    private static Scanner sc;

    public static void main(String[] args) throws IOException
    {
        //Initialiser variables
        String fichier = "";
        char[][] laby;

        //Lire nom du fichier
        System.out.print("Entrez le nom du fichier de labyrinthe et son format (exemple : fichier.txt) : ");
        sc = new Scanner(System.in);
        fichier = sc.next();

        //Lire contenu du fichier
        System.out.println("Labyrinthe :");
        laby = Lirefichier.lireFichier(fichier);
        System.out.println("");

        //Résoudre labyrinthe
        System.out.println("Solution :");
        laby = CleanMaze.clearMaze(laby);

        for (int i = 0; i < laby.length; i++)
        {
            for (int y = 0; y < laby[i].length; y++)
            {
                System.out.print(""+ laby[i][y]);
            }
            System.out.println("");
        }
    }
}