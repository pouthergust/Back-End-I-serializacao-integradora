import java.io.Serializable;

public class Funcionario implements Serializable {

	private String nome;
	private String sobrenome;
	private String doc;
	private double salario;
	
	public Funcionario(String nome, String sobrenome, String doc, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.doc = doc;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "nome: " + this.nome + " " + this.sobrenome + "\nsalario: " + this.salario ;
 	}
		
	
}
