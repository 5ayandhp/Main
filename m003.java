import java.util.Random;
import java.util.Scanner;
public class m003
{
    public static void main (String[]args)
    {
        Scanner s = new Scanner(System.in);
        String[] cc = {"stone", "papper", "scessors"};
        Random r = new Random();
        int rr = r.nextInt(1, 4);
        String out = cc[rr];
        int b = out.length();

        boolean bb =true;
        System.out.println("**************************************\n" +
                           "         welcome to the game!        \n" +
                           "**************************************");
                      while (bb)                         //user
                      {

                          System.out.println("\nchoose any one from below        \n  *stone *papper *scessors  ");
                          String ss = s.next();
                          int a = ss.length();
                          System.out.println("computers choice is " + " " + out + " \n");
                          System.out.println("<" + ss + ">    vs   <" + out + ">");


                          chk(a, b);
                          System.out.println("\nplay again\n");
                      }
            s.close();
    }
  //methode
    static void chk(int a,int b) {

          if (a==b)
          { System.out.println("tie!");}//while computr has biggr you take samaller

            else if((a==5&&b==8)||(a==6&&b==5)||(a==8 && b==6))
                   {System.out.println("you win");}
                  else {
              System.out.println("you lose!");
          }


               }

}