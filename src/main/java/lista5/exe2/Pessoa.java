/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.exe2;

/**
 *
 * @author 1090482213041
 */
public class Pessoa extends Animal implements Cidadao, 
        Contribuinte, Professor{
    private int rg;
    private int cpf;
    @Override
    public void vota() {
        System.out.println("Pessoa votou");
    }

    @Override
    public void tiraRg() {
        this.rg = (int) (Math.random() * 100);
        System.out.println("Rg " + this.rg);
    } 

    @Override
    public void pagaIr() {
        System.out.println("Pessoa pagou IR");
    }

    @Override
    public void tiraCpf() {
        this.cpf = (int)(Math.random()*100);
        System.out.println("Cpf " + this.cpf);
    }

    @Override
    public void ensina() {
        System.out.println("Pessoa ensinou");
    }

    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalhou");
    }
    
    
}
