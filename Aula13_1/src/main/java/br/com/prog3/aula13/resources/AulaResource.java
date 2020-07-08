package br.com.prog3.aula13.resources;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.prog3.aula13.domain.Aula;
import br.com.prog3.aula13.service.AulaService;

public class AulaResource {

	@Autowired
	private AulaService aulaService;

	@GetMapping
	public ResponseEntity<List> findAll() {
		List aulas = aulaService.findAll();
		if (aulas == null || ((Optional<Aula>) aulas).isEmpty()) {
			return new ResponseEntity<List>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List>(aulas, HttpStatus.OK);
	}

	@PostMapping
	public Aula create(@RequestBody Aula aula) {
		return aulaService.save(aula);
	}

	@GetMapping(path = { "/{id}" })
	public ResponseEntity<?> findById(@PathVariable Long id) {
		return aulaService.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping(value="/{id}")
	public ResponseEntity<Aula> update(@PathVariable("id") Long id,
	@RequestBody Aula aula) {
		return aulaService.findById(id)
	.map(record -> {
	record.setTempoDuracao(aula.getTempoDuracao());
	record.setDescricao(aula.getDescricao());
	record.setCurso(aula.getCurso());
	Aula updated = aulaService.save(record);
	return ResponseEntity.ok().body(updated);
	}).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable Long id) {
		return aulaService.findById(id).map(record -> {
			aulaService.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}
}


