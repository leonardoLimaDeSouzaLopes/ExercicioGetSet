import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(ler.next());
		pessoa.setNascimento(ler.next());
		pessoa.setEmail(ler.next());
		pessoa.setEstadoCivil(ler.next());
		pessoa.setGenero(ler.next());
		pessoa.setRg(ler.next());
		pessoa.setCpf(ler.nextInt());
		pessoa.setTelefone(ler.nextInt());
		pessoa.setEndereco(ler.next());
		pessoa.setCep(ler.nextInt());
		
		System.out.println(String.format("nome: %s, nascimento: %s, email: %s, estado civil: %s, genero: %s, rg: %s, cpf: %s, telefone: %s, endereco: %s, cep: %s", pessoa.getNome(), pessoa.getNascimento(), pessoa.getEmail(), pessoa.getEstadoCivil(), pessoa.getGenero(), pessoa.getRG(), pessoa.getCpf(), pessoa.getTelefone(), pessoa.getEndereco(), pessoa.getCep()));
		
		ler.close();
		
	}

}
