package singleton.type7;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @author jamesChan
 * @date 2020/9/7 - 9:06
 */
public class type7 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance.hashCode=" + instance1.hashCode());

    }
}

//静态内部类完成
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    //写一个静态内部类，改类中有一个静态属性Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }

    //提供一个静态的公有方法，直接返回
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
