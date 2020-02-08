import java.util.Scanner;
public class Calculator {
	 public double add(double first,double second) {
		    return(first+second);
	      }
	 public double sub(double first,double second) {
		    return(first-second);
		  }
	 public double mul(double first,double second) {
		    return(first*second);
		  }
	 public double div(double first,double second) {
		    return(first/second);
		  }
	 public double exponent(double first,double second) {
		    double k=first;
		    int l=(int)second;
		    for(int i=0;i<l;i++) {
		    	k*=k;
		    }
		    return k;
		  }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /,^): ");
        char operator = reader.next().charAt(0);
        double result;
        Calculator c=new Calculator();
        System.out.println("choice is:"+operator);
        switch(operator)
        {
            case '+':
                result = c.add(first,second);
                break;
            case '-':
                result = c.sub(first,second);
                break;
            case '*':
                result = c.mul(first,second);
                break;
            case '/':
                result = c.div(first,second);
                break;
            case '^':
            	result=c.exponent(first,second);
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}