package Day2_030721;

public class test {
    public static void main(String[] args) {
        String grade = "A";

        switch(grade) {
            case "A" :
                System.out.println("Excellent!");
                break;
            case "B" :
                System.out.println("Well done");
                break;
            case "C" :
                System.out.println("Good job");
                break;
            case "D" :
                System.out.println("You passed");
            case "F" :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);




    }
}
