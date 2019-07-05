/**8. Write a program to find all files of a folder and select only given extention fileName and
        read content of this file using byte array*/
package com.stackroute.code;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {

    public static void readFromExistingFile() {
        String data = "";

        try {
            File f = new File("git-push-instructions.txt");
            Scanner myReader = new Scanner(f);

            while (myReader.hasNextLine())
            {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}