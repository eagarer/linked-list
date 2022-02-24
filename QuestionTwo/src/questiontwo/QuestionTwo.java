/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questiontwo;

/**
 *
 */
public class QuestionTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SLLQueue<Integer> l1 = new SLLQueue<>();
      
        l1.enqueue(1);
        l1.enqueue(3);
        l1.enqueue(8);
        l1.enqueue(2);
        l1.enqueue(0);
        System.out.println("l1 : " + l1);
        
        SLLQueue<Integer> l2 = new SLLQueue<>();
        
        l2.enqueue(5);
        l2.enqueue(7);
        l2.enqueue(4);
        l2.enqueue(3);
        l2.enqueue(3);
        System.out.println("l2 : " + l2);
        
        SLLQueue<Integer> l3 = new SLLQueue<>();
        
        l3.union(l1);
        l3.union(l2);
        System.out.println("l3 : " + l3);
        l3.search();
        System.out.println("After deleted duplicated : " + l3);
        
        l3.sort();
        
        System.out.println("After sorted : " + l3);
    
    }
}
