package models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import play.db.jpa.*;

@Entity
public class Compra extends Model {
        public String fecha;

        @ManyToOne
        public Cliente clientes;
        @ManyToOne
        public Productos producto;


        public Compra(String fecha){
            this.fecha = fecha;
        }

    }

