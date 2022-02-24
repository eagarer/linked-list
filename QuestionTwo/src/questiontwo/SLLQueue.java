/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questiontwo;

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
    
    public void enqueue(AnyType inData) 
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
    
    public AnyType dequeue()
    {
        if (size == 0) 
            throw new RuntimeException("Queue is empty!");
        
        AnyType returnValue = head.getData();
        Node<AnyType> temp = head;
        
        head = head.getNext();    
        temp.setNext(null);
        size--;                    
      
        return returnValue;
    }
    
    public void union(SLLQueue inQueue) {
        
        Node<AnyType> x = inQueue.head;
        
        while (x != null) {
            
            Node<AnyType> newNode = new Node<>();
            
            newNode.setData((AnyType) x.getData());    
        
            if (size == 0){
                head = newNode; 
            }else {
                tail.setNext(newNode);
            }                        
            tail = newNode;              
        
            size++;
            
            x = x.getNext();
            
        }
         
    }
    
    public Node<AnyType> delete(Node<AnyType> delNode) {

        Node<AnyType> nextNode = new Node<>();
       
        nextNode = delNode.getNext();

        decreaseSize();
        
        Node<AnyType> tmp = nextNode;
       
        delNode.setNext(null);
        delNode.setData(null);
        
        return tmp;
    }
    
    public void search() {
        
        Node<AnyType> tmp = new Node<>();
        Node<AnyType> next = new Node<>();
        Node<AnyType> prev = new Node<>();

        tmp = getFirst(); 
        while (tmp != null) {
            
            System.out.println("[Check] > " + tmp.getData());
            
            next = tmp.getNext();
            prev = tmp;
            while (next != null) {
                
                if (tmp.getData() == next.getData()) {
                    System.out.println("[delete] " + tmp.getData() + " - " + next.getData());
                  
                    prev.setNext(next.getNext());
                    
                    next.setNext(null);
                    next.setData(null);
                    next = prev.getNext();
                } else {
                   
                    prev = next;
                    next = next.getNext();                            
                }          
            }
            
            tmp = tmp.getNext();
            
            System.out.println("##############");
        }    
        
    }
    
    public void sort() {
        Node<AnyType> controlNode = new Node<>();
        Node<AnyType> compareNode = new Node<>();
        
        controlNode = getFirst(); 
        
        while (controlNode != null) {
            
            compareNode = controlNode.getNext();
            
            while (compareNode != null) {
                
                if ((int)controlNode.getData() > (int)compareNode.getData()) {
                
                    // change node
                    AnyType tmpData = controlNode.getData();
                    controlNode.setData(compareNode.getData());
                    compareNode.setData(tmpData);
                
                }
                
                compareNode = compareNode.getNext();
                
            }
            
            controlNode = controlNode.getNext();            
                     
        }
                
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
