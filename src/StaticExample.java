public class StaticExample {
    static StaticExample staticExmple=new StaticExample();
    static int n=4;
    static int i = returnIntStatic();

    static int k=3;
    int j=returnInt();
    static {
        System.out.println("Static");
    }
    {
        System.out.println("Clean");
    }
    StaticExample(){
        System.out.println("Constructor");
    }
    static int returnIntStatic(){
        System.out.println(n);
        System.out.println(k);
        System.out.println("Return static int");
        return 1;
    }
    int returnInt(){
        System.out.println("Return int");
        return 2;
    }

    public static void main(String[] args) {
        new StaticExample();
    }
}
