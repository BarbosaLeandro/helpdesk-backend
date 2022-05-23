package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
