package view;

import javax.swing.JOptionPane;

import model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		pessoa.setEndereco("Rua Confiss�o");
		pessoa.setCep(525);
		pessoa.setBairro("Gleba Do Pessego");
		pessoa.setCidade("S�o Paulo");
		pessoa.setEstado("S�o Paulo");
		
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getCep());
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getCidade());
		System.out.println(pessoa.getEstado());

	}

}
