/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionthree;

/**
 *
 */
public class QuestionThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DLLQueue<String> myQ = new DLLQueue<>();
        
        myQ.enqueue("Monday");
        myQ.enqueue("Tuesday");
        myQ.enqueue("Wednesday");
        myQ.enqueue("Monday");
        myQ.enqueue("Thursday");
        myQ.enqueue("Monday");
        myQ.enqueue("Wednesday");
        myQ.enqueue("Friday");
        myQ.enqueue("Saturday");
        myQ.enqueue("Sunday");
        myQ.enqueue("Sunday");
        
        System.out.println(myQ);
        
        myQ.search();
        
        System.out.println("After process: " + myQ);
    }
    
}
