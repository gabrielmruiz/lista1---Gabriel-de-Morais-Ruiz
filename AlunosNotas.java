package lista1;

public class AlunosNotas {
	//Atributos
	private String aluno;
	private double notap1, notap2, trabalho, media;
	
	//Construtor
	public AlunosNotas() {
		this.notap1 = 6.0f;
		this.notap2 = 6.0f;
		this.trabalho = 6.0f;
	}
	
	//Getters e Setters
	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public double getNotap1() {
		return notap1;
	}

	public void setNotap1(float notap1) {
		this.notap1 = notap1;
	}

	public double getNotap2() {
		return notap2;
	}

	public void setNotap2(float notap2) {
		this.notap2 = notap2;
	}

	public double getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(float trabalho) {
		this.trabalho = trabalho;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
		
	//Métodos Personalizados
	public void calculaMedia() {
		
		media = (this.notap1 + this.notap2 + this.trabalho)/3;
	}
	
	public void situacao() {
		if (media>=6.0f) {
			System.out.println("Aluno aprovado!");
		} else if (media>=4) {
			System.out.println("Aluno fará o IFA.");
		} else {
			System.out.println("Aluno reprovado.");
		}
	}

}
