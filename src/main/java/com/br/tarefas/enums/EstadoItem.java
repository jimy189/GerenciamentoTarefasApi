package com.br.tarefas.enums;

public enum EstadoItem {

    PENDENTE("P", "Pendente"),
    CONCLUIDO("C", "Concluído"),
    EM_PROGRESSO("E", "Em Progresso");

    private final String codigo;
    private final String titulo;

    EstadoItem(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }

    public static EstadoItem fromCodigo(String codigo) {
        for (EstadoItem estado : EstadoItem.values()) {
            if (estado.getCodigo().equalsIgnoreCase(codigo)) {
                return estado;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}
