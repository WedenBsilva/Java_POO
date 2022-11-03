package atividades;

public class TestaCliente {

	public static void main(String[] args) {
		ClienteModel cliente01 = new ClienteModel("Weden",80,"Masculino","3121531513","4654645");
		ClienteModel cliente002 = new ClienteModel("Paula",19,"Femenino","645654656456","3584657");
		cliente01.visualizar();
		cliente002.visualizar();
		
	}

}
