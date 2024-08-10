
public class Paciente {
	double peso;
	double altura;
	double imc;
	double pesominimo;
	double pesomaximo;
	
	public void diagnostico() {
		if(imc < 16) {
			System.out.println("Baixo peso muito grave");
		}
		if(imc >= 16 && imc <= 16.99) {
			System.out.println("Baixo peso grave");
		}
		if(imc >= 17 && imc <= 18.49) {
			System.out.println("Baixo peso");
		}
		if(imc >= 18.50 && imc <= 24.99) {
			System.out.println("Peso normal");
		}
		if(imc >= 25.0 && imc <= 29.99) {
			System.out.println("Sobrepeso");
		}
		if(imc >= 30.0 && imc <= 34.99) {
			System.out.println("Obesidade grau I");
		}
		if(imc >= 35.0 && imc <= 39.99) {
			System.out.println("Obesidade grau II");
		}
		if(imc >= 40.0) {
			System.out.println("Obesidade grau III (obesidade mórbida)");
		}
		
	}

	public void calcularIMC() {
		imc = peso / (altura *altura);
		System.out.println("IMC: "+imc);
		// TODO Auto-generated method stub
		
	}
	
	public void recomendar() {
		pesominimo = 18.50 * altura * altura;
		pesomaximo = 24.99 * altura * altura;
		System.out.println("Baseado na sua altura, seu peso deveria se manter entre "+pesominimo+" e "+pesomaximo+" .");
		
	}
}
	
	
