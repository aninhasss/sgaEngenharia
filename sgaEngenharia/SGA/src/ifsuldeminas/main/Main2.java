package ifsuldeminas.main;
import ifsuldeminas.alunos.Aluno;
import ifsuldeminas.funcionarios.Professor;
import ifsuldeminas.academico.Disciplina;
import java.util.Scanner;

public class Main2 {
	
	public static void main2(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.printf("(0)Desmatricular todos os alunos \n(1)Imprimir informa��es da disciplina \n(2)Apresentar n�mero de alunos na disciplina, n�mero de reprovados e n�mero de aprovados \n(3)Imprimir Aprovados \n(4)Imprimir reprovados \n(5)Imprimir aluno com a maior e o aluno com menor nota \n(6)Imprimir o professor respons�vel \n(7)Imprimir m�dia total da turma e listar todos os alunos acima da m�dia \n(8)Imprimir m�dia total da turma e listar todos os alunos abaixo da m�dia \n(9)Imprimir nome dos alunos e suas respectivas notas e aproveitamento \n(10)Imprimir alunos ordenados por nota \n(11)Matricular aluno \n\nEscolha uma das op��es acima: ");
			int opcao = sc.nextInt();
			
			int valor;
			
			if (opcao==0) {
				valor=500;
			}
			else {
				valor=600;
			}
			
			System.out.println("\nValor a ser pago: R$" + valor);
		}
	}
}
