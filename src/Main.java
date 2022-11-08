import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Funcionario f = new Funcionario("João", "Victor", "012-345-678-90", 4500d);
		Funcionario f1 = new Funcionario("Lara", "Fernandes", "012-345-678-90", 4500d);
		Funcionario f2 = new Funcionario("Carlos", "Eduardo", "012-345-678-90", 4500d);
		Funcionario f3 = new Funcionario("GabriEU", "Henrique", "012-345-678-90", 4500d);
		
		Empresa ltda = new Empresa("01. 234. 567/0001-89", "Alunos Anonimos");
		ltda.funcionarios.add(f);
		ltda.funcionarios.add(f1);
		ltda.funcionarios.add(f2);
		ltda.funcionarios.add(f3);
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("empregados.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ltda.funcionarios);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}  
		
		List<Funcionario> funcionarios = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("empregados.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			funcionarios = (List<Funcionario>) ois.readObject();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}  
		
		for (Funcionario c : funcionarios) {
			System.out.println(c.toString());
			System.out.println(" ------------------ ");
		}
	}
}
