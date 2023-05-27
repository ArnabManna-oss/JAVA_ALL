package inter;

interface A
{
    void disp1();
    void disp2();
}
interface B extends A
{
    void disp3();
}
class Imp implements B
{
    public void disp1()
    {
        System.out.println("implement disp1");
    }
    public void disp2()
    {
        System.out.println("implement disp2");
    }
    public void disp3()
    {
        System.out.println("implement disp3");
    }
    }
class ExtInterface
{
    public static void main(String args[])
    {
        Imp im=new Imp();
        im.disp1();
        im.disp2();
        im.disp3();
    }
}