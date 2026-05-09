package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveReceberReclamacaoNoSAC() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Obrigado por entrar em contato com o SAC.\nSAC >> " +
                        "Iremos estudar para entender se o ponto é uma reclamação válida: Lentidão no sistema",
                funcionario.reclamarSAC("Lentidão no sistema"));
    }

    @Test
    void deveReceberDuvidaNoSAC() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Obrigado por entrar em contato com o SAC.\nSAC >> " +
                        "Iremos melhorar nosso serviço para sanar dúvidas como: Qual o horário de funcionamento?",
                funcionario.duvidaSAC("Qual o horário de funcionamento?"));
    }

}