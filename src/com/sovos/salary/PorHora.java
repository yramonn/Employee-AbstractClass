package com.sovos.salary;

import com.sovos.abs.Employee;

public class PorHora extends Employee {
    private  double salario;
    private double valor;
    private double horas;

    public PorHora(String nome, String familia, double valor, double horas) {
        super(nome, familia);
        this.salario = valor * horas;
    }

    private double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getHoras() {
        return horas;
    }


    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public double ganhar() {
        return getSalario();
    }

}
