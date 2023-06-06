package by.delfihealth.salov.glucoreader.comport;

import by.delfihealth.salov.glucoreader.comport.entity.Command;
import by.delfihealth.salov.glucoreader.comport.entity.HexData;
import by.delfihealth.salov.glucoreader.comport.enums.CommandType;
import by.delfihealth.salov.glucoreader.comport.enums.HexType;

import java.util.ArrayList;
import java.util.List;

public class Test {
      public static void main(String[] args) {
            List<HexData> getProtocolVersionDate = new ArrayList<>();

            getProtocolVersionDate.add(new HexData("0x02" , HexType.STX));
            getProtocolVersionDate.add(new HexData("0x06" , HexType.LEN_LO));
            getProtocolVersionDate.add(new HexData("0x00" , HexType.LEN_HI));
            getProtocolVersionDate.add(new HexData("0x01" , HexType.CMD));
            getProtocolVersionDate.add(new HexData("0x20" , HexType.CRC_LO));
            getProtocolVersionDate.add(new HexData("0x5D" , HexType.CRC_HI));

            Command getProtocolVersionCommand = new Command(CommandType.GET_PROTOCOL_VERSION,getProtocolVersionDate);
      }
}
