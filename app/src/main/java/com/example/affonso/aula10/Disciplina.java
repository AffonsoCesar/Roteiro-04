package com.example.affonso.aula10;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Created by Affonso on 27/03/2016.
 */
@DatabaseTable
public class Disciplina {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String nome;
    @DatabaseField
    private int quantCreditos;
    @ForeignCollectionField
    Collection<Professor> professores = new ArrayList<>();

    public Disciplina(){

    }

    public Disciplina(String nome, int quantCreditos) {
        this.nome = nome;
        this.quantCreditos = quantCreditos;
    }
    public int getQuantCreditos() {
        return quantCreditos;
    }

    public void setQuantCreditos(int quantCreditos) {
        this.quantCreditos = quantCreditos;
    }
    public String toString(){
        return "ID: "+this.id+"\nNome da Disciplina: "
                +this.nome+"\nCréditos: "
                +this.quantCreditos;
    }

    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }
    public void removerProfessor(Professor professor){
        this.professores.remove(professor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}