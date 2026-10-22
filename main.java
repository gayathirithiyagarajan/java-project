import java.util.Scanner;

public class studentproject
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Student Details ===");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        
        System.out.println("\n--- Student Saved ---");
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);
        System.out.println("CGPA: " + cgpa);
        
        if(cgpa >= 8.0)
        {
            System.out.println("Status: Eligible for Besant Drive (80% criteria)");
        }
        else
        {
            System.out.println("Status: Need Improvement");
        }
        sc.close();
    }
}


