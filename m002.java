import java.util.Scanner;
public class m002{
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int i=0;
        int x=0;
        boolean b =true;

        System.out.println("welcome to math game !");
        String[] q1s = {"2+2 =  ", "4+3 = ", "3+3 ="};
        int []ans= {4,7,6};
        for (int j=0;j< q1s.length;j++)
        {
            System.out.println(q1s[j]);
            if(b) {
            int ii = s.nextInt();
            if (ii == ans[i]) {
                System.out.println("true");
                x++;
            } else {
                System.out.println("false ");
            }
            i++;


        }
        }
        System.out.println("you got "+ x +"/" +q1s.length +"CORRECT !");

    }}





