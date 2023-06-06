package by.delfihealth.salov.glucoreader.comport.entity;

import by.delfihealth.salov.glucoreader.comport.enums.HexType;
import lombok.Data;

@Data
public class HexData {
      private final String value;
      private final HexType type;

}
