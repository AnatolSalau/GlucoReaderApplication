package by.delfihealth.salov.glucoreader.comport;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HexFormat;

public class Test {
      public static void main(String[] args) {
            String[] requestGetDateTime = {"02","06","00","04","E0","5E"};

//            Byte.parseByte("A1",16);
            byte[] a1s = HexFormat.of().parseHex("E0");
            String string = Integer.toHexString(-32);
            System.out.println(Arrays.toString(a1s));
            System.out.println(string);
      }
}
