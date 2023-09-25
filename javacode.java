
class javacode {
public static void main(String args[])  //static method  
{  
System.out.println("Static method");  
helloWord();
oddEven();
}  
public static void helloWord(){
   System.out.println("HelloWorld");  
}
}  
 public static void oddEven(){
        int num = 4;

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

 }
}