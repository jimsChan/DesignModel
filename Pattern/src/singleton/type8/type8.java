package singleton.type8;

/**
 * @author jamesChan
 * @date 2020/9/7 - 9:53
 */
public class type8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance==instance2);
    }
}

enum Singleton{
    INSTANCE;//属性
    public void sayOK(){
        System.out.println("ok~");
    }
}