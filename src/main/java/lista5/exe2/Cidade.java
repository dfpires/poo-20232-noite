/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.exe2;

/**
 *
 * @author 1090482213041
 */
public class Cidade {
    
    public void contrata(Professor p){
	p.ensina();
	p.trabalha();
    }
    // sobrecarga de métodos
    public void contrata(Empregado e){
	e.trabalha();
    }

    public void cobraDe(Contribuinte c) {
	c.pagaIr();
    }
    public void registra(Cidadao c) {
	c.tiraRg();
    }
    public void alimenta(Animal a ){
	a.come();
    }


}
