
public class PrincipalPizza {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza();
		
		p1.adicionaIngredientes("queijo");
		p1.adicionaIngredientes("molho");
		p1.adicionaIngredientes("calabresa");
		p1.adicionaIngredientes("oregano");
		p1.adicionaIngredientes("catupiry");
		p1.adicionaIngredientes("frango");
		p1.getPreco();
		p1.imprimir();
		
		
		Pizza p2 = new Pizza();
		p2.adicionaIngredientes("queijo");
		p2.adicionaIngredientes("molho");
		p2.adicionaIngredientes("calabresa");
	
		p2.getPreco();
		p2.imprimir();
		
		Pizza p3 = new Pizza();
		p3.adicionaIngredientes("queijo");
		p3.adicionaIngredientes("molho");
		p3.adicionaIngredientes("calabresa");
		p3.adicionaIngredientes("queijo");
		p3.adicionaIngredientes("molho");
		p3.adicionaIngredientes("calabresa");
		p3.adicionaIngredientes("oregano");
		p3.adicionaIngredientes("catupiry");
		p3.adicionaIngredientes("frango");
		
	
		p3.getPreco();
		p3.imprimir();
		
		CarrinhoDePizza carrinho = new CarrinhoDePizza();
		carrinho.adicionarPizza(p1);
		carrinho.adicionarPizza(p2);
		carrinho.adicionarPizza(p3);
		System.out.println("Valor total da compra: R$ "+carrinho.calcularValorTotal());
		
		// TODO Auto-generated method stub

		
	}


}
