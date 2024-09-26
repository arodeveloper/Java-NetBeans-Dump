
package TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextFile {
    File file;  //  File type object is instantiated
    
    private void createFile(){  //  Method for creating files 
        file = new File("test.txt");    //  Text file object is created 
        
        try {   //  If there's no exception, the file will be created
            if(file.createNewFile()){
                System.out.println("The file has been successfully created.");
            }   else if(file.exists()){
                System.out.println("The file already exists.");
            }
        } catch (IOException ex) {  //  If there's an exception, an error message will be shown
            System.err.println("The file could not be created. "+ex);
        }
    }
    
    private void createDirectory(){     //Method for creating directories
        file = new File("Test Directory");  //  Directory file object is created
        
        if(file.mkdir()){   //  If the directory is created, it will be shown to the user
            System.out.println("The directory has been successfully created.");
        }   else{   //  Else, an error message will be shown
            System.err.println("The directory could not be created.");
        }
    }
    
    private void writeText(){   //  Writing text method
        try {   //  If there's no exception, the file will be written
            FileWriter write = new FileWriter(file);
            write.write("This is a text file.");
            write.write("\r\nThis is a second line.");
            write.close();
            System.out.println("The file has been written successfully.");
        } catch (IOException ex) {  //  If there's an exception, an error message will be shown to the user
            System.err.println("File could not be written. "+ex);
        }
    }
    
    private void addText(){ //  Adding text method
        try {   //  If there's no exception, the file will be overwritten
            FileWriter write = new FileWriter(file, true);
            write.write("\r\nThis an added line.");
            write.write("\r\nThis another added line.");
            write.close();
            System.out.println("The file has been overwritten successfully.");
        } catch (IOException ex) {  //  If there's an exception, an error message will be shown to the user
            System.err.println("File could not be overwritten. "+ex);
        }
    }
    
    private void readText(){    //  Reading file method
        String text;
        try {   //  If there's no exception, the file will be read
            
                //  Reader objects
            FileReader reader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(reader);
            
            text = bReader.readLine();  //  Line reader
            while(text != null){    //  Each line will be read until there's no text
                System.out.println(text);   //  Text is shown to the user
                text = bReader.readLine();  //  Reader will read the next line
            }
        } catch (FileNotFoundException ex) {    //  If there's an exception, an error message will be shown
            System.err.println("File could not be read. "+ex);
        }   catch (IOException ex) {
            System.err.println("Text could not be read. "+ex);
        }
    }
    
    public static void main(String[] args) {
        TextFile files = new TextFile();    //  TextFile class object
        
        files.createFile();
        //files.writeText();
        //files.addText();
        files.readText();
        //files.createDirectory();
    }
}
