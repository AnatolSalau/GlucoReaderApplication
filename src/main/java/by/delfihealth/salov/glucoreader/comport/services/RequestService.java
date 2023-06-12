package by.delfihealth.salov.glucoreader.comport.services;

import by.delfihealth.salov.glucoreader.comport.entities.HexByteData;
import by.delfihealth.salov.glucoreader.comport.entities.RequestToComPort;
import by.delfihealth.salov.glucoreader.comport.entities.ResponseFromComPort;
import by.delfihealth.salov.glucoreader.comport.enums.ResponseType;

import java.util.List;

public class RequestService {

      public byte [] convertRequestToByteArr(RequestToComPort requestToComPort) {
            List<HexByteData> dataList = requestToComPort.getDataList();
            byte[] result = new byte[dataList.size()];
            for (int i = 0; i < dataList.size(); i++) {
                  result[i] = dataList.get(i).getByteValue();
            }
            return result;
      }
}
