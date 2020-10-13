/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.rfe.java.group8.DaniilShkabara.var11;

/**
 *
 * @author Даня
 */
public class Apple extends Food implements Nutritious {
    private String size;
    public Apple(String size) {
super("Яблоко");
this.size = size;
}
public void consume() {
System.out.println(this + " съедено");
}
public String getSize() {
return size;
}
public void setSize(String size) {
this.size = size;
}
public boolean equals(Object arg0) {
if (super.equals(arg0)) { 
if (!(arg0 instanceof Apple)) return false; 
return size.equals(((Apple)arg0).size); // Шаг 3
} else
return false;
}
public String toString() {
return super.toString() + " размера "  + this.size;
}
public double calculate_calories(){
    if (this.size=="Большое"){
        return 60;
    }
    else return 50;
    }
}
