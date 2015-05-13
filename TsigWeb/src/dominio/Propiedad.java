package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "propiedad")
@Entity
public class Propiedad implements Serializable{

	private static final long serialVersionUID = 1L; // Mapping JPA
	
	@Id
	@Column(name = "idprop", nullable = false)
	private int idProp;
	
	@Column(name = "direccion", nullable = false)
	private String direccion;
	
	@Column(name = "barrio", nullable = false)
	private String barrio;
	
	@Column(name = "tipoprop", nullable = false)
	private String tipoProp;
	
	@Column(name = "cantba�os", nullable = false)
	private int cantBa�os;
	
	@Column(name = "cantcuartos", nullable = false)
	private int cantCuartos;
	
	@Column(name = "garage", nullable = false)
	private boolean garage;
	
	@Column(name = "piscina", nullable = false)
	private boolean piscina;
	
	
	public Propiedad(){
		
	}
	
	public Propiedad(int idProp, String direccion,String barrio,String tipoProp, int cantBa�os, int cantCuartos,boolean piscina, boolean garage){
			
			this.idProp = idProp;
			this.direccion = direccion;
			this.barrio = barrio;
			this.tipoProp = tipoProp;
			this.cantBa�os = cantBa�os;
			this.cantCuartos = cantCuartos;
			this.garage = garage;
			this.piscina = piscina;
				
	}
	
	public Propiedad(Propiedad p){
		
			this.idProp = p.getIdProp();
		    this.direccion = p.getDireccion();
		    this.barrio = p.getBarrio();
		    this.tipoProp = p.getTipoProp();
		    this.cantBa�os = p.getCantBa�os();
		    this.cantCuartos = p.getCantCuartos();
		    this.garage = p.getGarage();
		    this.piscina = p.getPiscina();
		
	}
	
	public int getIdProp(){
		
			return idProp;
		
	}
	
	public void setIdProp(int idProp){
		
			this.idProp = idProp;
		
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

	public Integer getCantBa�os(){
	
		return cantBa�os;

	}
	
	public void setCantBa�os(int cantBa�os){

		this.cantBa�os = cantBa�os;

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
