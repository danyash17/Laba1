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
for(int i=0;i<20;i++){
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
for(int i=0;i<20;i++){
    System.out.println(breakfast[i]);
}
}
}
 
