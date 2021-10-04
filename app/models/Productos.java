package models;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Productos extends Model{
    public String nom;
    public int preu;

    @OneToMany (mappedBy = "producto")
    public List<Compra> compras = new ArrayList<>();
    @ManyToOne
    public Proveedor proveedors;

    public Productos(String nom, int preu){
        this.nom= nom;
        this.preu = preu;
    }

}
