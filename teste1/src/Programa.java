public class Programa{
    public static void main(String[] args){
        Gerente gerente1 = new Gerente();
        gerente1.setSalario(1000.0);
        System.out.println("Cargo: Gerente");
        System.out.println("O salário é de: R$" + Funcionarios.salario);
        System.out.println("O imposto pago será de: R$" + gerente1.calculaImposto());
        System.out.println("O salario final é de: R$" + (gerente1.salario - gerente1.calculaImposto()));
        System.out.println();

        Supervisor supervisor1 = new Supervisor();
        supervisor1.setSalario(800.0);
        System.out.println("Cargo: Supervisor");
        System.out.println("O salário é de: R$" + Funcionarios.salario);
        System.out.println("O imposto pago será de: R$" + supervisor1.calculaImposto());
        System.out.println("O salario final é de: R$" + (supervisor1.salario - supervisor1.calculaImposto()));
        System.out.println();

        Atendente atendente1 = new Atendente();
        atendente1.setSalario(600.0);
        System.out.println("Cargo: Atendente");
        System.out.println("O salário é de: R$" + Funcionarios.salario);
        System.out.println("O imposto pago será de: R$" + atendente1.calculaImposto());
        System.out.println("O salario final é de: R$" + (atendente1.salario - atendente1.calculaImposto()));
    }
}
