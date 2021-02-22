package lista1;

public class RodaAlunosNotas {

	public static void main(String[] args) {
		
		AlunosNotas aluno1 = new AlunosNotas();
		
		aluno1.setAluno("Guilherme");
		aluno1.setNotap1(9.25f);
		aluno1.setNotap2(7.5f);
		aluno1.setTrabalho(6);
		aluno1.calculaMedia();
		
		System.out.println("A média do aluno " + aluno1.getAluno() + " é: " +aluno1.getMedia());
		
	AlunosNotas aluno2 = new AlunosNotas();
		
		aluno2.setAluno("Andressa");
		aluno2.setNotap1(5.3f);
		aluno2.setNotap2(6.5f);
		aluno2.setTrabalho(8.2f);
		aluno2.calculaMedia();
		
		System.out.println("A média da aluna " + aluno2.getAluno() + " é: " +aluno2.getMedia());

	}

}
