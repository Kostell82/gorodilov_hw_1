package gorodilov;

// задание 1
public class Main
{

// задание 2
    byte a = 1;
    short b = 2222;
    int c = 333333;
    long d = 44444L;
    float e = 555.5f;
    double f = 66.6666;
    boolean g = true;
    char h = 'h';


    public static void main(String[] args)
     {
       System.out.println (calculate(5,4,3,6));  //вывод результата задания 3 на консоль
       System.out.println (task10and20(14,8));                //вывод результата задания 4 на консоль
       isPositiveOrNegative(0);                            //вывод результата задания 5 на консоль
       System.out.println (isNegative(-5));                //вывод результата задания 6 на консоль
       greetings("Kostell");                            //вывод результата задания 7 на консоль
       visoyear(2012);                                     //вывод результата задания 8 на консоль

     }

// задание 3
         public static int calculate ( int a, int b, int c, int d)
          {
              return a * (b + (c / d));
          }

// задание 4
          public static boolean task10and20(int x1, int x2)
          {
               if ((x1+x2)>=10 && (x1+x2)<=20)
               {
                   return true;
               }
                  else
                   {
                       return false;
                   }



          }

//задание 5

                 public static void isPositiveOrNegative(int x)
                    {
                         if(x>=0) System.out.println("positive " + x);
                         if (x<0) System.out.println("negative " + x);
                    }

//задание 6
                  public static boolean isNegative(int x)
                  {
                      if(x>=0)
                             {
                               return true;
                             }
                             else
                                 {
                                     return false;
                                 }
                  }
//задание 7
                  public static void greetings(String name)
                  {
                        System.out.println("Привет," + name);
                  }

//задание 8
                  public static int visoyear (int a)
                   {
                      if (((a/4)*4 == a) && ((a/400)*400 == a)) {

                      }
                         else
                          if ((a/100)*100 == a)
                            {
                                System.out.println ("не високосный " + a);
                                return a;
                            }

                           System.out.println ("високосный " + a);
                      return a;
                   }








}
