import java.util.Date;
 
public class Escola {
 
   // Classe Pessoa
   public static class Pessoa {
       public String nome;
       public String cpf;
       public Date dataNascimento;
 
       // Construtor
       public Pessoa(String nome, String cpf, Date dataNascimento) {
           this.nome = nome;
           this.cpf = cpf;
           this.dataNascimento = dataNascimento;
       }
 
       // Método para calcular o valor das cópias
       public double tirarCopias(int qtd) {
           return 0.10 * qtd; // Preço base
       }
   }
 
   // Subclasse Aluno
   public static class Aluno extends Pessoa {
       public String matricula;
 
       // Construtor
       public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
           super(nome, cpf, dataNascimento);
           this.matricula = matricula;
       }
 
       // Sobrescrita do método tirarCopias
       @Override
       public double tirarCopias(int qtd) {
           return 0.07 * qtd; // Preço para alunos
       }
   }
 
   // Subclasse Professor
   public static class Professor extends Pessoa {
       public double salario;
       public String disciplina;
 
       // Construtor
       public Professor(String nome, String cpf, Date dataNascimento, double salario, String disciplina) {
           super(nome, cpf, dataNascimento);
           this.salario = salario;
           this.disciplina = disciplina;
       }
   }
 
   // Subclasse Funcionario
   public static class Funcionario extends Pessoa {
       public double salario;
       public String cargo;
       public Date dataAdmissao;
 
       // Construtor
       public Funcionario(String nome, String cpf, Date dataNascimento, double salario, String cargo, Date dataAdmissao) {
           super(nome, cpf, dataNascimento);
           this.salario = salario;
           this.cargo = cargo;
           this.dataAdmissao = dataAdmissao;
       }
   }
 
   // Classe de Teste
   public static void main(String[] args) {
       // Criando objetos
       Aluno aluno = new Aluno("José Francisco", "123.456.789-00", new Date(), "A001");
       Professor professor = new Professor("Maria Souza", "987.654.321-00", new Date(), 5000.00, "Matemática");
       Funcionario funcionario = new Funcionario("Carlos Pereira", "111.222.333-44", new Date(), 2000.00, "Secretário", new Date());
 
       // Exibindo os resultados
       System.out.println("Aluno: " + aluno.nome + " | Custo das cópias: R$ " + aluno.tirarCopias(100));
       System.out.println("Professor: " + professor.nome + " | Custo das cópias: R$ " + professor.tirarCopias(100));
       System.out.println("Funcionário: " + funcionario.nome + " | Custo das cópias: R$ " + funcionario.tirarCopias(100));
   }
}
