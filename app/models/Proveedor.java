package models;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Proveedor extends Model{
        public String name;
        public String email;
        public int phonenumber;
        public String country;
        public String address;

        @OneToMany (mappedBy = "proveedors")
        public List<Productos> productos = new ArrayList<>();

        public Proveedor(String name, String email, int phonenumber, String country, String address) {
            this.name = name;
            this.email = email;
            this.phonenumber = phonenumber;
            this.country = country;
            this.address = address;
        }
}
