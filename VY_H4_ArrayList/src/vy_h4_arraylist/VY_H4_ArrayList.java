/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vy_h4_arraylist;

/**
 *
 * @author Celal
 */
public class VY_H4_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         // TODO code application logic here

        ArrayList AL1 = new ArrayList();

        Node DugumDizi[]=new Node[30];
        AL1.Add(15);
        AL1.Add(20);
        System.out.println(AL1.getSize());

        for(int i=0; i<=29; i++)
        {
            DugumDizi[i]= new Node();
            DugumDizi[i].setData(i);
            AL1.Add(DugumDizi[i]);
            System.out.println(AL1.listCapacity);
        }
        
        Node D10= new Node();
        D10.setData(15);
        AL1.Add(D10);
        System.out.println("End of Program");
    }


    }
    

