package by.delfihealth.salov.glucoreader.comport.services;

import by.delfihealth.salov.glucoreader.comport.entities.Command;
import com.fazecast.jSerialComm.SerialPort;

import java.util.List;

public class ComPortCommandService {
      List<String> sendCommand (Command command, String portSystemName) {
            SerialPort commPort = SerialPort.getCommPort(portSystemName);
            commPort.openPort();

            commPort.closePort();
            return null;
      }

}
