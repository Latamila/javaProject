import java.util.ArrayList;
import java.util.List;

public class Pizza {
	String ingrediente;
	int qtdIngrediente = 0;
	int preco = 0;
	
	
	
	void contabilizaIngrediente() {
		qtdIngrediente++;
	}
	
	public void adicionaIngredientes(String ingrediente) {
		contabilizaIngrediente();
		System.out.println(ingrediente);
	}
	

	public int getPreco() {
		if(qtdIngrediente == 0) {
			throw new IllegalArgumentException("Pizza sem ingredientes não pode ser adicionada");
		}
		if(qtdIngrediente < 3) {
			preco = 15;
		}
		if(qtdIngrediente >= 3 && qtdIngrediente <= 5) {
			preco = 20;
		}
		if(qtdIngrediente > 5) {
			preco = 23;
		}
		return preco;
	}

	
	void imprimir() {
		System.out.println("Sua pizza de "+qtdIngrediente+" ingredientes custará: R$ " +getPreco()+" reais.");
		
	}
}

class CarrinhoDeCompras {
    private List<Pizza> pizzas;

    public CarrinhoDeCompras() {
        this.pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        this.pizzas.add(pizza);
        
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Pizza pizza : pizzas) {
            total += pizza.getPreco();
        }

        return total;
    }
}
