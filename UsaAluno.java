/* Daniel Henrique Alcantara Oliveira Martins  RM: 94615
 * Luís Felipe Garcia Menezes  RM: 94051
 * Vinicius Mota dos Reis  RM: 94707 
*/

package br.com.fiap;

import java.time.LocalDate;

public class UsaAluno {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno(94707, "Vinicius Mota dos Reis", 2002);
		Aluno aluno4 = new Aluno(94852, "Reinaldo da Silva Martins", 2000);
		LocalDate data1 = LocalDate.now();
		
		int anoAtual = data1.getYear();
		
		aluno1.setRm(94615);
		aluno1.setNome("Daniel Henrique Alcantara Oliveira Martins");
		aluno1.setAnoNascimento(2004);
		
		aluno2.setRm(94051);
		aluno2.setNome("Luís Felipe Garcia Menezes");
		aluno2.setAnoNascimento(2003);
		
		
		
		System.out.println("RM: " + aluno1.getRm());
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.calculaIdade(anoAtual));
		System.out.println("-----------------------------------");
		System.out.println("RM: " + aluno2.getRm());
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.calculaIdade(anoAtual));
		System.out.println("-----------------------------------");
		System.out.println("RM: " + aluno3.getRm());
		System.out.println("Nome: " + aluno3.getNome());
		System.out.println("Idade: " + aluno3.calculaIdade(anoAtual));
		System.out.println("-----------------------------------");
		System.out.println("RM: " + aluno4.getRm());
		System.out.println("Nome: " + aluno4.getNome());
		System.out.println("Idade: " + aluno4.calculaIdade(anoAtual));
	}
}
