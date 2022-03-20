public class CleanMaze 
{

    private static int[][] azimut = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public static char[][] clearMaze(char[][] table)
    {   
        int[] col;
        int[] lig;

        char [][] tab = table;
        
        //parcourir ensemble du tableau
        for (int i = 0; i < table.length; i++)
        {
            for (int y = 0; y < table[i].length; y++)
            {
                if (table[i][y] == ' ')
                {
                    table[i][y] = 'X';
                }
            }
        }

        return tab;
    }

    public boolean culdesac()
    {    
        return false;
    }
}
