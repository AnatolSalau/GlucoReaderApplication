package by.delfihealth.salov.glucoreader.comport.entities;

import by.delfihealth.salov.glucoreader.comport.enums.ResponseType;
import lombok.Data;

import java.util.List;

@Data
public  class ResponseFromComPort {
      private final ResponseType type;
      private final List<HexByteData> dataList;

      @Override
      public String toString() {
            return "ResponseFromComPort{" +
                  "type=" + type +
                  ", dataList=" + dataList +
                  "}\n";
      }
}
