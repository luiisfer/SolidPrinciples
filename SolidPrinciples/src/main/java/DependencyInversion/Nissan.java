/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInversion;

/**
 *
 * @author NewUser
 */
public class Nissan extends  Carro{

    @Override
    public void manejar() {
        super.manejar();
        System.out.println("Nissan");
    }
    
    
}
