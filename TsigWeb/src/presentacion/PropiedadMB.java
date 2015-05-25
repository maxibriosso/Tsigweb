package presentacion;


import java.io.Serializable;






import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;





import javax.faces.context.FacesContext;

import controladores.IPropiedadController;



@ManagedBean
@SessionScoped
public class PropiedadMB implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private int idCasa;	
	private int direccion;	
	private String barrio;	
	private String tipoProp;	
	private int cantBanios;		
	private int cantCuartos;	
	private boolean garage;	
	private boolean piscina;
	private String titulo;
	
	@EJB
	IPropiedadController ipc;
	

	public String guardarPropiedad(){
		

		//System.out.println(idCasa+titulo+direccion+barrio+ tipoProp+ cantBanios+ cantCuartos+ piscina+ garage);
		

	
		 ipc.guardarCasa(idCasa,0,titulo, direccion, barrio, tipoProp, cantBanios, cantCuartos, piscina, garage);
		

		System.out.println(titulo+direccion+barrio+ tipoProp+ cantBanios+ cantCuartos+ piscina+ garage);
		
		
	 
		//ipc.guardarCasa(1,titulo, direccion, barrio, tipoProp, cantBanios, cantCuartos, piscina, garage);
	  

		return null;
		
	}


	public int getIdCasa() {
		return idCasa;
	}


	public void setIdCasa(int idCasa) {
		this.idCasa = idCasa;
	}


	public int getDireccion() {
		return direccion;
	}


	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}


	public String getBarrio() {
		return barrio;
	}


	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}


	public String getTipoProp() {
		return tipoProp;
	}


	public void setTipoProp(String tipoProp) {
		this.tipoProp = tipoProp;
	}


	public int getCantBanios() {
		return cantBanios;

	}


	public void setCantBanios(int cantBanios) {
		this.cantBanios = cantBanios;
	}


	public int getCantCuartos() {
		return cantCuartos;
	}


	public void setCantCuartos(int cantCuartos) {
		this.cantCuartos = cantCuartos;
	}


	public boolean isGarage() {
		return garage;
	}


	public void setGarage(boolean garage) {
		this.garage = garage;
	}


	public boolean isPiscina() {
		return piscina;
	}


	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	

	
	
}
