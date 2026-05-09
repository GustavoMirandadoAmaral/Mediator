package org.example;

public class Pessoa {

    String reclamarSAC(String mensagem){
        return SAC.getInstancia().receberReclamacao(mensagem);
    };
    String duvidaSAC(String mensagem){
        return SAC.getInstancia().receberDuvida(mensagem);
    }
}
