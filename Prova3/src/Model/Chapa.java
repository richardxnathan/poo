/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author richa
 */
public class Chapa {
    
    private String nome;
    private String presidente;
    private String cursoPresidente;
    private String vicePresidente;
    private String cursoVicePresidente;

    public Chapa(String nome, String presidente, String cursoPresidente, String vicePresidente, String cursoVicePresidente) {
        this.nome = nome;
        this.presidente = presidente;
        this.cursoPresidente = cursoPresidente;
        this.vicePresidente = vicePresidente;
        this.cursoVicePresidente = cursoVicePresidente;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getCursoPresidente() {
        return cursoPresidente;
    }

    public void setCursoPresidente(String cursoPresidente) {
        this.cursoPresidente = cursoPresidente;
    }

    public String getVicePresidente() {
        return vicePresidente;
    }

    public void setVicePresidente(String vicePresidente) {
        this.vicePresidente = vicePresidente;
    }

    public String getCursoVicePresidente() {
        return cursoVicePresidente;
    }

    public void setCursoVicePresidente(String cursoVicePresidente) {
        this.cursoVicePresidente = cursoVicePresidente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chapa other = (Chapa) obj;
        return Objects.equals(this.nome, other.nome);
    }
    
    
    
    
    
}
