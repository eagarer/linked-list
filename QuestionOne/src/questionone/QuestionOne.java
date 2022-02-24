/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionone;

import java.util.Scanner;

/**
 *
 */
public class QuestionOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SLLQueue<String> myQueue = new SLLQueue<>();
       
        Scanner input = new Scanner(System.in);
   
        Boolean a = true;
        while (a) {
          String sonuc = input.next();
          a = myQueue.enqueue(sonuc); 
        }

    }   
}
