package com.valdir.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.helpdesk.domain.Chamado;
import com.valdir.helpdesk.domain.Cliente;
import com.valdir.helpdesk.domain.Tecnico;
import com.valdir.helpdesk.enums.Perfil;
import com.valdir.helpdesk.enums.Prioridade;
import com.valdir.helpdesk.enums.Status;
import com.valdir.helpdesk.repositories.ChamadoRepository;
import com.valdir.helpdesk.repositories.PessoaRepository;

@Service
public class DBService { 

	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "65478932125", "desisto@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Cesar", "12345678920", "cesar@mail.com", "123");
		Tecnico tec3 = new Tecnico(null, "Valdir", "98765432121", "valdir@mail.com", "123");
		Tecnico tec4 = new Tecnico(null, "Jucicleiton", "74125896322", "juci@mail.com", "123");
		Tecnico tec5 = new Tecnico(null, "Enaldir", "36985214723", "enaldir@mail.com", "123");
		Tecnico tec6 = new Tecnico(null,"aldair","56465487974","aldair@mail.com", "123");

		Cliente cli1 = new Cliente(null, "Linus", "80527954780", "torvalds@mail.com", "123");
		Cliente cli2 = new Cliente(null, "Leo", "80527912345", "tor@mail.com", "123");
		Cliente cli3 = new Cliente(null, "Lola", "80527954321", "valds@mail.com", "123");
		Cliente cli4 = new Cliente(null, "Robis", "80527998765", "rvalds@mail.com", "123");
		Cliente cli5 = new Cliente(null, "Sena", "80527963254", "orvas@mail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIO, Status.ANDAMENTO, "Chamado 01", "teste chamado 1", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTO, Status.ANDAMENTO, "Chamado 02", "teste chamado 2", tec2, cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXO, Status.ANDAMENTO, "Chamado 03", "teste chamado 3", tec3, cli3);
		Chamado c4 = new Chamado(null, Prioridade.MEDIO, Status.ABERTO, "Chamado 04", "teste chamado 4", tec4, cli4);
		Chamado c5 = new Chamado(null, Prioridade.ALTO, Status.FECHADO, "Chamado 05", "teste chamado 5", tec5, cli5);

		pessoaRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5, tec6, cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
	
	}
}
