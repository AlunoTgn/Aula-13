package br.com.prog3.aula13.repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.prog3.aula13.domain.Curso;

@Repository
//public interface CursoRepository extends CrudRepository<Curso, Long> {

// List<Curso> findByModalidade(Modalidade modalidade);

//}

public interface CursoRepository extends JpaRepository<Curso, Long> {
	List<Curso> findByModalidade(Modalidade modalidade);
}