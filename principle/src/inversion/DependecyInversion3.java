package inversion;

/**
 * @author jamesChan
 * @date 2020/9/4 - 9:09
 */
public class DependecyInversion3 {
    public static void main(String[] args) {
        //方式一
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new AppleTv());
        //方式二
        TrafficToolsImpl trafficTools = new TrafficToolsImpl(new Benz());
        trafficTools.manufacture();
        //方式三
        FruitImpl fruit = new FruitImpl();
//        fruit.setFruit(new Apple());
        fruit.eat();
    }
}

//方式一：通过接口传递实现依赖
//开关的接口
interface IOpenAndClose {
    public void open(ITV tv);
}

//ITV接口
interface ITV {
    public void play();
}

//IOpenAndClose接口实现
class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

class AppleTv implements ITV {
    @Override
    public void play() {
        System.out.println("open the Apply TV...");
    }
}

//-------------------------------------------------------------------
//方式二：通过构造方法依赖传递
//交通工具接口
interface TrafficTools {
    //制造方法
    public void manufacture();
}

//驾驶接口
interface Driving {
    public void drive();
}

//交通工具实现类
class TrafficToolsImpl implements TrafficTools {
    public Driving dr;

    public TrafficToolsImpl(Driving dr) {
        this.dr = dr;
    }

    @Override
    public void manufacture() {
        this.dr.drive();
    }
}

//驾驶工具实现类
class Benz implements Driving {
    @Override
    public void drive() {
        System.out.println("驾驶奔驰");
    }
}

//-------------------------------------
//方式三：通过setter方法传递
interface Fruit {
    public void eat();

    public void setFruit(FruitType type);
}

interface FruitType {
    public void type();
}

class FruitImpl implements Fruit {
    private FruitType fruitType;

    @Override
    public void eat() {
        if (this.fruitType != null) {
            fruitType.type();
        }else {
            System.out.println("请先制造水果类型");
        }
    }

    @Override
    public void setFruit(FruitType type) {
        this.fruitType = type;
    }
}

class Apple implements FruitType {

    @Override
    public void type() {
        System.out.println("正在吃的水果是苹果");
    }
}
