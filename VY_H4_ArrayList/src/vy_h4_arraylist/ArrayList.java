/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vy_h4_arraylist;

/**
 *
 * @author Celal
 */
public class ArrayList {
    Node nodeArrayList[];
    int numberOfElements=0;
    int emptyElementsIndex =0;
    int listCapacity=0;
    
    
    
    public ArrayList()
    {
    nodeArrayList=new Node[10];
    this.listCapacity=10;
        System.out.println("New Arraylist Objets is Created!");
    }
    public boolean Add(Node D)
    {
    //seneryo-1 
        if(numberOfElements>=listCapacity)
        {
        Node tempArray[];
        listCapacity=listCapacity*2;
        tempArray=new Node[listCapacity];
        for(int i=0; i<listCapacity/2; i++)
        {
            tempArray[i]=this.nodeArrayList[i];
        
        }
        this.nodeArrayList=tempArray;
        //2-dugumu diziye ekle
        nodeArrayList[numberOfElements]=D;
        numberOfElements++;
        }
        else//seneryo-2
        {
            nodeArrayList[numberOfElements]=D;
             numberOfElements++;
        }
        return false;
        }
    
    public boolean Add(int value)
    {
        Node temp = new Node();
        temp.setData(value);
        this.Add(temp);
        return false;
    }
    public int getSize()
    {
        return numberOfElements;
    }


    //Destructor
    protected void finalize()
    {
        System.out.println("Object is destroyed by the Garbage Collector");
    }




}
