package Tutorial11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) {
        String filename = "../aFile.txt";
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(filename));
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println("Reading line: " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("There was an exception! The file was not found!");
        } catch (IOException e) {
            System.out.println("There was an exception handling the file!");
        }
    }
}