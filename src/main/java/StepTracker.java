import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int minSteps, activeDays, totalDays, totalSteps; 

public StepTracker(int x){
 minSteps=x; 
 totalSteps=0
 activeDays=0;
 totalDays=0;
}
public void addDailySteps (int x){
 totalSteps+=x;
 days++;
 if (steps>=minSteps)
   activeDays++;
}
public int activeDays(){
   return activeDays
}
public double averageSteps(){
 if (totalDays==0)
   return 0.0;
 return (double) totalSteps/totalDays; 
 
}
 
} 
