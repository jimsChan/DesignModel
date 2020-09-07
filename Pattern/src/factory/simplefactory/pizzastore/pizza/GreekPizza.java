package factory.simplefactory.pizzastore.pizza;

/**
 * @author jamesChan
 * @date 2020/9/7 - 10:30
 */
public class GreekPizza extends pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
