package com.modelos;

public class Paciente {
    private String id;
    private int NIF;
    private int NISS;
    private String nome;
    private String apelido;
    private String nome_pai;
    private String nome_mae;
    private String data_nascimento;
    private Conta conta;
    private Ficha_Paciente ficha_paciente;

    public Paciente(String id, int NIF, int NISS, String nome, String apelido, String nome_pai, String nome_mae, String data_nascimento, Conta conta, Ficha_Paciente ficha_paciente) {
        this.id = id;
        this.NIF = NIF;
        this.NISS = NISS;
        this.nome = nome;
        this.apelido = apelido;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
        this.data_nascimento = data_nascimento;
        this.conta = conta;
        this.ficha_paciente = ficha_paciente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public int getNISS() {
        return NISS;
    }

    public void setNISS(int NISS) {
        this.NISS = NISS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Ficha_Paciente getFicha_paciente() {
        return ficha_paciente;
    }

    public void setFicha_paciente(Ficha_Paciente ficha_paciente) {
        this.ficha_paciente = ficha_paciente;
    }
}
