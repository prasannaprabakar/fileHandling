import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class appRunner
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file NAME: ");
        String fileName = sc.nextLine();
        System.out.println("Enter the number of lines between 1-230: ");
        int NumOfLines = sc.nextInt();
        sc.nextLine();
        if(NumOfLines<=230)
        {
            fileWriter write = new fileWriter(fileName, NumOfLines);
            fileReader read = new fileReader(fileName);
            //CountOfWordsInFlle count=new CountOfWordsInFlle(fileName,NumOfLines);
            checkUniqueCharInLine check=new checkUniqueCharInLine(fileName,NumOfLines);
        }
        else {
            System.out.println("Enter the valid input");
        }
    }
}
