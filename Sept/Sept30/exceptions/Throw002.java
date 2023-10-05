package Sept.Sept30.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw002 {

    public static void main(String[] args) {

        String path = "C://a.txt";
        File file = new File(path);

        try {
            FileReader fileReader = new FileReader(file);

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } finally {

            //file.close();
        }
    }
}


// If you want to add for particular code of block, do try/ catch.

// If you want to add for whole method, add 'throws' to main method.