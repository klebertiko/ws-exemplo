package org.ws.exemplo.bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.ws.exemplo.model.Pessoa;

/**
 * Objeto de negocio de Pessoa
 * 
 * @author Kleber
 *
 */
public class PessoaBO {
	
	/** BD PHODASTICO **/
	private static final HashMap<String, Pessoa> BD;
    
	static {
    	
    	Pessoa kleber = new Pessoa();
    	kleber.setNome("Kleber");
    	kleber.setEmail("kleber@kleber.com");
    	
    	Pessoa douglas = new Pessoa();
    	douglas.setNome("Douglas");
    	douglas.setEmail("douglas@douglas.com");
    	
    	Pessoa federico = new Pessoa();
    	federico.setNome("Federico");
    	federico.setEmail("federico@federico.com");
    	
    	Pessoa andre = new Pessoa();
    	andre.setNome("Andre");
    	andre.setEmail("andre@andre.com");
    	
    	Pessoa olavo = new Pessoa();
    	olavo.setNome("Olavo");
    	olavo.setEmail("olavo@olavo.com");
    	
    	Pessoa renato = new Pessoa();
    	renato.setNome("Renato");
    	renato.setEmail("renato@renato.com");
    	
        BD = new HashMap<String, Pessoa>();
        BD.put(kleber.getNome().toUpperCase(), kleber);
        BD.put(douglas.getNome().toUpperCase(), douglas);
        BD.put(federico.getNome().toUpperCase(), federico);
        BD.put(andre.getNome().toUpperCase(), andre);
        BD.put(olavo.getNome().toUpperCase(), olavo);
        BD.put(renato.getNome().toUpperCase(), renato);
    }
	
	/**
	 * Busca uma pessoa pelo nome
	 * 
	 * @param String nome
	 * @return Pessoa pessoa
	 */
	public Pessoa buscarPorNome(String nome) {
		return BD.get(nome.toUpperCase());
	} 
	
	/**
	 * Lista pessoas
	 * 
	 * @return List<Pessoa>
	 */
	public List<Pessoa> listar() {
		ArrayList<Pessoa> pessoas = new ArrayList<>();
 		for (Entry<String, Pessoa> pessoa : BD.entrySet()) {
			pessoas.add(pessoa.getValue());
		}
 		return pessoas;
	} 
}
