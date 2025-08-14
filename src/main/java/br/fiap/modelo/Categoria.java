package br.fiap.modelo;

public class Categoria {
    private Long id;
    private String categoria;

    public Categoria (Long id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }
}
