package com.mariano.ecommerce.enums;

public enum TipoEndereco {

    COBRANCA("Cobranca"),
    ENTREGA("Entrega");

    private String descricao;

    private TipoEndereco(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
