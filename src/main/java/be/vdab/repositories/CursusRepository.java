package be.vdab.repositories;

public class CursusRepository extends AbstractRepository {
	public List<Cursus> findByNaamContains(String woord) {
		return getEntityManager().createNamedQuery("Cursus.findByNaamContains",
				Cursus.class)
				.setParameter("zoals", '%' + woord + '%')
				.getResultList();
	}
}