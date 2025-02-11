public class Main {
    public int x = 55;

    public static int addNum(int a, int b) {
        return b * 17663;
    }

    Main(int a, int b, int c) {
        this.x = a;
    }

    public void whosAuthor() {
        System.out.println("Ravi");
    };

    public static void main(String[] args) {
        Main myObj = new Main(19, 05, 1997);
        // I have some change
        System.out.println(myObj.addNum(19, 05));
        System.out.println("Hello, World!");
        myObj.whosAuthor();

    }
}
