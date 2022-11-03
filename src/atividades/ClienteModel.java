package atividades;

public class ClienteModel {
	
	private String nome;
	private int idade;
	private String sexo;
	private String CPF;
	private String RG;
	//--- menu SOURCE,GENERATE CONSTRUCTOR USING FIELDS
	public ClienteModel(String nome, int idade, String sexo, String cPF, String rG) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		CPF = cPF;
		RG = rG;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	
	public void visualizar() {
		
        System.out.println("*************************************************************** ");
        System.out.println("*************************************************************** ");
        System.out.println("                                                                ");
        System.out.println("                                                                ");
        System.out.println("                       RECEITA FEDERAL                          ");
        System.out.println("                                                                ");
        System.out.println("                                                                ");
        System.out.println("*************************************************************** ");
        System.out.println("*************************************************************** ");
        System.out.println("\n Nome do cliente: " + this.nome);
        System.out.println("\n idade do cliente: " + this.idade);
        System.out.println("\n Sexo do cliente: " + this.sexo);
        System.out.println("\n RG do cliente: " + this . RG);
        System.out.println("\n CPF do cliente: " + this. CPF);
        
	}
	
}
