package com.kato.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kato.cursomc.domain.Categoria;
import com.kato.cursomc.repositories.CategoriaRepository;
import com.kato.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class CategoriaService {
	
	//
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id " + id + ", Tipo: " + Categoria.class.getName()));
		//return obj.orElse(null);
	}
}
