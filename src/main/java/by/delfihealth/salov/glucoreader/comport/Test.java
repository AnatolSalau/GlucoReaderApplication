package by.delfihealth.salov.glucoreader.comport;

import by.delfihealth.salov.glucoreader.comport.entities.RequestToComPort;
import by.delfihealth.salov.glucoreader.comport.entities.HexByteData;
import by.delfihealth.salov.glucoreader.comport.enums.RequestType;
import by.delfihealth.salov.glucoreader.comport.enums.HexByteType;
import by.delfihealth.salov.glucoreader.comport.services.ComPortCommandService;
import by.delfihealth.salov.glucoreader.comport.services.ControlSumCRC16Service;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Test {
      public static void main(String[] args) {
            List<HexByteData> getProtocolVersionDate = new ArrayList<>();

            getProtocolVersionDate.add(new HexByteData("0x02" , HexByteType.STX));
            getProtocolVersionDate.add(new HexByteData("0x06" , HexByteType.LEN_LO));
            getProtocolVersionDate.add(new HexByteData("0x00" , HexByteType.LEN_HI));
            getProtocolVersionDate.add(new HexByteData("0x01" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getProtocolVersionDate);

            getProtocolVersionDate.add(new HexByteData(highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getProtocolVersionDate.add(new HexByteData(highLowByteOfSum.getKey() , HexByteType.CRC_HI));

            RequestToComPort getProtocolVersionRequestToComPort = new RequestToComPort(RequestType.GET_PROTOCOL_VERSION,getProtocolVersionDate);

            ComPortCommandService comPortCommandService =
                  new ComPortCommandService(
                        "COM2", 19200, 8,  1, 2, 15, 150);
            comPortCommandService.sendCommand(getProtocolVersionRequestToComPort);
      }
}
