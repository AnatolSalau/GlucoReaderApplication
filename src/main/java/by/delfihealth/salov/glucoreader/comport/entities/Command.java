package by.delfihealth.salov.glucoreader.comport.entities;

import by.delfihealth.salov.glucoreader.comport.enums.CommandType;
import lombok.Data;

import java.util.List;

@Data
public  class Command {
      private final CommandType type;
      private final List<HexByteData> dataList;
}
