
/**
 *
 * @author Gustavo Nunes Wawrick
 */
public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno() {
        nome = "";
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome + "\n"
                + "Nota 1: " + nota1 + "\n"
                + "Nota 2: " + nota2 + "\n"
                + "Nota 3: " + nota3);
    }

}
