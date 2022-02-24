/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionfourandfive;

/**
 *
 */
public class SLLQueue<AnyType> 
{
    private Node<AnyType> head;
    private Node<AnyType> tail;
    private int size;
    
    public AnyType front()
    {
        if (size == 0) 
            throw new RuntimeException("Queue is empty!");
            
        return head.getData(); 
    }
    
    public void push(AnyType inData) 
    {
        Node<AnyType> newNode = new Node<>();
        
        newNode.setData(inData);    
        
        if (getSize() == 0) {
            head = newNode;
        } else {
            newNode.setNext(null);
            tail.setNext(newNode);
        }                        
 
        tail = newNode;              
        
        increaseSize();
    }
 
    public void deleteDuplicated() {
        
        Node<AnyType> tmp = new Node<>();
        Node<AnyType> next = new Node<>();
        Node<AnyType> prev = new Node<>();
        int count = 0;

        tmp = getFirst(); 
        while (tmp != null) {
            
            count = 1;
            System.out.print(tmp.getData() + "=");
            
            next = tmp.getNext();
            prev = tmp;
            while (next != null) {
 
                if (tmp.getData().equals(next.getData())) {
                    
                    count++;
                  
                    prev.setNext(next.getNext());
                    
                    next.setNext(null);
                    next.setData(null);
                    next = prev.getNext();
                    
                    this.decreaseSize();
                } else {
                    prev = next;
                    next = next.getNext();                            
                }          
            }
            
            System.out.print(count + ", ");
            
            tmp = tmp.getNext();

        } 
        
        System.out.println("");
        
    }
    
    public int size() 
    { 
        return size;
    }
    
    public boolean isEmpty() 
    {
        return size == 0;
    }
    
    @Override
    public String toString() 
    {
        String rStr = "[ ";

        Node<AnyType> temp = head;
        while (temp != null) {
            
            rStr = rStr + temp.getData() + " "; 
            temp = temp.getNext();             
        }
        rStr = rStr + "]";
        
        return rStr;
    }
    
    private void increaseSize() {
        size++;
    }
    
    private void decreaseSize() {
        size--;
    }
    
    public Node<AnyType> getFirst() {
        return head;
    }
    
    private void setSize(int size) {
        this.size = size;
    }
    
    private int getSize() {
        return size;
    }
}
