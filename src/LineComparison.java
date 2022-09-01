public class LineComparison
{
    public static void main(String args[])
    {
        System.out.println("Welcome To Line Comparision Computation Program on Master Branch");

        int x1=10,y1=20,x2=30,y2=40;
        int x3=10,y3=20,x4=30,y4=40;


        double LengthofLine1 =Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.println("Length of First Line : "+ LengthofLine1);

        double LengthofLine2 =Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));

        System.out.println("Length of Second Line : "+ LengthofLine2);

        if(LengthofLine1 == LengthofLine2)
        {
            System.out.println("Two lines are Equal");
        }
        else
        {
            System.out.println("Two lines are Not Equal");
        }

    }
}