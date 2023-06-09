package by.delfihealth.salov.glucoreader.comport.services;

import by.delfihealth.salov.glucoreader.comport.entities.RequestToComPort;
import by.delfihealth.salov.glucoreader.comport.entities.HexByteData;
import by.delfihealth.salov.glucoreader.comport.entities.ResponseFromComPort;
import by.delfihealth.salov.glucoreader.comport.enums.ResponseType;
import com.fazecast.jSerialComm.SerialPort;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@AllArgsConstructor
public class ComPortCommandService {

      private final String portSystemName;
      private final int baudRate;
      private final int dataBits;
      private final int stopBits;
      private final int parity;
      private final int minPauseTimeMs;
      private final int mixPauseTimeMs;

      /**
       * Write request  and read response bytes to CommPort
       * @param requestToComPort - data bytes and description
       * @return
       */
      public List<String> sendCommand (RequestToComPort requestToComPort) {
            SerialPort commPort = SerialPort.getCommPort(portSystemName);
            commPort.openPort();
            commPort.setComPortParameters(baudRate,
                  dataBits,  stopBits, parity);

            commPort.writeBytes(convertRequestToByteArr(requestToComPort),
                  requestToComPort.getDataList().size());

            ResponseType responseType = ResponseType.valueOf(requestToComPort.getType().toString());
            byte[] responseBytes = new byte[responseType.numberBytesInResponse];

            for (int i = 0; i < 10; i++) {
                  try {
                        TimeUnit.MILLISECONDS.sleep(15);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
                  int wasRead = commPort.readBytes(responseBytes, responseBytes.length);
                  if (wasRead > 0 ) {
                        break;
                  }
            }

            List<String> responseHexList = new ArrayList<>();
            for (byte responseByte : responseBytes) {
                  responseHexList.add("0x" + Integer.toHexString(responseByte));
            }

            commPort.closePort();
            return responseHexList;
      }

      private byte [] convertRequestToByteArr(RequestToComPort requestToComPort) {
            List<HexByteData> dataList = requestToComPort.getDataList();
            byte[] result = new byte[dataList.size()];
            for (int i = 0; i < dataList.size(); i++) {
                  result[i] = dataList.get(i).getByteValue();
            }
            return result;
      }

      private ResponseFromComPort convertByteArrToResponse(byte[] data) {
            return null;
      }
}
