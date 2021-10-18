package models;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Productos extends Model{
    public String name;
    public int price;
    public int stock;

    @OneToMany (mappedBy = "producto")
    public List<Compra> compras = new ArrayList<>();
    @ManyToOne
    public Proveedor proveedors;

    public Productos(String name, int price, int stock){
        this.name= name;
        this.price = price;
        this.stock = stock;
    }

}
