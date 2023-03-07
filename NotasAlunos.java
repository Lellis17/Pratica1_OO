import java.util.Scanner;
public class NotasAlunos {
    public static void main(String[] args) {
    }
    public String nome;
    public String matricula;
    public double notaAv1, notaAv2, notaAe;
    public String curso;
    public int periodo;
    double media;

    Scanner ler = new Scanner(System.in);

    public NotasAlunos(String nome, String matricula, double notaAv1, double notaAv2, double notaAe, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
        this.notaAe = notaAe;
        this.curso = curso;
        this.periodo = periodo;

        System.out.println("Digite a nota da AV1:");
        notaAv1 = ler.nextDouble();
        System.out.println("Digite a nota da AV2:");
        notaAv2 = ler.nextDouble();

        media = (notaAv1 + notaAv2) / 2;
        System.out.println("O valor da media é:" + media);

        if (media >= 60) {
            System.out.println("Aluno aprovado!");

        } else {
            System.out.println("Aluno em recuperacao!");
        }
        media = (media + notaAe);
        if (media >= 60) {
            System.out.println("Aluno aprovado!");

        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}