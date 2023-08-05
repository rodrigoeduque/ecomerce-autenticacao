package br.com.rodrigoeduque.ecomerceautenticacao.domain;

public enum Tipo {
    CLIENTE("Cliente"),
    ADMINISTRADOR("Administrador"),
    OUTRO("Outro");

    private final String descricao;

    Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
