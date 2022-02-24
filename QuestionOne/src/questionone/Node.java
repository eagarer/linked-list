/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionone;

/**
 *
 */
public class Node<AnyType> {
    private AnyType data;
    private Node<AnyType> next;
    
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
        next = newNext;
    }
}
