package test22;

public class Main {
    public static void main(String[] args) {
        
        String s1 = "123";
        String s2 = new String("123");
        System.out.println(s1==s2);
        // s1是常量池中的对象的引用，而s2是堆中的对象的引用，所以不相等

        String s3 = "abc";
        String s4 = new String("abc");
        String s5 = s4.intern();
        System.out.println(s3==s5);
        // String的intern()方法就是扩充常量池的一个方法；当一个String实例str调用intern()方法时，Java查找常量池中是否有相同Unicode的字符串常量，如果有，则返回其的引用，如果没有，则在常量池中增加一个Unicode等于str的字符串并返回它的引用；
        // 所以s3和s5都是常量池中对象的引用

        // String s1 = "123";
        // 不一定在常量池中创建了对象
    
        // String s1 = new String("123")
        // 一定在堆中创建了对象，不一定在常量池中创建了对象
        // 但是都在栈中创建了String对象的引用

        // compareTo/equals
        String s6 = "Zzz";
        String s7 = "zzz";
        System.out.println(s6==s7);//比较s6和s7两个引用是否相等
        System.out.println(s6.equals(s7));//比较s6和s7两个引用所指向的数值是否相等
        System.out.println(s6.compareTo(s7));//计算s6和s7两个引用所指向的数值在字典上位置的差值
        System.out.println(s6.compareToIgnoreCase(s7));//计算s6和s7两个引用所指向的数值在字典上位置的差值忽略大小写

    
    }
}
