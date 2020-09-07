package singleton.type6;

/**
 * @author jamesChan
 * @date 2020/9/7 - 9:06
 */
public class type6 {
    public static void main(String[] args) {
        System.out.println("懒汉式（双重检查）");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance.hashCode=" + instance1.hashCode());
    }
}

class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    //即懒汉式
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
