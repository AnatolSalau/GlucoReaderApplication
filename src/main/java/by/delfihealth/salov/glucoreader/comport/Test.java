package by.delfihealth.salov.glucoreader.comport;

import by.delfihealth.salov.glucoreader.comport.entities.Command;
import by.delfihealth.salov.glucoreader.comport.entities.HexByteData;
import by.delfihealth.salov.glucoreader.comport.enums.CommandType;
import by.delfihealth.salov.glucoreader.comport.enums.HexByteType;
import by.delfihealth.salov.glucoreader.comport.examples.CRC16;
import by.delfihealth.salov.glucoreader.comport.services.ControlSumCRC16Service;

import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;

public class Test {
      public static void main(String[] args) {
            List<HexByteData> getProtocolVersionDate = new ArrayList<>();

            getProtocolVersionDate.add(new HexByteData("0x02" , HexByteType.STX));
            getProtocolVersionDate.add(new HexByteData("0x06" , HexByteType.LEN_LO));
            getProtocolVersionDate.add(new HexByteData("0x00" , HexByteType.LEN_HI));
            getProtocolVersionDate.add(new HexByteData("0x01" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            String highByteOfSum = controlSumCRC16Service.getHighByteOfSum(getProtocolVersionDate);
            String lowByteOfSum = controlSumCRC16Service.getLowByteOfSum(getProtocolVersionDate);

            getProtocolVersionDate.add(new HexByteData(highByteOfSum , HexByteType.CRC_HI));
            getProtocolVersionDate.add(new HexByteData(lowByteOfSum , HexByteType.CRC_LO));

            Command getProtocolVersionCommand = new Command(CommandType.GET_PROTOCOL_VERSION,getProtocolVersionDate);

      }
}
