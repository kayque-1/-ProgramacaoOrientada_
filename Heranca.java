
public class Heranca {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.emitirSom();

        Cachorro c = new Cachorro();
        c.nome = "Rex";
        c.raca = "Carne corso";
        c.peso = "47";
        c.emitirSom();
        System.out.println("Nome do cachorro: " + c.nome);
        System.out.println("Raca do cachorro: " + c.raca);
        System.out.println("Peso do cachorro: " + c.peso);
      
        Gato g = new Gato();
        g.nome = "Mimi";
        g.raca = "Persa";
        g.peso = "4,5";
        g.emitirSom();
        System.out.println("Nome do gato: " + g.nome);
        System.out.println("Raca do gato: " + g.raca);
        System.out.println("Peso do gato: " + g.peso);
      
        Cavalo cv = new Cavalo();
        cv.nome = "Serena";
        cv.raca = "Quarto de milha";
        cv.peso = "480";
        cv.emitirSom();
        System.out.println("Nome do cavalo: " + cv.nome);
        System.out.println("Raca do cavalo: " + cv.raca);
        System.out.println("Peso do cavalo: " + cv.peso);

        Camelo ca = new Camelo();
        ca.nome = "Sheik";
        ca.raca = "Dromedario";
        ca.peso = "500";
        ca.emitirSom();
        System.out.println("Nome do camelo: " + ca.nome);
        System.out.println("Raca do camelo: " + ca.raca);
        System.out.println("Peso do camelo: " + ca.peso);

        Tubarao t = new Tubarao();
        t.nome = "Assasino";
        t.raca = "Tubarao-tigre";
        t.peso = "850";
        t.emitirSom();
        System.out.println("Nome do tubarao: " + t.nome);
        System.out.println("Raca do tubarao: " + t.raca);
        System.out.println("Peso do tubarao: " + t.peso);
    }
}
