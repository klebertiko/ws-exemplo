package org.ws.exemplo.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.ws.exemplo.bo.PessoaBO;
import org.ws.exemplo.model.Pessoa;

/**
 * Objeto de exposição de serviços de Pessoa
 * 
 * @author Kleber
 *
 */
@WebService
public class PessoaWS {
	
	// Objeto de negocio de Pessoa
	private PessoaBO pessoaBO = new PessoaBO();

	/**
	 * Metodo de consulta pessoa por nome
	 * @param nome
	 * @return
	 */
	@WebMethod
	public Pessoa buscarPorNome(String nome) {
		return this.pessoaBO.buscarPorNome(nome);
	}
	
	/**
	 * Metodo de consulta pessoa por nome
	 * @param nome
	 * @return
	 */
	@WebMethod
	public List<Pessoa> listar() {
		return this.pessoaBO.listar();
	}
}
