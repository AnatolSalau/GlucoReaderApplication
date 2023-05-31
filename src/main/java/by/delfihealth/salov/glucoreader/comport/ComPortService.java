package by.delfihealth.salov.glucoreader.comport;

import com.fazecast.jSerialComm.SerialPort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ComPortService {

      public List<String> getAllSystemPortNames() {
            SerialPort[] commPorts = SerialPort.getCommPorts();
            List<String> systemPortNames = Arrays.stream(commPorts)
                  .map(SerialPort::getSystemPortName).toList();
            return systemPortNames;
      }

      public List<String> getAllSystemPortDescription() {
            SerialPort[] commPorts = SerialPort.getCommPorts();
            List<String> systemPortDescription = Arrays.stream(commPorts)
                  .map(SerialPort::getPortDescription).toList();
            return systemPortDescription;
      }

      public List<String> getAllSystemPortDescriptiveNames() {
            SerialPort[] commPorts = SerialPort.getCommPorts();
            List<String> systemPortDescriptiveNames = Arrays.stream(commPorts)
                  .map(SerialPort::getDescriptivePortName).toList();
            return systemPortDescriptiveNames;
      }

      public void sendData() {
            SerialPort com2 = SerialPort.getCommPort("COM2");
            System.out.println(com2);
            com2.openPort();
            com2.setComPortParameters(19200, 8,  1, 0);

            try {
                  TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }
            com2.closePort();

      }

}
