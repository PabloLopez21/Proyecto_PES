package models;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Model{
    public String nom;
    public String password;
    public String correo;

    @OneToMany (mappedBy = "clientes")
    public List<Compra> comprasList= new ArrayList<>();


    public Cliente(String nom, String password, String correo){
        this.nom= nom;
        this.password = password;
        this.correo = correo;
    }

}
