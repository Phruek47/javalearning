  import java.util.Scanner;
  class Calculator{  
    public static void main(String args[]){  
       Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int p = keyboard.nextInt();
       if(p>=80){
            System.out.print("grade 4");
       }
       else if(p>=75){
            System.out.print("grade 3.5");
       }
       else if(p>=70){
            System.out.print("grade 3");
       }
       else if(p>=65){
            System.out.print("grade 2.5");
       }
       else if(p>=60){
            System.out.print("grade 2");
       }
       else if(p>=55){
            System.out.print("grade 1.5");
       }
       else if(p>=50){
            System.out.print("grade 1");
       }
       else{
            System.out.print("grade 0");
       }
    }
}  