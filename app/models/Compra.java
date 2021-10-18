package models;
import javax.persistence.*;
// import java.util.ArrayList;
// import java.util.List;

import play.db.jpa.*;

@Entity
public class Compra extends Model {
        public String date;
        public int value;
        public int numberOfproducts;

        @ManyToOne
        public Cliente clientes;
        @ManyToOne
        public Productos producto;


        public Compra(String date, int value, int numberOfproducts){
            this.date = date;
            this.value = value;
            this.numberOfproducts = numberOfproducts;
        }

    }

