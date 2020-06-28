import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;
class Calculate
{
    int principal;
    int rate;
    int time;
    double simpleInterest;
    double compoundInterest;
    Calculate(int principal,int rate,int time)
    {
        this.principal=principal;
        this.rate=rate;
        this.time=time;
    }
    public double SimpleInterest()
    {
        simpleInterest=(principal*rate*time)/100;
        return simpleInterest;
    }
    public double CompoundInterest()
    {
        double value=Math.pow((1-rate/100),time);
        compoundInterest=principal*(value-1);
        return compoundInterest;
    }
}
public class Interest
{
    private static final Logger LOGGER= LogManager.getLogger(HouseConstruction.class);
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter amount");
        int p=s.nextInt();
        System.out.println("enter rate of interest");
        int r=s.nextInt();
        System.out.println("enter time period");

        int t=s.nextInt();
        Calculate calculate=new Calculate(p,r,t);
        double sinterest=calculate.SimpleInterest();
        double citerest=calculate.CompoundInterest();
        LOGGER.debug(sinterest);
        LOGGER.debug(citerest);
    }}

