package factory.simplefactory.pizzastore.pizza;

/**
 * @author jamesChan
 * @date 2020/9/7 - 10:29
 */
public class CheesePizza extends pizza {
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨 准备原材料");
    }
}
