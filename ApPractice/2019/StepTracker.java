/*
 * Programmer: HackOlympus  
 * Date: 29 May 
 * Purpose: StepTracker  
 */ 

public class StepTracker    
{
    private int days ; 
    private int active_days ; 
    private double steps ; 
    private int active_steps ; 
    
    public StepTracker(int active_steps)
    {
        this.active_steps = active_steps ; 
        active_days = 0 ; 
        days = 0 ; 
        steps = 0 ; 

    }

    public void addDailySteps(int n)
    {
        days++ ; 
        if (n >= active_steps) active_days++ ; 
        steps += (double)n ; 
    }

    public int activeDays() 
    {
        return active_days ; 
    }
    
    public double averageSteps()
    {
        if (steps == 0 && days==0) return 0.0 ; 
        return steps/days ; 
    }
    public static void main(String[] args)
    {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays()) ;
        System.out.println(tr.averageSteps()) ; 
        tr.addDailySteps(9000) ; 
        tr.addDailySteps(5000) ;
        System.out.println(tr.activeDays()) ; 
        System.out.println(tr.averageSteps()) ; 
        tr.addDailySteps(13000) ; 
        System.out.println(tr.activeDays()) ; 
        System.out.println(tr.averageSteps()) ; 
        tr.addDailySteps(23000) ; 
        tr.addDailySteps(1111) ; 
        System.out.println(tr.activeDays()) ;
        System.out.println(tr.averageSteps()) ; 


    }
}

