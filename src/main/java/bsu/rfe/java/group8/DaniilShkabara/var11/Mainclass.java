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
public class Mainclass{
 
@SuppressWarnings("unchecked")
public static void main(String[] args) throws Exception {
    final int size=10;
Food[] breakfast = new Food[size];
for(int i=0;i<size;i++){
int key=(int)(Math.random()*3);
switch(key){
    case 0:{
        breakfast[i]=new Cheese();
        break;
    }
    case 1:{
        int key_param_apple=(int)(Math.random()*2);
        if(key_param_apple==0){
        breakfast[i]=new Apple("Большое");
        }
        else
        breakfast[i]=new Apple("Маленькое");
        break;
    }
    case 2:{
        int key_param_cake=(int)(Math.random()*3);
        switch (key_param_cake){
            case 0:{
                breakfast[i]=new Cake("Шоколадная");
                break;
            }
            case 1:{
                breakfast[i]=new Cake("Сливочная");
                break;
            }
            case 2:{
                breakfast[i]=new Cake("Карамельная");
                break;
            }
        }
    }
}
}
Cake CHOCO = new Cake("Шоколадная");
Cake CREAMY = new Cake("Сливочная");
Cake CARAMEL = new Cake("Карамельная");
System.out.println("Калорийности пирожных: \nШоколадное " + CHOCO.calculate_calories() + "\nСливочное " + CREAMY.calculate_calories() + "\nКарамельное " + CARAMEL.calculate_calories());
System.out.println("_______________________________");
int choco=0,creamy=0,caramel=0;
for(int i=0;i<size;i++){
    System.out.println(breakfast[i]);
    if(breakfast[i] instanceof Cake){
        
        if(breakfast[i].equals(CHOCO)) {choco++;
        continue;}
        if(breakfast[i].equals(CREAMY)) {creamy++;
        continue;}
        if(breakfast[i].equals(CARAMEL)) {caramel++;
        }
    }
    }
System.out.println("_______________________________");
System.out.println("Шоколадных " + choco + ",Сливочных " + creamy + ",Карамельных " + caramel);
}
}
 
