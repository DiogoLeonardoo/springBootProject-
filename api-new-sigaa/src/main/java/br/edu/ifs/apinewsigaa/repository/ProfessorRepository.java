package br.edu.ifs.apinewsigaa.repository;

import br.edu.ifs.apinewsigaa.model.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<ProfessorModel, Integer> {

    Optional<ProfessorModel> findByMatricula (int matricula);

    Optional<ProfessorModel> findByCpf (String cpf);

    Optional<ProfessorModel> findByEmail(String email);

    Optional<ProfessorModel> findByCelular(String celular);
}
