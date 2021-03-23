/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleResponsibility;

/**
 *
 * @author NewUser
 */
public class Cliente {
    private String name;
    private int age;
    private long bill;

    public Cliente(String name, int age, long bill) {
        this.name = name;
        this.age = age;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBill() {
        return bill;
    }

    public void setBill(long bill) {
        this.bill = bill;
    }
    
    
}
