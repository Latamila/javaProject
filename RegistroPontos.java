
public class RegistroPontos {
	
	private CalculadoraBonus bonus;
	
	public RegistroPontos(CalculadoraBonus cb) {
		bonus = cb;
		
	}
	
	public void fazerUmComentario(Usuario u){
		u.pontos += 3 * bonus.bonus(u);
		
	}
	
	public void criarTopico(Usuario u) {
		u.pontos += 5;
		
	}
	
	public void darLike(Usuario u) {
		u.pontos += 1;
		
	}

}
