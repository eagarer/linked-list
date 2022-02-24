/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionthree;

/**
 *
 */
public class Node<AnyType> 
{
    private AnyType data;
    private Node<AnyType> next;
    private Node<AnyType> prev;
    
    public AnyType getData() 
    {
        return data; 
    }
    
    public Node<AnyType> getNext() 
    { 
        return next;
    }
  
    public void setData(AnyType newData) 
    { 
        data = newData; 
    }
    
    public void setNext(Node<AnyType> newNext) 
    {
        this.next = newNext; 
    }   

    /**
     * @return the prev
     */
    public Node<AnyType> getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Node<AnyType> prev) {
        this.prev = prev;
    }
    
}
