/* Daniel Henrique Alcantara Oliveira Martins  RM: 94615
 * Luís Felipe Garcia Menezes  RM: 94051
 * Vinicius Mota dos Reis  RM: 94707 
*/
package br.com.fiap;

import java.time.LocalDate;

public class Aluno {
	private int rm, anoNascimento;
	private String nome;
	
	public Aluno() {
		
	}
	
	public Aluno(int rm, String nome, int anoNascimento) {
		this.nome = nome;
		setRm(rm);
		setAnoNascimento(anoNascimento);
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		try {
			if (rm >= 80000 && rm <= 99999) {
				this.rm = rm;
			} else {
				throw new Exception("Valor do RM Invalido (80000 - 99999)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		LocalDate anoAtual = LocalDate.now();
		try {
			if (anoNascimento >= 1900 &&  anoNascimento <= anoAtual.getYear()) {
				this.anoNascimento = anoNascimento;
			} else {
				throw new Exception("Valor inválido(1900 - ano atual)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calculaIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;
	}

}
