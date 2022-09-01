import java.util.Scanner;
public class LineComparison
{

    public void CalculateLine()
    {
        System.out.println("Welcome To Line Comparision Computation Program on Master Branch");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of co-ordinate ");
        System.out.println("x1: ");
        int x1 = sc.nextInt();
        System.out.println("y1: ");
        int y1 = sc.nextInt();
        System.out.println("x2: ");
        int x2 = sc.nextInt();
        System.out.println("y2: ");
        int y2 = sc.nextInt();

        double LengthofLine1 =Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("Length of First Line : "+ LengthofLine1);

        System.out.println("Enter the value next co-ordinate ");
        System.out.println("x3: ");
        int x3 = sc.nextInt();
        System.out.println("y3:");
        int y3 = sc.nextInt();
        System.out.println("x4: ");
        int x4 = sc.nextInt();
        System.out.println("y4: ");
        int y4 = sc.nextInt();

        double LengthofLine2 =Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));
        System.out.println("Length of Second Line : "+ LengthofLine2);

        if(LengthofLine1 < LengthofLine2)
        {
            System.out.println("LengthofLine1 is less than LengthofLine2");
        }
        else if(LengthofLine1 > LengthofLine2)
        {
            System.out.println("LengthofLine1 is Greater than LengthofLine2");
        }
        else
        {
            System.out.println("Two lines are Equal");
        }
    }
    public static void main(String args[])
    {
        LineComparison LC = new LineComparison();
        LC.CalculateLine();
    }
}