package singleton.type2;

/**
 * @author jamesChan
 * @date 2020/9/4 - 16:12
 */
public class type2 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
    }
}

//饿汉式（静态变量）
class Singleton{
    //1.构造器私有化，外部能new
    private Singleton(){

    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    static{//在静态代码块中，创建单例对象
        instance=new Singleton();
    }

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}