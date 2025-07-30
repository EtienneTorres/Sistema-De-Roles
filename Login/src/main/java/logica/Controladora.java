package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlpersis;

    public Controladora() {
        controlpersis = new ControladoraPersistencia();
    }

    public Usuario validarUsuario(String usuario, String contrasenia) {

        Usuario user = null;

        List<Usuario> listausuarios = controlpersis.traerusuario();

        for (Usuario usu : listausuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {

                if (usu.getContrasenia().equals(contrasenia)) {
                    user = usu;
                    return user;

                } else {
                    user = null;
                    return user;

                }
            } else {

                 user = null;
            }
        }

        return user;
    }

    public List<Usuario> traerUsuarios() {

       return  controlpersis.traerusuario();


    }

    public List<Rol> traerroles() {
        return controlpersis.traerroles();
    }

    public void crearusuario(String usuario, String contra, String rolrecibido) {
        
        Usuario usu = new Usuario();
        usu.setNombreUsuario(usuario);
        usu.setContrasenia(contra);
        
        Rol rolencontado = new Rol();
        rolencontado=this.traerroles(rolrecibido);
        
        if(rolencontado!=null)
        {
        usu.setUnRol(rolencontado);
        }
        
        controlpersis.crearusuario(usu);
    }

    private Rol traerroles(String rolrecibido) {
        
        List<Rol> listaroles = controlpersis.traerroles();
        
        for(Rol rol: listaroles)
        {
            if(rol.getNombrerol().equals(rolrecibido))
            {
                return rol;
            }
        }
        
        return null;
    }

    public void borrarUsuario(int id_usuario) {
        
        
        controlpersis.borrarusuario(id_usuario);
        
        
    }

    public Usuario traerusuario(int id_usuario) {
        
        return controlpersis.traerusuarios(id_usuario);
    }

    public void editarusuario(Usuario usu, String usuario, String contra, String rolrecibido) {
        
        
        usu.setNombreUsuario(usuario);
        usu.setContrasenia(contra);
        
         Rol rolencontado = new Rol();
        rolencontado=this.traerroles(rolrecibido);
        
        if(rolencontado!=null)
        {
        usu.setUnRol(rolencontado);
        }
        
        controlpersis.editarusuario(usu);
        
    }

    
    
    
    
    
    

   

   

  

}
