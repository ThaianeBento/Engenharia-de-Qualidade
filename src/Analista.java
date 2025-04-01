public class Analista extends Funcionario{
    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.1; // Bônus de 10%
    }
}
