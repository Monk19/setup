public class Main {
    public static int x = 123;
    public String myName = "Ravi";

    public static int addNum(int a, int b) {
        return a + b;
    }

    Main(int a, int b, int c) {
        this.x = a;
    }

    public void whosAuthor() {
        System.out.println("Ravi");
    };

    public static void main(String[] args) {
        Main myObj = new Main(19, 05, 1997);
        System.out.println(myObj.addNum(19, 05));
        System.out.println(x);
        System.out.println("Hello, Worl!");
        // I have some change in the git epo

    }
}
