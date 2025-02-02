package Exercicios.ex044.controller;

import java.util.ArrayList;

import Exercicios.ex044.model.*;

public class ControllerEleitor {
    private ArrayList<Eleitor> eleitores;
    private static final int idadeMenorIdade = 16;
    public ControllerEleitor() {
        this.eleitores = new ArrayList<>();
    }

    public void setEleitor(Eleitor eleitor) {
        this.eleitores.add(eleitor);
    }

    private void verificarMenorIdade(Eleitor eleitor) throws EleitorMenorIdadeException {
        if(eleitor.getIdade() < idadeMenorIdade) {
            throw new EleitorMenorIdadeException(eleitor.getNome());
        } 
        return;      
    }

    private void verificarPendenciaIdade(Eleitor eleitor) throws EleitorPendente {
        if(eleitor.getIdade() > 20) {
            throw new EleitorPendente(eleitor.getNome());
        }
    }

    public void verificarEleitores() {
        for(int i = 0; i < this.eleitores.size(); i++) {
            try { 
                verificarMenorIdade(this.eleitores.get(i));
                verificarPendenciaIdade(this.eleitores.get(i));
            } catch(EleitorMenorIdadeException e) {
                System.out.println(e.getMessage());
            } catch(EleitorPendente e) {
                System.out.println(e.getMessage());
            }
        }
    }
}