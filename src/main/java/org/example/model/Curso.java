package org.example.model;
public class Curso extends  Conteudo {

    private int cargaHoraria;

    public Curso() {

    }

    public Curso(String descricao, String titulo) {
        super(descricao, titulo);
    }

    public Curso(String descricao, String titulo, int cargaHoraria) {
        super(descricao, titulo);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                ", descricao='" + getDescricao() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                '}';
    }
}
