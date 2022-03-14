package com.sovos.salary;

import com.sovos.abs.Employee;

public class PorComissao extends Employee {

    private double salario;
    private double comissao;
    private int vendas;

    public PorComissao(String nome, String familia, double salario, double comissao, int vendas) {
        super(nome, familia);
        this.salario = salario + (comissao * vendas);
    }

    @Override
    public double ganhar() {
        return getSalario();
    }


    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }


}

