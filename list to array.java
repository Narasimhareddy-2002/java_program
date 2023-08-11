import java.util.*;
class Sample
{
    public static void main(String k[])
   {
    List<Integer> obj=new ArrayList<Integer>();
    obj.add(88);
    obj.add(70);
    int arr[]=obj.toArray(new int[obj.size()]);
    for(int bh:arr)
    {
        System.out.println(bh);
    }

   }
}