import java.utli.*;
class leapyear
{
   public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     int year=s.nextInt();
     System.out.println("enter the year:");
     if(((year%4==0)&&(year%100!=0)||(year%400==0)))
       print("year is a leap year:"+year);
     else
       print("year is a not a leap year:"+year);
    }
} 