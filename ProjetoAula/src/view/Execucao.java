package view;

import model.Pessoa;

public class Execucao {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Guilherme Tamura");
		pessoa.setEndereco("Av. Águia de Haia");
		pessoa.setBairro("A.E Carvalho");
		pessoa.setCep((long) 11415632);
		pessoa.setCidade("São Paulo");
		pessoa.setEstado("São Paulo");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getCep());
		System.out.println(pessoa.getCidade());
		System.out.println(pessoa.getEstado());
	}

}
