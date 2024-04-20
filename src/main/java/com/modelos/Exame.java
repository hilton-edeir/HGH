package com.modelos;

public class Exame {
    private String id;
    private String data;
    private String descricao;
    private Tipo_Diagnostico tipoDiagnostico;

    public Exame(String id, String data, String descricao, Tipo_Diagnostico tipoDiagnostico) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.tipoDiagnostico = tipoDiagnostico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo_Diagnostico getTipoDiagnostico() {
        return tipoDiagnostico;
    }

    public void setTipoDiagnostico(Tipo_Diagnostico tipoDiagnostico) {
        this.tipoDiagnostico = tipoDiagnostico;
    }
}
