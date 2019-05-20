package br.com.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.eventoapp.model.Convidado;
import br.com.eventoapp.model.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
}
