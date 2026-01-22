import java.util.*;

public class Grader {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

            
        for (int i = 0; i < n; i++){
            int grade;

            // Avoid keep reading empty lines, and stops as soon as the next input line is empty
            try {
                grade = scan.nextInt();
            } catch (NoSuchElementException e) {
                break; 
            }

            if (grade >= 38){
                int nextMultiple5 = ((grade / 5) + 1) * 5;

                if (nextMultiple5 - grade < 3){
                    grade = nextMultiple5;
                }
            }
             System.out.println(grade);
        }

    }
}
