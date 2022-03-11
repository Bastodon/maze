import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//-author : LERAY----//
//-date : 11/03/2022-//

public class Lirefichier
{

    public static char[][] lireFichier(String file) throws FileNotFoundException
    {
        FileReader fr = new FileReader(file);
        Scanner sc = new Scanner(fr);

        //récupérer nombre de lignes
        int cptLig = 0;
        while (sc.hasNextLine()) 
        {
            cptLig++;
            sc.nextLine();
        }
        
        //creer tableau vide
        char[][] table = new char[cptLig][];

        //reset scanner
        fr = new FileReader(file);
        sc = new Scanner(fr);

        //remplir le tableau
        int lig = 0;
        String str = "";
        while (sc.hasNextLine())
        {
            str = sc.nextLine();
            char[] texte = new char[str.length()];
            for (int i=0; i < str.length(); i++)
            {
                texte[i] = str.charAt(i);
                System.out.print("" + texte[i]);
            }
            table[lig] = texte;
            lig++;
            System.out.println("");
        }

        return table;
    }

}
