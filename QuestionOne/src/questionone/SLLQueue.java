/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionone;

/**
 *
 */
public class SLLQueue<AnyType> {
    
    private Node<AnyType> head;
    private Node<AnyType> tail;
    private int theSize;
    
    public AnyType front() {
        if (theSize == 0)
            throw new RuntimeException("Queue is empty!!!");
        return head.getData();
    }
    
    public Boolean enqueue(AnyType newData) {
        Boolean a;
        a = search(newData);
        System.out.println(a);
        if (a == false)
        {
            Node<AnyType> newNode = new Node<>();
        
            newNode.setData(newData);
        
            if (theSize == 0)
                head = newNode;
            else
                tail.setNext(newNode);
        
            tail = newNode;
            theSize++;
            return true;
        }
        else
            return false;
    }
    
    
    public Boolean search(AnyType data) {
        Node<AnyType> temp = head;
        
        String inData = (String) data;
        
        for (int i=0; i<theSize; i++)
        {
            String s = (String) temp.getData();
            
           
            
            Boolean result = (inData.equals(s));
            
            
            if (inData.equals(s)){
                
               return true; 
            }
           
            temp = temp.getNext();             
        }
        return false;
    }
    
    @Override
    public String toString() 
    {
        String rStr = "[ ";

        Node<AnyType> temp = head;
        for (int i=0; i<theSize; i++)
        {
            rStr = rStr + temp.getData() + " "; 
            temp = temp.getNext();             
        }
        rStr = rStr + "]";
        
        return rStr;
    }
}
