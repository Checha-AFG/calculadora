
package visual;


import java.io.FileNotFoundException;
import java.io.IOException;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
 


public class File {

    static Path fileName = Path.of(
            "D:/UNI/4tosemestre/prograll/tarea_calcu/Calcu/ext/bitacora.txt");
    
    public static void insert(String s)
        throws IOException 
    {   
        String d = "\r\n";
        Files.writeString(fileName, d,StandardOpenOption.APPEND);
        Files.writeString(fileName, s,StandardOpenOption.APPEND);
        
    }
    
}
