/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista5.exe2;

/**
 *
 * @author 1090482213041
 */
public class TestaCidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa fulano = new Pessoa();
        Cidade rp = new Cidade();
        rp.contrata(fulano);
        rp.contrata((Empregado) fulano);
        rp.cobraDe(fulano);
        rp.registra(fulano);
        rp.alimenta(fulano);
        
    }
    
}
