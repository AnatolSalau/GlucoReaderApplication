package by.delfihealth.salov.glucoreader.comport.entities;

import by.delfihealth.salov.glucoreader.comport.enums.HexByteType;
import lombok.Data;

import java.util.HexFormat;

@Data
public class HexByteData {
      private final String value;
      private final HexByteType type;

      public HexByteData(String value, HexByteType type) {
            this.value = value;
            this.type = type;
      }

      public HexByteData (byte dataByte, HexByteType type) {
            this.value = getHexStrFromByte(dataByte);
            this.type = type;
      }

      public byte getByteValue() {
            String substringValue = value.substring(2);
            byte[] bytes = HexFormat.of().parseHex(substringValue);
            byte resultByte = bytes[0];
            return resultByte;
      }
      /*

       */
      private String getHexStrFromByte(byte data) {
            String string = Integer.toHexString(data);
            if (string.length() == 1) {
                  return "0x" + Integer.toHexString(data) + "0";
            }
            return "0x" + Integer.toHexString(data); 
      }
}
