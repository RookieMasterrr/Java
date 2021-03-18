package test29;

import java.io.DataOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        DataOutputStream dataOutputStream = new DataOutputStream(System.out);
        dataOutputStream.write(1);
    }
}
