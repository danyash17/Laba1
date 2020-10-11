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
public class Cake extends Food {
    private String icing;
public Cake(String icing) {
    super("Пирожное");
    this.icing=icing;
}
public void consume() {
System.out.println(this + " съедено");
}
public String getIcing() {
return icing;
}
public void setIcing(String icing) {
this.icing = icing;
}
public boolean equals(Object arg0) {
if (super.equals(arg0)) { 
if (!(arg0 instanceof Cake)) return false; 
return icing.equals(((Cake)arg0).icing); // Шаг 3
} else
return false;
}
public String toString() {
return super.toString()  + ' ' + this.icing+ " глазурь";
}

}

