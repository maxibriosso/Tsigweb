package controladores;


import javax.ejb.EJB;
import javax.ejb.Stateless;

import dominio.Propiedad;
import persistencia.IPropiedadDAO;
import controladores.IPropiedadController;

@Stateless
public class PropiedadController implements IPropiedadController{

	@EJB
	private IPropiedadDAO PropiedadDAO;
	
	
	public boolean guardarPropiedad(int idProp, String direccion,String barrio,String tipoProp, int cantBanios, int cantCuartos,boolean piscina, boolean garage) {
		try{
							
			Propiedad p = new Propiedad(idProp,direccion,barrio,tipoProp,cantBanios, cantCuartos, piscina, garage);
			return PropiedadDAO.guardarPropiedad(p);				
			
		
		}		
			
		catch(Exception e){
			e.printStackTrace();
			return false;
		}		
		
	}


		
	
}
