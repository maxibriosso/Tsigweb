package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "casa")
@Entity
public class Casa implements Serializable{

	private static final long serialVersionUID = 1L; // Mapping JPA
	
	@Id
	@Column(name = "idcasa", nullable = false)
	private int idCasa;
	
	
	@Column(name = "titulo", nullable = false)
	private String titulo;
	
	@Column(name = "direccion", nullable = false)
	private int direccion;
	
	@Column(name = "barrio", nullable = false)
	private String barrio;
	
	@Column(name = "tipoprop", nullable = false)
	private String tipoProp;
	
	@Column(name = "cantbanios", nullable = false)
	private int cantBanios;
	
	@Column(name = "cantcuartos", nullable = false)
	private int cantCuartos;
	
	@Column(name = "garage", nullable = false)
	private boolean garage;
	
	@Column(name = "piscina", nullable = false)
	private boolean piscina;
	
	
	public Casa(){
		
	}
	
	public Casa(int idCasa,String titulo, int direccion,String barrio,String tipoProp, int cantbanios, int cantCuartos,boolean piscina, boolean garage){
			
			this.idCasa = idCasa;
			this.titulo=titulo;
			this.direccion = direccion;
			this.barrio = barrio;
			this.tipoProp = tipoProp;
			this.cantBanios = cantbanios;
			this.cantCuartos = cantCuartos;
			this.garage = garage;
			this.piscina = piscina;
				
	}
	
	public Casa(Casa p){
		
			this.titulo=p.getTitulo();
			this.idCasa = p.getIdCasa();
		    this.direccion = p.getDireccion();
		    this.barrio = p.getBarrio();
		    this.tipoProp = p.getTipoProp();
		    this.cantBanios = p.getCantbanios();
		    this.cantCuartos = p.getCantCuartos();
		    this.garage = p.getGarage();
		    this.piscina = p.getPiscina();
		
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIdCasa(){
		
			return idCasa;
		
	}
	
	public void setIdCasa(int idCasa){
		
			this.idCasa = idCasa;
		
	}
	
	public int getDireccion(){
		
			return direccion;
		
	}
	
	public void setDireccion(int direccion){
		
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

	public Integer getCantbanios(){
	
		return cantBanios;

	}
	
	public void setCantbanios(int cantbanios){

		this.cantBanios = cantbanios;

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
