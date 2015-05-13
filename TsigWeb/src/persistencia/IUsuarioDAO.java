package persistencia;

import javax.ejb.Local;

import dominio.Usuario;

@Local
public interface IUsuarioDAO {

public boolean guardarUsuario(Usuario usuario);

public boolean existeUsuario(String nombre);

public Usuario getUsuario(String nick);

public void modificarUsuario(Usuario u);

public boolean autenticarUsuario(String nombre,String password);


}
