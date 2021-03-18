package test24;

import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws Exception{
        InetAddress bInetAddress = InetAddress.getByName("met2.fzu.edu.cn");
        
        System.out.println(bInetAddress.getAddress());
        
        System.out.println(bInetAddress.getHostName());
        System.out.println(bInetAddress.getHostAddress());
        // System.out.println(bInetAddress.isReachable(1000));

        // System.out.println(bInetAddress.equals(InetAddress.getByName("121.196.158.38")));
        // System.out.println(bInetAddress.hashCode());
        // System.out.println(InetAddress.getByName("192.168.0.1").isLoopbackAddress());
    }
}
