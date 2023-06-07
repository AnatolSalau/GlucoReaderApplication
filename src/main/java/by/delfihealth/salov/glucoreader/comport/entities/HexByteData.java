package by.delfihealth.salov.glucoreader.comport.entities;

import by.delfihealth.salov.glucoreader.comport.enums.HexByteType;
import lombok.Data;

import java.util.HexFormat;

@Data
public class HexByteData {
      private final String value;
      private final HexByteType type;

      public byte getByteValue() {
            String substringValue = value.substring(2);
            byte[] bytes = HexFormat.of().parseHex(substringValue);
            byte resultByte = bytes[0];
            return resultByte;
      }
}
