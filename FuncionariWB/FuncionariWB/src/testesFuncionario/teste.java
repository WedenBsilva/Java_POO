package testesFuncionario;

public class teste {
	
	public static void main(String[] args) {
		Funcionarios funcionario01 = new Funcionarios ( "Tecnologia", "Davi", 27, "Programador");
		Funcionarios funcionario02 = new Funcionarios( "Telemarketing", "Alany", 25, "Operadora");

		funcionario01.visualizar();
		funcionario02.visualizar();

	}

}
