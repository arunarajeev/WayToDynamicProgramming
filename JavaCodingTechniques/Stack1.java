
import java.util.Scanner;

class Stack1{
    static int stack[]= new int[3] , size=3,counter=-1;
    static Scanner scanner = new Scanner(System.in);;

    private void push() {
        if(counter<size-1){
            System.out.println("Enter a number to push : ");
            stack[++counter]=scanner.nextInt();
            }
            else{
                System.out.println("Stack full");
                }
    }

    private void pop() {
         if(counter>=0){
            counter--;
         }
            else{
                System.out.println("Stack Empty");
                }
    }

    private void peek() {
         if(counter>=0){
             System.out.println(stack[counter]);
         }
            else{
                System.out.println("Stack Empty");
                }
       
    }
 
    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
       
       boolean flag = true;
        int option = 0;
        while(flag){
             System.out.println("Enter 1. Push 2. Pop 3. Peek 4.Exit");
            option=scanner.nextInt();
            switch(option){
                case 1:
                    stack1.push();
                    break;
                     case 2:
                    stack1.pop();
                    break;
                     case 3:
                    stack1.peek();
                    break;
                    default: flag=false; break;

            }
        }
    }
}