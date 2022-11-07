class Except{
public static void main(String[]args){
System.out.println("Starting point of program");
try{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
System.out.println("We have got two numbers");
int result= n1/n2;
System.out.println("Result"+result);
}
catch(ArithmeticException e){
System.out.println("second number can't be 0");
System.out.println(e.getMessage());
}

System.out.println("Program Terminated");
    }
}
