package com.sovos.main;

import com.sovos.abs.Employee;
import com.sovos.salary.Chefe;
import com.sovos.salary.PorComissao;
import com.sovos.salary.PorHora;
import com.sovos.salary.PorItem;

import java.text.DecimalFormat;

public class Init  {

    public static void main(String[] args) {
        Chefe ch = new Chefe("Ramon", "Silva", 30.000);
        PorComissao pc = new PorComissao("Craque","Neto", 20.000, 500, 5);
        PorItem pi = new PorItem("Edmundo","Silva",50.5, 5);
        PorHora ph = new PorHora("Galvão", "Bueno",50, 24 );
        DecimalFormat df = new DecimalFormat();


        System.out.println(ch.toString(ch.getNome() , ch.getFamilia() ) + " ganha $" + df.format(ch.ganhar()));
        System.out.println(pc.toString(pc.getNome(), pc.getFamilia()) + " ganha $" + df.format(pc.ganhar()));
        System.out.println(pi.toString(pi.getNome(), pi.getFamilia()) + " ganha $" + df.format(pi.ganhar()));
        System.out.println(ph.toString(ph.getNome(), ph.getFamilia()) + " ganha $" + df.format(ph.ganhar()));






    }
}
