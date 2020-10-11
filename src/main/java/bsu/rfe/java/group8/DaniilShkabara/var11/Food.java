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
public abstract class Food implements Consumable {
String name = null;
public Food(String name) {
this.name = name;
}
public boolean equals(Object arg0) {
if (!(arg0 instanceof Food)) return false; 
if (name==null || ((Food)arg0).name==null) return false;
return name.equals(((Food)arg0).name);
}
public String toString() {
return name;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
}
