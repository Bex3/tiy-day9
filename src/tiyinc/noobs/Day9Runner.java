package tiyinc.noobs;

import java.io.File;

/**
 * Created by bearden-tellez on 8/18/16.
 */
public class Day9Runner {
    public static void main(String[] args){
        System.out.println("Running...");
        Day9Runner  myRunner = new Day9Runner();
        myRunner.testWriteFile(); //not static so it can't be instatiated
    }
    public void testWriteFile() {
        System.out.println(" testWriteFile()");
        try {
            File testFile = new File("noobs.txt");
        }catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
