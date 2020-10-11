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
public class Mainclass {
 
@SuppressWarnings("unchecked")
public static void main(String[] args) throws Exception {
Food[] breakfast = new Food[20];
int itemsSoFar = 0;
for (String arg: args) {
//String[] parts = arg.split("/");
//if (parts[0].equals("Cheese")) {
//breakfast[itemsSoFar] = new Cheese();
//} else
//if (parts[0].equals("Apple")) {
//breakfast[itemsSoFar] = new Apple(parts[1]);
//}
//if(parts[0].equals("Cake")){
//    breakfast[itemsSoFar]=new Cake(parts[2]);
//} 

itemsSoFar++;
}
for (Food item: breakfast){
if (item!=null)
item.consume();
else{
break;
}
}
System.out.println("Всего хорошего!");
}
}
 
