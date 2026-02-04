import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        //                 expressão booleana    valor caso verdadeiro     valor caso falso
        String indicacao = (idade >= 18)        ? "Adulto"                : "criança/adolescente";

        System.out.println("Resultado: " + indicacao);
    }
}
