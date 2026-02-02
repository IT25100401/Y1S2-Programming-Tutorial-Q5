 class  Calculator{
         
      public int add(int num1,int num2){
          return num1+num2; 
         }
         
       public int multiply(int num1,int num2){
              return num1*num2;
         }
         
        public int square(int num){
             return num*num;
         }
     } 
   public class Q5{  
    public static void main(String[]args){
        
       Calculator cal=new Calculator();
        
    System.out.println("   question 01   ");
    
    int part1=cal.multiply(3,4);
    int part2=cal.multiply(5,7);
    int part3=cal.add(part1,part2);
    int part4=cal.square(part3);
    
    System.out.println("Question 01 answer is : "+part4);
    
    System.out.println("    question 02  ");
    
    int sum1=cal.add(7,4);
    int sum2=cal.add(8,3);
    int square=cal.square(sum1);
    int square1=cal.square(sum2);
    int result=cal.add(square,square1);
    
    System.out.println("Question 02 answer is :"+result);
    
    }
}