import java.util.*;
public class principalPessoa {

	public static void main(String[] args) {
		Pessoa cliente1 = new Pessoa();
		Scanner valor = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade = valor.nextInt();
		
		Scanner crianca = new Scanner(System.in);
		System.out.println("Informe a idade da criança mais nova: ");
		int idadeCrianca = crianca.nextInt();
		
		cliente1.idade = idade;
		cliente1.qtdcriancas = 1;
		cliente1.deficiencia = true;
		cliente1.idadeCriancaMaisNova = idadeCrianca;
		
		
		if(cliente1.idade > 60 || cliente1.deficiencia == true || cliente1.idadeCriancaMaisNova < 2) {
			cliente1.serAtendido();			
		} else {
		cliente1.pedeSenha();
		cliente1.sentar();
		
		}
		// TODO Auto-generated method stub

	}

}
