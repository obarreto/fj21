package br.com.caelum.jdbc.teste;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.getLista();
		
		String result;
		SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.YY h:mm a");
		
		for(Contato contato: contatos) {
			
			result = formatter.format(contato.getDataNascimento().getTime());
			
			System.out.println("Nome: "+contato.getNome());
			System.out.println("Email: "+contato.getEmail());
			System.out.println("Endereço: "+contato.getEndereco());
			System.out.printf("Data de Nascimento: "+ result + "\n");
		}
	}
}
