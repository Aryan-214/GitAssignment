
class javacode {
public static void main(String args[])  //static method  
{  
System.out.println("Static method");  
oddEven();
}  
 public static void oddEven(){
        int num = 8;

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

 }
}