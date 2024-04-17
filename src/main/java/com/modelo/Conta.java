package com.modelo;

public class Conta {
    private String id;
    private String email;
    private String palavra_passe;
    private String data_criacao;
    private int tipo_conta;
    private boolean status;

    public Conta(String id, String email, String palavra_passe, String data_criacao, int tipo_conta, boolean status) {
        this.id = id;
        this.email = email;
        this.palavra_passe = palavra_passe;
        this.data_criacao = data_criacao;
        this.tipo_conta = tipo_conta;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPalavra_passe() {
        return palavra_passe;
    }

    public void setPalavra_passe(String palavra_passe) {
        this.palavra_passe = palavra_passe;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public int getTipo_conta(){
        return this.tipo_conta;
    }

    public void setTipo_conta(int tipo_conta){
        this.tipo_conta = tipo_conta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
