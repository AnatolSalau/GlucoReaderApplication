package by.delfihealth.salov.glucoreader.comport.services;

import by.delfihealth.salov.glucoreader.comport.entities.RequestToComPort;
import by.delfihealth.salov.glucoreader.comport.entities.HexByteData;
import by.delfihealth.salov.glucoreader.comport.enums.RequestType;
import by.delfihealth.salov.glucoreader.comport.enums.ResponseType;
import com.fazecast.jSerialComm.SerialPort;
import lombok.AllArgsConstructor;

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

            commPort.writeBytes(convertCommandToByteArr(requestToComPort),
                  requestToComPort.getDataList().size());

            for (int i = 0; i < 10; i++) {
                  try {
                        TimeUnit.MILLISECONDS.sleep(15);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
/*                  byte[] bytes = new byte[];*/
            }

            commPort.closePort();
            return null;
      }

      private byte [] convertCommandToByteArr(RequestToComPort requestToComPort) {
            List<HexByteData> dataList = requestToComPort.getDataList();
            byte[] result = new byte[dataList.size()];
            for (int i = 0; i < dataList.size(); i++) {
                  result[i] = dataList.get(i).getByteValue();
            }
            return result;
      }

}
