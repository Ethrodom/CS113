public class Lab1 {
    public static void main(String[] args)
    {
        for(int x = 0; x < 100; x++)
        {
            if( (x+1) % 3 ==0 && (x+1) % 5 ==0)
            {
                System.out.println("FIZZBUZZ");
            }
            else
                if((x+1) % 3 ==0)
                    System.out.println("FIZZ");
                else
                    if((x+1) % 5 ==0)
                        System.out.println("BUZZ");
        }
    }
}
