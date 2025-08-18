// interface father{
//     abstract void fa();
// }
// interface mother{
//     abstract void mo();
// }
// class child implements father,mother{
//     public void fa()
//     {
//         System.out.println("father properties");
//     }
//     public void mo(){
//         System.out.println("mother properties");
//     }
//     void chi(){
//         System.out.println("child properties");
//     }
// }
// public class Oops7multiplein {
//     public static void main(String [] args)  {
//         child c =new child();
//         c.fa();
//         c.mo();
//         c.chi();
//     }  
// }

interface father{
    default void fa(){
        System.out.println("father properties");
    }
}
interface mother{
    default void mo(){
        System.out.println("mother properties");
    }
}
class child implements father,mother{
    public void fa()
    {
        father.super.fa();
    }
    public void mo(){
        mother.super.mo();
    }
    void chi(){
        System.out.println("child properties");
    }
}
public class Oops7multiplein {
    public static void main(String [] args)  {
        child c =new child();
        c.fa();
        c.mo();
        c.chi();
    }  
}
