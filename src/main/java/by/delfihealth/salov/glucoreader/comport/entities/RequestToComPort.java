package by.delfihealth.salov.glucoreader.comport.entities;

import by.delfihealth.salov.glucoreader.comport.enums.RequestType;
import lombok.Data;

import java.util.List;

@Data
public  class RequestToComPort {
      private final RequestType type;
      private final List<HexByteData> dataList;
}
