package presentacion;

import java.io.Serializable;


import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;


import persistencia.PropiedadDAO;

import dominio.Casa;


@ManagedBean
@SessionScoped
public class PropiedadMB implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private int idCasa;	
	private String direccion;	
	private String barrio;	
	private String tipoProp;	
	private int cantBanios;		
	private int cantCuartos;	
	private boolean garage;	
	private boolean piscina;
	  
	private PropiedadDAO propiedad;	
	private Casa c;
	
	
	public String guardarPropiedad(){
		 
			propiedad.guardarPropiedad(c);
		  
			return null;
			
		}
	
	
	public int getIdCasa(){
		
		return idCasa;
	
	}

	public void setIdCasa(int idCasa){
	
		this.idCasa = idCasa;
	
	}

	public String getDireccion(){
	
		return direccion;
	
	}

	public void setDireccion(String direccion){
	
		this.direccion = direccion;
	
	}

	public String getBarrio(){
	
		return barrio;

	}

	public void setBarrio(String barrio){

		this.barrio = barrio;

	}

	public String getTipoProp(){

		return tipoProp;

	}

	public void setTipoProp(String tipoProp){

		this.tipoProp = tipoProp;

	}

	public Integer getCantBanios(){

		return cantBanios;

	}

	public void setCantBanios(int cantBanios){

		this.cantBanios = cantBanios;

	}

	public Integer getCantCuartos(){

		return cantCuartos;

	}

	public void setCantCuartos(Integer cantCuartos){

		this.cantCuartos = cantCuartos;

	}

	public boolean getGarage(){

		return garage;

	}

	public void setGarage(boolean garage){

		this.garage = garage;

	}

	public boolean getPiscina(){

		return piscina;
	
	}

	public void setPiscina(boolean piscina){

		this.piscina = piscina;

	}
	
	
}
