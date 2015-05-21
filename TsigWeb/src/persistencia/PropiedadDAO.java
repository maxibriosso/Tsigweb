package persistencia;


import javax.ejb.Stateless;

import dominio.Casa;




@Stateless
public class PropiedadDAO implements IPropiedadDAO {
	
	@javax.persistence.PersistenceContext(unitName = "TsigWeb")
	
	private javax.persistence.EntityManager em;
	
	public boolean guardarPropiedad(Casa casa) {
		
		try {
			
			em.persist(casa);
			return true;

		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

		

	}

	

}
