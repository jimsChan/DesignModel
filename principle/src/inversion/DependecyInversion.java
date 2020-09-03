package inversion;

/**
 * @author jamesChan
 * @date 2020/9/3 - 17:25
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

/**
 * 完成Person接收消息的功能
 * 方式1分析
 * 1.简单，比较容易想到
 * 2.如果我们获取的对象是微信，短信等等，则新增类，同时person也要增加相应的接收方法
 * 3.解决思路：引入一个抽象的接口IReceiver，表示接收这，这样Person类与接口发送依赖
 *            因为Email，WeiXin等等属于接收的范围，他们各自实现IReceived接口就ok，这样我们就符合依赖倒转原则
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息： hello,world";
    }
}