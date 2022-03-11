//-author : LERAY----//
//-date : 11/03/2022-//

import java.io.FileReader;
import java.io.IOException;
//import java.util.List;
import java.util.Scanner;

public class TestLirefichier
{
    //List list;
    static String file = "fichier.txt";

    public static void main(String[] args) throws IOException
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
            System.out.println("" + str);
            char[] texte = new char[str.length()];
            table[lig] = texte;
            lig++;
        }
    }

}
