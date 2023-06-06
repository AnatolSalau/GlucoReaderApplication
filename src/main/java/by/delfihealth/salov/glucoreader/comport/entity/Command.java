package by.delfihealth.salov.glucoreader.comport.entity;

import by.delfihealth.salov.glucoreader.comport.enums.CommandType;
import lombok.Data;

import java.util.List;

@Data
public  class Command {
      private final CommandType type;
      private final List<HexData> dataList;
}
