package com.valdir.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.helpdesk.domain.Chamado;
import com.valdir.helpdesk.domain.Cliente;
import com.valdir.helpdesk.domain.Tecnico;
import com.valdir.helpdesk.domain.enums.Perfil;
import com.valdir.helpdesk.domain.enums.Prioridade;
import com.valdir.helpdesk.domain.enums.Status;
import com.valdir.helpdesk.repositories.ChamadoRepository;
import com.valdir.helpdesk.repositories.ClienteRepository;
import com.valdir.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "13521843629", "valdir2@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@mail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIO, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));

		
	}
}