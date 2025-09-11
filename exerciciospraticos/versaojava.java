public class versaoJava {
    public static void main(String[] args) {
        // Pega a versão do Java instalada
        String versao = System.getProperty("java.version");

        // Mostra a versão
        System.out.println("Versão do Java instalada: " + versao);
    }
}
