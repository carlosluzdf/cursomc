package com.carlosluz.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosluz.cursomc.domain.Categoria;
import com.carlosluz.cursomc.repositories.CategoriaRepository;
import com.carlosluz.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar( Integer id ) {
		Optional<Categoria> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

//	public Categoria buscar( String nome ) {
//		Optional<Categoria> obj = repo.findOne(nome);
//
//		return obj.orElse(null);
//	}
}
