package test25;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Runtime.getRuntime().exec("shutdown -s -t 5");
    }
}