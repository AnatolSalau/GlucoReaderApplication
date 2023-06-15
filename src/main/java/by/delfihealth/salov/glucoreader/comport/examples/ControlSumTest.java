package by.delfihealth.salov.glucoreader.comport.examples;

import java.util.HexFormat;

public class ControlSumTest {
      public static void main(String[] args) {
            String[] requestProtocolVersionHex = {"02","06","00","01","20","5D"};
            /*String[] dataHex = {"02","06","00","01"};*/

            String[] requestGetValues = {"02","0A","00","05","01","00","02","00","A7","BE"};

/*            String[] requestGetValues = {"02","0A","00","05","00","00","02","00","A6","B2"};*/

/*            String[] requestGetValues = {"02","0A","00","05","00","00","08","00","A6","B2"};*/

            String[] dataHex = {"02","06","00","31"};

            CRC16 crc16 = new CRC16();

            byte[] bytes0 = HexFormat.of().parseHex(dataHex[0]);
            byte byte0 = bytes0[0];

            byte[] bytes1 = HexFormat.of().parseHex(dataHex[1]);
            byte byte1 = bytes1[0];

            byte[] bytes2 = HexFormat.of().parseHex(dataHex[2]);
            byte byte2 = bytes2[0];

            byte[] bytes3 = HexFormat.of().parseHex(dataHex[3]);
            byte byte3 = bytes3[0];


            crc16.update(byte0);
            System.out.println(crc16);

            crc16.update(byte1);
            System.out.println(crc16);

            crc16.update(byte2);
            System.out.println(crc16);

            crc16.update(byte3);
            System.out.println(crc16);

            long value = crc16.getValue();
            String crcLoHiHex = Integer.toHexString((int)crc16.getValue());
            System.out.println("CrcLoHiHex : " + crcLoHiHex);

            String crcLoHex = crcLoHiHex.substring(2, 4);
            System.out.println("crcLoHex : " + crcLoHex);

            String crcHiHex = crcLoHiHex.substring(0, 2);
            System.out.println("crcHiHex : " + crcHiHex);
      }
}
