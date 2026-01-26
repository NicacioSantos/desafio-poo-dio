package org.example;

import org.example.model.Curso;
import org.example.model.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1  = new Curso(8,"descrição curso java","curso java");
        Curso curso2  = new Curso(4,"descrição curso js","curso js");


        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria(LocalDate.now(),"descrição mentoria java","Mentoria de java");
        System.out.println(mentoria1);

        }
    }
