public class PrecoMedioBombom {
    public static void main(String[] args) {
        // preço das últimas 3 vendas realizadas 
        int preco1 = 4;
        int preco2 = 8;
        int preco3 = 12;

        int mediaPrecos = (preco1 + preco2 + preco3) / 3;

        System.out.println("\"Sistema de Cálculo de Media\"");
        System.out.println("Preço 1: " + preco1);
        System.out.println("Preço 2: " + preco2);
        System.out.println("Preço 3: " + preco3);
        System.out.println("\nMedia dos preços: \n" + mediaPrecos);
    }
}
