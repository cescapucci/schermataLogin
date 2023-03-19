package com.example.schermatalogin;

import java.io.*;

public class Utente implements Serializable {

    private String nome, psw;

    /**
     * costruttore
     * @param nome
     * @param psw
     */
    public Utente(String nome, String psw) {
        this.nome = nome;
        this.psw = psw;
    }

    /**
     * getter e setter
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

}
