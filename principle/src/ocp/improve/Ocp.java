package ocp.improve;

/**
 * @author jamesChan
 * @date 2020/9/4 - 11:58
 */
public class Ocp {
    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

//这是一个用于绘图的类[使用方]
class GraphicEditor {
    //接收Shape对象，然后根据type，绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }
}

//Shape类，基类
abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//新增画三角形
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

class OtherGraphic extends Shape{

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}