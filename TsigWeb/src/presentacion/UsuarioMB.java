package presentacion;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import controladores.IUsuarioController;




@ManagedBean
@SessionScoped
public class UsuarioMB implements Serializable {
	
	 private static final long serialVersionUID = 1L;
	
	 @EJB
	 private IUsuarioController iuc;
	 
	 private String nombre;
	 
	 private String mail;
	 
	 private String password;
	 
	public void altaUsuario()
	{	
		System.out.println("alta usuario");
		
		System.out.println(nombre + mail + password);
		try {
			
			if(iuc.existeUsuario(this.nombre)){
				System.out.println("entre if");
				FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("El usuario ya existe"));
				
			}else{
				iuc.guardarUsuario(this.nombre, this.password, this.mail);
			}
			
				
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public String Login(){
		
		System.out.println("login");
		  
		try {

			
			    
			if (iuc.autenticarUsuario(this.nombre, this.password) ) {	
				
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.nombre);
				FacesContext.getCurrentInstance().getExternalContext().redirect("index.html");
				
			}
			else{				
				
				
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Credenciales incorrectas o Perfil deshabilitado"));
				FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
						
				
			}		
			} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		
	return null;

	}

	public String logOut() {


		try {
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.html");
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		return null;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
