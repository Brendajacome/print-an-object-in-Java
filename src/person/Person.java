/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

/**
 *
 * @author Usuario
 */
public class Person {

    private String name;
    private int Age;

    // Constructor
    public Person(String name, int Age) {
        this.name = name;
        this.Age = Age;
    }

    // Sobrescribir el método toString()
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + Age+ " years ";
    }
    // Métodos getter y setter (opcional)
    public String getname() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }   
}
