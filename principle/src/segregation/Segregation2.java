package segregation;

/**
 * @author jamesChan
 * @date 2020/9/3 - 16:52
 */
public class Segregation2 {
    public static void main(String[] args) {
        AA a = new AA();
        a.depend1(new BB());
        a.depend2(new BB());
        a.depend3(new BB());

        CC c=new CC();
        c.depend1(new DD());
        c.depend4(new DD());
        c.depend5(new DD());
    }
}

interface Interface11 {
    void operation1();
}

interface Interface22 {
    void operation2();
    void operation3();
}

interface Interface33 {
    void operation4();
    void operation5();
}

class BB implements Interface11 ,Interface22{

    @Override
    public void operation1() {
        System.out.println(" B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println(" B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println(" B 实现了 operation3");
    }
}

class DD implements Interface11 ,Interface33{

    @Override
    public void operation1() {
        System.out.println(" D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println(" D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println(" D 实现了 operation5");
    }
}

class AA{

    public void depend1(Interface11 i) {
        i.operation1();
    }

    public void depend2(Interface22 i) {
        i.operation2();
    }

    public void depend3(Interface22 i) {
        i.operation3();
    }
}

class CC{

    public void depend1(Interface11 i) {
        i.operation1();
    }

    public void depend4(Interface33 i) {
        i.operation4();
    }

    public void depend5(Interface33 i) {
        i.operation5();
    }
}