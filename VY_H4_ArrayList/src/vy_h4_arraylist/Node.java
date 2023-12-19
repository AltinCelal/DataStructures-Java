/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vy_h4_arraylist;

/**
 *
 * @author Celal
 */
public class Node {
    private int data;
    private Node nextNode;
    
    public void setData(int data)
    {
        this.data=data; 
    
    }
    
    /*public void SonrakiDugumAta(Node sonraki)
    {
        this.nextNode=sonraki;
        
    }*/
    public int getData()
    {
    return this.data;
    
    }
}
