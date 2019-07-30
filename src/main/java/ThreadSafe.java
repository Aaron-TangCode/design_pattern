import java.util.Vector;

/**
 * @ClassName ThreadSafe
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/17 10:15
 * @Version 1.0
 */
public class ThreadSafe {
    private static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {
        while(true){
            for (int i = 0; i < 10; i++) {
                vector.add(i);
            }

            Thread removeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.remove(i);
                    }
                }
            });

            Thread printThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < vector.size(); i++) {
                        System.out.println(vector.get(i));
                    }
                }
            });

            removeThread.start();
            printThread.start();

            while (Thread.activeCount()>20);
        }
    }
}
