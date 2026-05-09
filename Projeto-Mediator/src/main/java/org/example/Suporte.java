package org.example;

public class Suporte {

    private static Suporte instancia = new Suporte();
    private Suporte() {}
    public static Suporte getInstancia() {
        return instancia;
    }

    String receberReclamacao(String mensagem){
        return "Iremos estudar para entender se o ponto é uma reclamação válida: " + mensagem;
    };
    String receberDuvida(String mensagem){
        return "Iremos melhorar nosso serviço para sanar dúvidas como: " + mensagem;
    }
}
