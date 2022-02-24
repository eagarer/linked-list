/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionthree;

/**
 *
 */
public class DLLQueue <AnyType> {
    
    private Node<AnyType> head;
    private Node<AnyType> tail;
    private int size;
    
    public void enqueue(AnyType inData) {
        
        Node<AnyType> newNode = new Node<>();
        
        newNode.setData(inData);    
        
        if (getSize() == 0) {
            newNode.setPrev(null);
            head = newNode;
        } else {
            newNode.setNext(null);
            newNode.setPrev(tail);
            tail.setNext(newNode);
        }                        
 
        tail = newNode;              
        
        increaseSize();
    }
    
    public Node<AnyType> getFirst() {
        return head;
    }
    
    public Node<AnyType> delete(Node<AnyType> delNode) {
        
        Node<AnyType> prevNode = new Node<>();
        Node<AnyType> nextNode = new Node<>();
       
        prevNode = delNode.getPrev();
        nextNode = delNode.getNext();

        prevNode.setNext(nextNode);
        if (nextNode != null) {
            nextNode.setPrev(prevNode);
        } 

        decreaseSize();
        
        Node<AnyType> tmp = nextNode;
       
        delNode.setPrev(null);
        delNode.setNext(null);
        delNode.setData(null);
        
        return tmp;
      
    }
    
    public void search() {
        
        Node<AnyType> tmp = new Node<>();
        Node<AnyType> tmp2 = new Node<>();
        
        int deletedCount = 0;

        tmp = getFirst();
              
        while (tmp != null) {
            
            tmp2 = tmp.getNext();
            while (tmp2 != null) {
                
                if (tmp.getData() == tmp2.getData()) {
                    System.out.println("[delete] " + tmp.getData() + " - " + tmp2.getData());
                    tmp2 = delete(tmp2);
                    System.out.println("##############");
                } else {
                    tmp2 = tmp2.getNext();                            
                }          
            }
            
            tmp = tmp.getNext();
     
        }    
        
    }
    
    @Override
    public String toString() {
        
      String resultStr = "[ ";
      
      Node<AnyType> tmp = new Node<>();
      Node<AnyType> next = new Node<>();
      
      for (int i = 0; i< getSize(); i++) {
          
          if (i == 0) {
              tmp = getFirst();
              resultStr += tmp.getData();
          } else {
              next = tmp.getNext();
              resultStr += next.getData();
              tmp = next;
          }
          resultStr += " ";
        }
      resultStr += " ]";
      return resultStr;
    }
    
    private void setSize(int size) {
        this.size = size;
    }
    
    private int getSize() {
        return size;
    }
    
    private void increaseSize() {
        size++;
    }
    
    private void decreaseSize() {
        size--;
    }
}
