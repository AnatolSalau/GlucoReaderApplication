package by.delfihealth.salov.glucoreader.comport;

import java.util.HexFormat;

public class ControlSumTest {
      public static void main(String[] args) {
            String[] requestProtocolVersionHex = {"02","06","00","01","20","5D"};
            String[] dataHex = {"02","06","00","01"};


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
            crc16.update(byte1);
            crc16.update(byte2);
            crc16.update(byte3);

            String crcLoHiHex = Integer.toHexString((int)crc16.getValue());
            System.out.println("CrcLoHiHex : " + crcLoHiHex);

            String crcLoHex = crcLoHiHex.substring(2, 4);
            System.out.println("crcLoHex : " + crcLoHex);


            String crcHiHex = crcLoHiHex.substring(0, 2);
            System.out.println("crcHiHex : " + crcHiHex);
      }
}
