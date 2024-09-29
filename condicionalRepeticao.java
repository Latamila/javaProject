
public class condicionalRepeticao {

	public static void main(String[] args) {
		int count = 0;
		
		while (count < 10) {
			System.out.println(++count);
		}
		
		int conta = 0;
		do {
			System.out.println("dentro do do-while= " + ++conta);
			
		} while (conta < 10);
		
		
		for (int i=0; i < 10; i++) {
			System.out.println("For " + i);
		}
		// TODO Auto-generated method stub
	}
}
