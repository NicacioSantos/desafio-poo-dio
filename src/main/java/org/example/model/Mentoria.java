package org.example.model;

import java.time.LocalDate;

public class Mentoria extends  Conteudo {


    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(String descricao, String titulo, LocalDate data) {
        super(descricao, titulo);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 30;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                ", descricao='" + getDescricao() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                '}';
    }
}
