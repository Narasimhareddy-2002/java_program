//Garbage collection in java
//program
class Main
{
    protected void finalize()
    {
        System.out.println("the object is destroyed");
    }
    public static void main(String k[])
    {
        Main obj=new Main();
        obj=null;
        new Main();
        System.gc();
    }
}
