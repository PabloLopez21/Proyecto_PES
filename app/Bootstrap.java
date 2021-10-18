import play.jobs.*;
import models.*;


@OnApplicationStart
public class Bootstrap extends Job{

    public void doJob() {
        Cliente c1 = new Cliente("paco", "12345", "xdfa@g.com");
        c1.save();
        Compra cp1 = new Compra("27/09/21", 360, 600);
        cp1.save();
        Productos p1 = new Productos("casco", 35, 1000);
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

    }
}
