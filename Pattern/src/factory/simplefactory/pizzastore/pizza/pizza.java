package factory.simplefactory.pizzastore.pizza;

/**
 * @author jamesChan
 * @date 2020/9/7 - 10:26
 */
public abstract class pizza {
    protected String name;//名字

    //准备原材料,不同的披萨不一样，因此，我们做出抽象方法
    public abstract void prepare();

    //烘烤
    public void bake() {
        System.out.println(name + " baking;");
    }

    //切割
    public void cut() {
        System.out.println(name + " cutting");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
