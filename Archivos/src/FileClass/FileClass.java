
package FileClass;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("Directorio/texto.txt"); //  File object with the absolute path of the .txt file
        
        if(file.exists()){
            System.out.println("The file exists and is located in "+file.getAbsolutePath());
            System.out.println("Is this a file? "+file.isFile());
            System.out.println("Is it a readable file? "+file.canRead());
            
        }   else{
            System.out.println("The file doesn't exist");
        }
        
        File directory = new File("Directorio"); //  File object with the absolute path of the Directory 
        
        if(directory.exists()){
            System.out.println("The directory exists and is located in "+directory.getAbsolutePath());
            System.out.println("Is this a directory? "+directory.isDirectory());
            System.out.println("Is it a readable directory? "+directory.canRead());
            
        }   else{
            System.out.println("The file doesn't exist");
        }
    }
    
    
}
