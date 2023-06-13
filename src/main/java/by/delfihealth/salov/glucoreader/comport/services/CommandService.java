package by.delfihealth.salov.glucoreader.comport.services;

import by.delfihealth.salov.glucoreader.comport.entities.RequestToComPort;
import by.delfihealth.salov.glucoreader.comport.entities.ResponseFromComPort;
import by.delfihealth.salov.glucoreader.comport.enums.ResponseType;
import com.fazecast.jSerialComm.SerialPort;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@AllArgsConstructor
public class CommandService {

      private final String portSystemName;
      private final int baudRate;
      private final int dataBits;
      private final int stopBits;
      private final int parity;

      /**
       * Write request  and read response bytes to CommPort
       * @param requestToComPort - data bytes and description
       * @return
       */
      public ResponseFromComPort sendCommand (RequestToComPort requestToComPort) {
            SerialPort commPort = SerialPort.getCommPort(portSystemName);
            commPort.openPort();
            commPort.setComPortParameters(baudRate,
                  dataBits,  stopBits, parity);
            RequestService requestService = new RequestService();
            byte[] bytesRequest = requestService.convertRequestToByteArr(requestToComPort);
            commPort.writeBytes(bytesRequest,
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

            ResponseService responseService = new ResponseService();
            ResponseFromComPort responseFromComPort = responseService.convertByteArrToResponse(responseBytes, responseType);

            commPort.closePort();
            return responseFromComPort;
      }

}
