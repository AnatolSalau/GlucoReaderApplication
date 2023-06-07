package by.delfihealth.salov.glucoreader.comport.examples;

import com.fazecast.jSerialComm.SerialPort;

import java.util.Arrays;
import java.util.HexFormat;
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

      public String[] getResponseFromPort(String portSistemName, String[] requestArrHex, int responseArrLength) {
            SerialPort commPort = SerialPort.getCommPort(portSistemName);

            commPort.openPort();
            commPort.setComPortParameters(19200, 8,  1, 2);


            System.out.println("Com" + portSistemName + " is open: " + commPort.isOpen());

            byte[] arrByteFromHex = new byte[requestArrHex.length];
            for (int i = 0; i < requestArrHex.length; i++) {
                  byte[] bytes = HexFormat.of().parseHex(requestArrHex[i]);
                  arrByteFromHex[i] = bytes[0];
            }

            commPort.writeBytes(arrByteFromHex, arrByteFromHex.length);

            try {
                  TimeUnit.MILLISECONDS.sleep(150);
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }

            byte[] arrByteResponse = new byte[responseArrLength+1];
            commPort.readBytes(arrByteResponse, arrByteResponse.length);

            String[] responseArrHex = new String[arrByteResponse.length];
            for (int i = 0; i < arrByteResponse.length; i++) {
                  responseArrHex[i] = Integer.toHexString(arrByteResponse[i]);
            }

            commPort.closePort();
            while (commPort.isOpen()) {
                  try {
                        TimeUnit.MILLISECONDS.sleep(10);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
            }
            System.out.println("Com" + portSistemName + " is open: " + commPort.isOpen());

            for (int i = 0; i < responseArrHex.length; i++) {
                  if (responseArrHex[i].startsWith("f")) {
                        System.out.println("!!!!!!!!!! : " + responseArrHex[i]);
                  }
                  if (responseArrHex[i].startsWith("f") && responseArrHex[i].length() > 1) {
                        responseArrHex[i] = responseArrHex[i]
                              .substring(responseArrHex[i].length()-2);
                  }
                  responseArrHex[i] = responseArrHex[i].toUpperCase();
            }
            return responseArrHex;
      }


}
