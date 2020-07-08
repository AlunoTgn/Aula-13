package br.com.prog3.aula13.service;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.prog3.aula13.domain.Aula;
import br.com.prog3.aula13.repository.AulaRepository;

@Service
public class AulaService {

	@Autowired
	private AulaRepository aulaRepository;

	public Aula save(Aula aula) {
		return aulaRepository.save(aula);
	}

	public List<Aula> findAll() {
		return (List<Aula>) aulaRepository.findAll();
	}

	public Optional<Aula> findById(Long id) {
		return aulaRepository.findById(id);
	}

	public Aula update(Aula aula) {
		return aulaRepository.save(aula);
	}

public void deleteById(Long id) {
	aulaRepository.deleteById(id)
}
}