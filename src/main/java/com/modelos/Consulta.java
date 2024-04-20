package com.modelos;

public class Consulta {
    private int id;
    private String data;
    private String descricao;
    private Paciente paciente;
    private Tratamento tratamento;
    private Receita_Medica receita_medica;
    private Exame exame;

    public Consulta(int id, String data, String descricao, Paciente paciente, Tratamento tratamento, Receita_Medica receita_medica, Exame exame) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.paciente = paciente;
        this.tratamento = tratamento;
        this.receita_medica = receita_medica;
        this.exame = exame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public Receita_Medica getReceita_medica() {
        return receita_medica;
    }

    public void setReceita_medica(Receita_Medica receita_medica) {
        this.receita_medica = receita_medica;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }
}
