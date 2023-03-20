package br.edu.criandoapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.edu.criandoapi.projeto.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
