package controladores;


import javax.ejb.EJB;
import javax.ejb.Stateless;

import dominio.Casa;
import persistencia.IPropiedadDAO;
import controladores.IPropiedadController;

@Stateless
public class PropiedadController implements IPropiedadController{

	@EJB
	private IPropiedadDAO PropiedadDAO;
	
	

	public boolean guardarCasa(int idCasa,String titulo, int direccion,String barrio,String tipoProp, int cantBanios, int cantCuartos,boolean piscina, boolean garage) {
		try{
							

			Casa c = new Casa(idCasa,titulo,direccion,barrio,tipoProp,cantBanios, cantCuartos, piscina, garage);
			
			return PropiedadDAO.guardarPropiedad(c);				

			
		
		}		
			
		catch(Exception e){
			e.printStackTrace();
			return false;
		}		
		
	}


		
	
}
