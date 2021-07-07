public abstract class Funcionarios {
    public static double salario;
    public double imposto;

    public double setSalario(double salario) { return this.salario = salario;}
    public double calculaImposto() { return this.salario * imposto; }
}