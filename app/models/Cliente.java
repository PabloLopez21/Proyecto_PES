package models;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Model{
    public String name;
    public String password;
    public String email;
    public int phonenumber;
    public int creditcard;
    public String country;
    public String address;

    @OneToMany (mappedBy = "clientes")
    public List<Compra> comprasList= new ArrayList<>();


    public Cliente(String name, String password, String email){
        this.name= name;
        this.password = password;
        this.email = email;
    }

    public void AddPayment(int phonenumber, int creditcard, String country,String address){
        this.phonenumber = phonenumber;
        this.creditcard = creditcard;
        this.country = country;
        this.address = address;
    }
}
