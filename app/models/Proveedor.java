package models;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Proveedor extends Model{
        public String nom;

        @OneToMany (mappedBy = "proveedors")
        public List<Productos> productos = new ArrayList<>();

        public Proveedor(String nom) {
            this.nom = nom;
        }
}
