package com.models;

public class Endereco {
    private String rua;
    private String numero_porta;
    private String distrito;
    private String codigo_postal;
    private String pais;

    public Endereco(String rua, String numero_porta, String distrito, String codigo_postal, String pais) {
        this.rua = rua;
        this.numero_porta = numero_porta;
        this.distrito = distrito;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getNumero_porta() {
        return numero_porta;
    }

    public void setNumero_porta(String numero_porta) {
        this.numero_porta = numero_porta;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
