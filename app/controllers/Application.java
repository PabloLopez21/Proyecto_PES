package controllers;
import play.db.jpa.*;
import play.*;

import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        renderText("Bienvenido ;)");

    }

    public static void DataBase(){
        Cliente c1 = new Cliente("paco","2453652","xdfa@g.com");
        c1.save();
        Compra cp1 = new Compra("27/09/21");
        cp1.save();
        Productos p1 = new Productos("casco",35);
        p1.save();
        Proveedor pr1 = new Proveedor("Juan");
        pr1.save();


        c1.comprasList.add(cp1);
        c1.save();
        cp1.clientes = c1;
        cp1.save();
        cp1.producto = p1;
        cp1.save();
        p1.compras.add(cp1);
        p1.save();
        p1.proveedors = pr1;
        p1.save();
        pr1.productos.add(p1);
        pr1.save();

        renderText("Base de datos iniciada");
    }
}