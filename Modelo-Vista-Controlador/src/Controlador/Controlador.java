package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
        //  Atributes
    private Vista view;
    private Modelo model;
        //  Constructor
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        view.resultButton.addActionListener(this);
    }
    
    public void initComponents(){    //  Components are initiated
        view.setTitle("MVC");
        view.setLocationRelativeTo(null);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {   //  Action listener
        model.setNumber1(Integer.parseInt(view.number1TextField.getText()));
        model.setNumber2(Integer.parseInt(view.number2TextField.getText()));
        view.resultTextField.setText(String.valueOf(model.result()));
    }
    
    
}
