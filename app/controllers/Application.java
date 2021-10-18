package controllers;
import play.db.jpa.*;
import play.*;
import play.mvc.*;

//import java.util.*;

import models.*;
import play.mvc.results.RenderText;

public class Application extends Controller {

    public static void index() {
        renderText("Bienvenido ;)");

    }
    public static void Login(String name, String password){
    Cliente client = Cliente.find("byNameAndPassword", name, password).first();
        renderText("Bienvenido " + client.name);
    }
    public static void Register(String name, String password, String email){
        Cliente ClientRegistered = new Cliente(name,password,email);
        ClientRegistered.save();
        renderText("Hola " + ClientRegistered.name + " te has registrado correctamente");
    }
    public static void Delete(String name, String password){
        Cliente client = Cliente.find("byNameAndPassword", name, password).first();
        client.delete();
        renderText("Te has dado de baja correctamente");
    }
    public static void EditEmail(String email, String newemail){
        Cliente client = Cliente.find("byEmail", email).first();
        client.email = newemail;


    }
    public static void DataBase(){
        Cliente c1 = new Cliente("paco","12345","xdfa@g.com");
        c1.save();
        Compra cp1 = new Compra("27/09/21", 360, 600);
        cp1.save();
        Productos p1 = new Productos("casco",35, 1000);
        p1.save();
        Proveedor pr1 = new Proveedor("Juan", "proveo@gmail.com", 911, "Rumania", "Carrer Balmes");
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