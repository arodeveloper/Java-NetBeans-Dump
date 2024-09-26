package archivos_binarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArchivosBinarios {
    private void binaryWrite(){
        try {
            FileOutputStream file = new FileOutputStream("Persons.bin", true);
            AñadirContenido write = new AñadirContenido(file);
            
            Person person1 = new Person("Eliseo", 24);
            Person person2 = new Person("Elizabeth", 24);
            
            write.writeObject(person1);
            write.writeObject(person2);
            
            write.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Exception found. " + ex);
        } catch (IOException ex) {
            System.err.println("Exception found. " + ex);
        }   
    }
    
    private void binaryRead(){
        Person person;
        try {
            FileInputStream file = new FileInputStream("Persons.bin");
            ObjectInputStream read = new ObjectInputStream(file);
            
            while(true){
                person = (Person)read.readObject();
                person.showInformation();
            }
        } catch(EOFException ex){
            return;
        } catch (FileNotFoundException ex) {
            System.err.println("Exception found. " + ex);
        } catch (IOException ex) {
            System.err.println("Exception found. " + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Exception found. " + ex);
        }   
        
    }
    public static void main(String[] args) {
        ArchivosBinarios files = new ArchivosBinarios();
        
        files.binaryWrite();
        files.binaryRead();
    }
    
}
