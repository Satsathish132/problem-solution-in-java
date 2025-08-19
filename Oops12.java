import java.util.*;
class cse{
    void in(ArrayList<Integer> lab,int x)
    {


    
    int arr[]=new int[3];
    int j=0;
    for(int i:lab)
    {
        if (i>x)
        {
         arr[j]=i;
         j++;   
        }
    }
    Arrays.sort(arr);
    for(j=0;j<3;j++)
    {
    if(arr[j]!=0)
    {
        System.out.print(arr[j]);
        break;
    }
    }
    }
}
public class Oops12 {
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



