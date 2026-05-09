package org.example;

public class SAC {

    private static SAC instancia = new SAC();
    private SAC() {}
    public static SAC getInstancia() {
        return instancia;
    }

    String receberReclamacao(String mensagem){
        return "Obrigado por entrar em contato com o SAC.\n"+
                "SAC >> " + Suporte.getInstancia().receberReclamacao(mensagem);
    };

    String receberDuvida(String mensagem){
        return "Obrigado por entrar em contato com o SAC.\n"+
                "SAC >> " + Suporte.getInstancia().receberDuvida(mensagem);
    };
}
