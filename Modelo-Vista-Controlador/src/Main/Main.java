
package Main;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Main {
    public static void main(String[] args) {    //  Main method
            //  All classes are being instantiated
        Vista view = new Vista();
        Modelo model = new Modelo();
        Controlador controller = new Controlador(view, model);
            //  Components are initiated
        controller.initComponents();
        view.setVisible(true);
    }
}
