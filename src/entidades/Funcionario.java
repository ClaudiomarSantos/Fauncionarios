package entidades;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario() {
	}

	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public double AumSal(double percentual) {
		return salario += salario * (percentual / 100);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "id: " + id 
				+ " nome: " + nome 
				+ " salario: " + salario;  
	}
	
	

}
