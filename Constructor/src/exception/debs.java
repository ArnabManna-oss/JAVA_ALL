package exception;

import java.util.*;


class td
{
private int hr,mnt,sec;
public void getdata()
{
Scanner in= new Scanner(System.in);
System.out.print("Enter hour: ");
hr=in.nextInt();
System.out.print("Enter minutes: ");
mnt=in.nextInt();
System.out.print("Enter seconds: ");
sec=in.nextInt();
System.out.println("Time entered="+hr+":"+mnt+":"+sec);
}
public void shw_val(td t1,td t2)
{
System.out.println("Time1="+t1.hr+":"+t1.mnt+":"+t1.sec);
System.out.println("Time2="+t2.hr+":"+t2.mnt+":"+t2.sec);
}
public void shw_diff(td t1)
{
int hrd,mntd,secd;
if(t1.hr>hr)
{
hrd=t1.hr-hr;
}
else
{
hrd=hr-t1.hr;
}
if(t1.mnt>mnt)
{
mntd=t1.mnt-mnt;
}
else
{
mntd=mnt-t1.mnt;
}
if(t1.sec>sec)
{
secd=t1.sec-sec;
}
else
{
secd=sec-t1.sec;
}
System.out.println("Time difference="+hrd+":"+mntd+":"+secd);
}
}

public class debs
{
public static void main ( String[] args )
{
td tm1,tm2;
tm1=new td();
tm2=new td();
System.out.println("Enter Time1:");
tm1.getdata();
System.out.println("Enter Time2:");
tm2.getdata();
System.out.println("Entered Times:-");
tm1.shw_val(tm1,tm2);
tm2.shw_diff(tm1);
}
}