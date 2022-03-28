package Codificadores;

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
        int tamanhoTexto = str.length();
        String metade1 = str.substring(0, tamanhoTexto / 2);
        String metade2 = str.substring(tamanhoTexto / 2, tamanhoTexto);
        return metade2.concat(metade1);
    }

    public String decodifica(String str) {
        int tamanhoTexto = str.length();
        String metade1 = str.substring(0, tamanhoTexto / 2);
        String metade2 = str.substring(tamanhoTexto / 2, tamanhoTexto);
        return metade2.concat(metade1);
    }
}