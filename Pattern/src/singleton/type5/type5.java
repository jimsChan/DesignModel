package singleton.type5;

/**
 * @author jamesChan
 * @date 2020/9/7 - 8:49
 */
public class type5 {
    public static void main(String[] args) {
        System.out.println("懒汉式，线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance.hashCode=" + instance1.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    //即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}