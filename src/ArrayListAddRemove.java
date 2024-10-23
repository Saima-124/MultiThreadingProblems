import java.util.List;
public class ArrayListAddRemove {
    public static void main(String[] args) throws InterruptedException {
        List<Integer>list=new java.util.ArrayList<>();
        Runnable add = ()->{
            for(int i=0;i<100;i++){
                list.add(i);
            }
        };
        Runnable remove = ()->{
            for(int i=0;i<10;i++){
                if(!list.isEmpty()){
                    list.remove(0);
                }
            }
        };
        Thread t1 = new Thread(add);
        Thread t2 = new Thread(remove);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("List is " + list);
        System.out.println("List size is " + list.size());
    }
}
