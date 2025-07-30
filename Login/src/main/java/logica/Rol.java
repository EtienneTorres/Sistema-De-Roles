
package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Rol implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombrerol;
    private String descripcion;
    @OneToMany(mappedBy="unRol")
    private List<Usuario> listausuarios;

    public Rol() {
    }

    
    public Rol(int id, String nombrerol, String descripcion, List<Usuario> listausuarios) {
        this.id = id;
        this.nombrerol = nombrerol;
        this.descripcion = descripcion;
        this.listausuarios = listausuarios;
    }

    public List<Usuario> getListausuarios() {
        return listausuarios;
    }

    public void setListausuarios(List<Usuario> listausuarios) {
        this.listausuarios = listausuarios;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrerol() {
        return nombrerol;
    }

    public void setNombrerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
}
