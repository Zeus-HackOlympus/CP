/*
 * Programmer: HackOlympus  
 * Date: 01 Jun 
 * Purpose: APline 2010 AP FRQ 2  
 */ 

public class APline  
{
    // ax + by + c = 0 
    private double a ; 
    private double b ; 
    private double c ; 

    public APline(int a, int b, int c)
    {
        this.a = (double)a ; 
        this.b = (double)b ; 
        this.c = (double)c ; 
    }
    public double getSlope()
    {
        return -a/b ; 
    }

    public boolean isOnLine(int x, int y) 
    {
        if (((a*x) + (b*y) + c) == 0 ) return true; 
        return false ; 
    }

    public static void main(String[] args)
    {
        APline line1 = new APline(5, 4, -17);
        System.out.println(line1.getSlope()) ; 
        System.out.println(line1.isOnLine(5,-2)) ; 

        APline line2 = new APline(-25, 40, 30);
        System.out.println(line2.getSlope()) ; 
        System.out.println(line2.isOnLine(5,-2)) ; 

    }
}

