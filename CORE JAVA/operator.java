public class operator {
    public static void main(String[] args) {

        // some operators in java
        int a = 10;
        int b = 20;   
        int c = 30;  

        a += 5; // assignment operator
        b++;    //post increment operator
        ++c;    // pre increment operator

        System.out.println("Value of a after a = a + 5 : " + a);
        System.out.println("a + b = " + (a + b)); // addition
        System.out.println("a - b = " + (a - b)); // subtraction
        System.out.println("a * b = " + (a * b)); // multiplication
        System.out.println("b / a = " + (b / a)); // division
        System.out.println("b % a = " + (b % a)); // modulus



        // relational operators
        System.out.println("a == b : " + (a == b)); // equal to
        System.out.println("a != b : " + (a != b)); // not equal
        System.out.println("a > b : " + (a > b));   // greater than
        System.out.println("a < b : " + (a < b));   // less than
        System.out.println("a >= b : " + (a >= b)); // greater than or equal to
        System.out.println("a <= b : " + (a <= b)); // less than or equal to    

        // logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y : " + (x && y)); // logical AND
        System.out.println("x || y : " + (x || y)); // logical OR
        System.out.println("!x : " + (!x));           // logical NOT


        // conditional operator
        int age = 20;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Age: " + age + " - " + eligibility);    


        int num = 14;
        String okay = (num >= 20) ? "Ha Ha Great" : "Oh fuck";
        System.out.println(okay);

        // if else
        int number = 24;
        if (number % 2 == 0 && num==15) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
