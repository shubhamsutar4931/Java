package LIST;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
       /* List<String> shoppingList=new CopyOnWriteArrayList<>();
        shoppingList.add("milk");
        shoppingList.add("eggs");
        shoppingList.add("bread");
        shoppingList.add("fruits");
        System.out.println(shoppingList);
        for(String list:shoppingList)
        {
            System.out.println(list);
            if (list.equals("eggs"))
            {
                shoppingList.add("butter");
                System.out.println("after adding butter");
            }
        }
        System.out.println(shoppingList);
        */

        List<String>  sharedList=new CopyOnWriteArrayList<>();
        sharedList.add("item1");
        sharedList.add("item2");
        sharedList.add("item3");
        Thread readThread=new Thread(()->{
            while (true)
                try {
                    for (String item:sharedList)
                    {
                        System.out.println("redeing item:"+item);
                        Thread.sleep(500);
                    }
                }
                catch (Exception e)
                {
                    System.out.println("error in reading "+e);
                }
        });
         Thread writeThread=new Thread(()->
         {
             try {
                 Thread.sleep(500);
                 sharedList.add("item4");
                 System.out.println("item added on list");
                 sharedList.remove("item1");
                 System.out.println("item removed from list");
             }
             catch (InterruptedException e)
             {
                 System.out.println("writing time error:"+e);
             }
         });
         readThread.start();
         writeThread.start();

    }
}
