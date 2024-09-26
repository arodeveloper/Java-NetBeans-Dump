
package archivos_binarios;

import java.io.Serializable;

public class Person implements Serializable{    //  Serializable permits the class to be serializable to binary
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void showInformation(){
        System.out.println("Name: "+name+"\nAge: "+age+"\n\n");
    }

    @Override
    public String toString() {
        return "Name: "+name+"Age: "+age+"\n";
    }

    
    
    
}
