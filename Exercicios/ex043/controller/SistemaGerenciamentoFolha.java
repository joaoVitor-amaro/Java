package Exercicios.ex043.controller;

import Exercicios.ex043.model.*;
import java.util.ArrayList;

public class SistemaGerenciamentoFolha {
    private ArrayList<Funcionario> funcionarios;
    private double orcamento;

    public SistemaGerenciamentoFolha(double orcamento) {
        this.orcamento = orcamento;
        this.funcionarios = new ArrayList<>();
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public double getOrcamento() {
        return this.orcamento;
    }

    public double consultarSalarioFuncionario(String matricula) {
        for(int i = 0; i < this.funcionarios.size(); i++) {
            if(matricula.equals(this.funcionarios.get(i).getMatricula())) {
                return this.funcionarios.get(i).calcularSalario();
            }
        }
        throw new FuncionarioNaoExisteException(matricula);
    }

    public double calcularValorTotalFolha() {
        double total = 0;
        for(Funcionario funcionario : this.funcionarios) {
            total += funcionario.calcularSalario();
        }
        if(total < this.orcamento) {
            return total;
        } else {
            throw new OrcamentoEstouradoException(total);
        }
    }
}