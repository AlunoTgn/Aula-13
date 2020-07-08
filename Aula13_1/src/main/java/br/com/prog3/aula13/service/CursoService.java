package br.com.prog3.aula13.service;

import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.prog3.aula13.domain.Curso;
import br.com.prog3.aula13.dto.CursoDTO;
import br.com.prog3.aula13.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;

	// @RestController
	// @RequestMapping("/api/v1/cursos")
	// @Autowired
	// private CursoService cursoService;

	// public Curso save(Curso curso) {
	// return cursoRepository.save(curso);

	// public List<Curso> findAll() {
	// return (List<Curso>) cursoRepository.findAll();
	// }

	// public Optional<Curso> findById(Long id) {
	// return cursoRepository.findById(id);
	// }

	// public Curso update(Curso curso) {
	// return cursoRepository.save(curso);
	// }

	// public void deleteById(Long id) {
	// cursoRepository.deleteById(id);

	// public List<Curso> findByModalidade(Modalidade modalidade){
	// return (List<Curso>) cursoRepository.findByModalidade(modalidade);

	public List<CursoDTO> findAll() {
		return cursoRepository.findAll().stream().map(curso -> new CursoDTO(curso)).collect(Collectors.toList());
	}
}
