package br.com.prog3.aula13.repository;

public interface AulaRepository {

	@Repository
	public interface AulaRepository extends CrudRepository<Aula, Long> {
	}

}
