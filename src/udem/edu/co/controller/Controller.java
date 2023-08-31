package udem.edu.co.controller;

import udem.edu.co.model.abs.Planta;
import udem.edu.co.model.entity.Cebolla;
import udem.edu.co.model.entity.Lechugas;
import udem.edu.co.model.entity.Remolachas;
import udem.edu.co.model.interfaces.Plantas;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void imp(){
        List<Plantas> lista = new ArrayList<>();
        lista.add(new Remolachas("s",12,11));
        lista.add(new Lechugas("ss",11,"hoja",10));
        lista.add(new Cebolla("sss",2,"aa",3));
        System.out.printf(lista.toString());
    }
}
