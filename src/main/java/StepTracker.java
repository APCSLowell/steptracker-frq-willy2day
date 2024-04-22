import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int steps, activeDays, days; 

public StepTracker(int x){
 steps=x; 
 activeDays=0;
 days=1;
}
public void addDailySteps (int x){
 steps+=x;
 days+=1;
}
public int activeDays(){
 if (steps>=10000)
   return activeDays+=1;
}
public double averageSteps(){
 return (double) steps/days; 
 
}
 
} 
