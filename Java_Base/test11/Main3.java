package test11;

public class Main3 {
    public static void main(String[] args) {
        // String类不好实现翻转，所以没有这个方法，因为String类是不可变的
        // 但是StringBuffer和StringBuilder可以修改所以有翻转方法
        StringBuffer aBuffer = new StringBuffer("123456");
        System.out.println(aBuffer);
        aBuffer.reverse();
        System.out.println(aBuffer);
    }
}
