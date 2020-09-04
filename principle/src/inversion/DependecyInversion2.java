package inversion;

/**
 * @author jamesChan
 * @date 2020/9/3 - 17:30
 */
public class DependecyInversion2 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receive(new Email1());
        person1.receive(new WeiXin());
    }
}

//定义接口
interface IReceiver {
    public String getInfo();
}

class Email1 implements IReceiver {
    public String getInfo() {
        return "电子邮件信息; Hello world";
    }
}

//增加微信
class WeiXin implements IReceiver {
    @Override
    public String getInfo() {
        return "微信信息; Hello world";
    }
}

//方式2
class Person1 {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}