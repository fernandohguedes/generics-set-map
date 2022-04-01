package hashcodeAndEquals;

import hashcodeAndEquals.entities.Client;

public class Program {

    public static void main(String[] args) {

        Client client1 = new Client("Maria", "maria@gmail.com");
        Client client2 = new Client("Alex", "alex@gmail.com");

        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());

        // comparação do conteúdo dos objetos
        System.out.println(client1.equals(client2));

        // comparação da referência de memória alocada para os objetos
        System.out.println(client1 == client2);

    }
}
