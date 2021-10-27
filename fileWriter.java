
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class fileWriter
{
    public fileWriter(String fileName, int NumOfLines) throws IOException
    {
        File file = new File(fileName);
            if (!file.exists())
            {
                file.createNewFile();
            }

                try (FileWriter fw = new FileWriter(file,true))
                {
                    Scanner sc = new Scanner(System.in);
                    for (int counter = 0; counter < NumOfLines; counter++)
                    {

                        fw.write(sc.nextLine());
                        fw.write("\n");
                    }

                }
            }
        }



