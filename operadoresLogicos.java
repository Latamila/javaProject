public class operadoresLogicos {
    public static void main(String[] args){
        int idade = 35;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        
        System.out.println("Dentro da lei maior que 30? "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("Dentro da lei menor que 30? "+isDentroDaLeiMenorQueTrinta);

}
}
