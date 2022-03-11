//-author : LERAY----//
//-date : 11/03/2022-//

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Lirefichier
{
    List list;
    static String file = "fichier.txt";

    char[][] table = new char[500][];

    

    public static void main(String[] args) throws IOException
    {
        String str = "";
        
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(fr)) 
        {
            while((str = br.readLine())!=null)
            {
                    str.toCharArray();
            }
        }
    }


    
    //char[] resultArray = list.toArray(new char[list.size()]);
}
