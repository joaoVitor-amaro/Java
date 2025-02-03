package Exercicios.ex052.service;
import java.util.ArrayList;

import Exercicios.ex052.model.*;

public class AlunoController {
    private ArrayList<Aluno> alunos;

    public AlunoController() {
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void exibirAlunos() {
        for(Aluno aluno : this.alunos) {
            System.out.println(aluno.toString());
        }
    }

    public double mediaTurma() {
        double sm_notas = 0;
        for(Aluno aluno : this.alunos) {
            sm_notas += aluno.getMedia();
        }
        return sm_notas / this.alunos.size();
    }

    public double qtdAprovados() {
        int qtd_aprovados = 0;
        for(int i = 0; i < this.alunos.size(); i++) {
            if(this.alunos.get(i).getMedia() >= 7) {
                qtd_aprovados++;
            }
        }
        return (qtd_aprovados * 100) / this.alunos.size();
    }

    public double qtdReprovados() {
        int qtd_reprovados = 0;
        for(int i = 0; i < this.alunos.size(); i++) {
            if(this.alunos.get(i).getMedia() < 7) {
                qtd_reprovados++;
            }
        }
        return (qtd_reprovados * 100) / this.alunos.size();
    }
}
