package Codificadores;

import java.util.Collections;

public class Codifica161113295 implements Codifica {

    private final int chave = 161113295;

    // Retorna o autor do codificador
    public String getNomeAutor() {
        return "Leticia Bento do Carmo";
    }

    // Retorna a matrícula do autor do codificador
    public String getMatriculaAutor() {
        return "16111329-5";
    }

    public String codifica(String str) {
        String[] listPalavras = str.split(" ");
        String frase = "";
        for (int i = listPalavras.length - 1; i >= 0; i--) {
            frase += listPalavras[i] + " ";
        }
        return frase;
    }

    public String decodifica(String str) {
        String[] listPalavras = str.split(" ");
        String frase = "";
        for (int i = listPalavras.length - 1; i >= 0; i--) {
            frase += listPalavras[i] + " ";
        }
        return frase;
    }
}