import java .util.*;
class cse{
    void in(ArrayList<Integer> lab,int x)
    {


    
    int count=0;
    for(int i:lab)
    {
        if(i>x)
        {
            count++;
        }
    }
    System.out.println(count);
    }
}
public class Oops11 {
    public static void main (String[]args)
    {

    Scanner sc=new Scanner (System.in);
    ArrayList<Integer> lab=new ArrayList<>();
    for(int i=0;i<3;i++)
    {
        lab.add(sc.nextInt());
    }
    int sd=sc.nextInt();
    
    cse s=new cse();
    s.in(lab,sd);
}
}

