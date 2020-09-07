package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jamesChan
 * @date 2020/9/7 - 10:32
 */
public class OrderPizzza {
    //构造器
    public OrderPizzza(){
        pizza pizza=null;
        String otherType;//订购披萨的类型
        do{
            otherType=gettype();
            if (otherType.equals("greek")){
                pizza=new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(otherType.equals("cheese")){
                pizza=new CheesePizza();
                pizza.setName("奶酪披萨");
            }else {
                break;
            }
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    //写一个方法，可以获取客户希望订购的披萨类型
    private String gettype(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str=strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
