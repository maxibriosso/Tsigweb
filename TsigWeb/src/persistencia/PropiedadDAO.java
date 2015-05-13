package persistencia;


import javax.ejb.Stateless;
import dominio.Propiedad;

@Stateless
public class PropiedadDAO implements IPropiedadDAO {
	
	@javax.persistence.PersistenceContext(unitName = "Tarea")
	private javax.persistence.EntityManager em;
	
	public boolean guardarPropiedad(Propiedad prop) {
		
		try {
			
			em.persist(prop);
			return true;

		} catch (Exception e) {

			e.printStackTrace();

		}

		return false;

	}

	

}
