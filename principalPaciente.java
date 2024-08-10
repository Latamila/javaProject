
public class principalPaciente {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente();
		paciente1.peso = 81;
		paciente1.altura = 1.70;
		
		Paciente paciente2 = new Paciente();
		paciente2.peso = 60;
		paciente2.altura = 1.80;
		
		Paciente paciente3= new Paciente();
		paciente3.peso = 130;
		paciente3.altura = 1.90;
		
		
		paciente1.calcularIMC();
		paciente1.diagnostico();
		paciente1.recomendar();
		
		paciente2.calcularIMC();
		paciente2.diagnostico();
		paciente2.recomendar();
		
		paciente3.calcularIMC();
		paciente3.diagnostico();
		paciente3.recomendar();
		// TODO Auto-generated method stub

	}

}
