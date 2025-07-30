
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Rol;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    
    UsuarioJpaController usuJpa= new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<Usuario> traerusuario() {
        
        
        List<Usuario> litaUusario=usuJpa.findUsuarioEntities();
        return  litaUusario;
        
    }

    public List<Rol> traerroles() {
        
         return   rolJpa.findRolEntities();
          
        
    }

    public void crearusuario(Usuario usu) {
        
        
        usuJpa.create(usu);
          
        
        
    }

    public void borrarusuario(int id_usuario) {
        
        try {
            usuJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerusuarios(int id_usuario) {
        return usuJpa.findUsuario(id_usuario);
    }

    public void editarusuario(Usuario usu) {
        
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    
    
}
