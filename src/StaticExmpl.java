import java.io.Serializable;

public class StaticExmpl {
    static int i = 5;
    static int a = 6;
    int b = 6;
    int j;

    static {
        i = 6;
    }

    static {
        System.out.println("static initializer");
    }

    {
        System.out.println("initializer");
    }

    {
        System.out.println("Second initializer");
    }

    StaticExmpl() {
        i++;
        System.out.println("Second constructor");
    }

    static void staticMethod() {
        i = 7;
        System.out.println("Static method");
        System.out.println(i);
    }

    public static void main(String[] args) {
        /*StaticExmpl staticExmpl = new StaticExmpl();
        StaticExmpl staticExmpl2 = new StaticExmpl();

        staticExmpl.j = 1;
        staticExmpl2.j = 2;
        System.out.println(staticExmpl.j);
        System.out.println(staticExmpl2.j);

        staticExmpl.i = 1;
        staticExmpl2.i = 2;
        System.out.println(staticExmpl.i);
        System.out.println(staticExmpl2.i);

        System.out.println(StaticExmpl.i);
        StaticExmpl.staticMethod();
        System.out.println(StaticExmpl.i);

        new StaticExmpl();
        new StaticExmpl();
        new StaticExmpl();

        new StaticExmpl();
        System.out.println(StaticExmpl.i);
*/
        //    System.out.println(StaticExmpl.a);
        staticMethod();
        new StaticExmpl();
        new StaticExmpl();

    }
}
