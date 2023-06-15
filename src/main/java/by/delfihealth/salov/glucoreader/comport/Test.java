package by.delfihealth.salov.glucoreader.comport;

import by.delfihealth.salov.glucoreader.comport.entities.RequestToComPort;
import by.delfihealth.salov.glucoreader.comport.entities.HexByteData;
import by.delfihealth.salov.glucoreader.comport.entities.ResponseFromComPort;
import by.delfihealth.salov.glucoreader.comport.enums.RequestType;
import by.delfihealth.salov.glucoreader.comport.enums.HexByteType;
import by.delfihealth.salov.glucoreader.comport.services.CommandService;
import by.delfihealth.salov.glucoreader.comport.services.ControlSumCRC16Service;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/*

 */
public class Test {
      public static void main(String[] args) {
/*            getProtocolVersion();
            getDeviceType();
            getState();
            getDateTime();
            getValues();*/
            getConverterType();
      }

      private static void getProtocolVersion() {
            List<HexByteData> getProtocolVersionDate = new ArrayList<>();

            getProtocolVersionDate.add(new HexByteData("0x02" , HexByteType.STX));
            getProtocolVersionDate.add(new HexByteData("0x06" , HexByteType.LEN_LO));
            getProtocolVersionDate.add(new HexByteData("0x00" , HexByteType.LEN_HI));
            getProtocolVersionDate.add(new HexByteData("0x01" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getProtocolVersionDate);

            getProtocolVersionDate.add(new HexByteData(highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getProtocolVersionDate.add(new HexByteData(highLowByteOfSum.getKey() , HexByteType.CRC_HI));

            RequestToComPort getProtocolVersionRequest = new RequestToComPort(RequestType.GET_PROTOCOL_VERSION,getProtocolVersionDate);
            System.out.println(getProtocolVersionRequest);
            CommandService commandService =
                  new CommandService(
                        "COM2", 19200, 8,  1, 2);
            ResponseFromComPort responseFromComPort = commandService.sendCommand(getProtocolVersionRequest);
            System.out.println(responseFromComPort);
      }

      private static void getDeviceType() {
            List<HexByteData> getStateDate = new ArrayList<>();
            getStateDate.add(new HexByteData("0x02" , HexByteType.STX));
            getStateDate.add(new HexByteData("0x06" , HexByteType.LEN_LO));
            getStateDate.add(new HexByteData("0x00" , HexByteType.LEN_HI));
            getStateDate.add(new HexByteData("0x02" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getStateDate);

            getStateDate.add(new HexByteData(highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getStateDate.add(new HexByteData(highLowByteOfSum.getKey() , HexByteType.CRC_HI));

            RequestToComPort getDeviceTypeRequest = new RequestToComPort(RequestType.GET_DEVICE_TYPE,getStateDate);
            System.out.println(getDeviceTypeRequest);

            CommandService commandService =
                  new CommandService(
                        "COM2", 19200, 8,  1, 2);
            ResponseFromComPort responseFromComPort = commandService.sendCommand(getDeviceTypeRequest);
            System.out.println(responseFromComPort);
      }

      private static void getState() {
            List<HexByteData> getStateDate = new ArrayList<>();
            getStateDate.add(new HexByteData("0x02" , HexByteType.STX));
            getStateDate.add(new HexByteData("0x06" , HexByteType.LEN_LO));
            getStateDate.add(new HexByteData("0x00" , HexByteType.LEN_HI));
            getStateDate.add(new HexByteData("0x03" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getStateDate);

            getStateDate.add(new HexByteData(highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getStateDate.add(new HexByteData(highLowByteOfSum.getKey() , HexByteType.CRC_HI));

            RequestToComPort getStateRequest = new RequestToComPort(RequestType.GET_STATE,getStateDate);
            System.out.println(getStateRequest);

            CommandService commandService =
                  new CommandService(
                        "COM2", 19200, 8,  1, 2);
            ResponseFromComPort responseFromComPort = commandService.sendCommand(getStateRequest);
            System.out.println(responseFromComPort);
      }

      private static void getDateTime() {
            List<HexByteData> getStateDate = new ArrayList<>();
            getStateDate.add(new HexByteData("0x02" , HexByteType.STX));
            getStateDate.add(new HexByteData("0x06" , HexByteType.LEN_LO));
            getStateDate.add(new HexByteData("0x00" , HexByteType.LEN_HI));
            getStateDate.add(new HexByteData("0x04" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getStateDate);

            getStateDate.add(new HexByteData(highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getStateDate.add(new HexByteData(highLowByteOfSum.getKey() , HexByteType.CRC_HI));

            RequestToComPort getStateRequest = new RequestToComPort(RequestType.GET_DATE_TIME,getStateDate);
            System.out.println(getStateRequest);
            CommandService commandService =
                  new CommandService(
                        "COM2", 19200, 8,  1, 2);
            ResponseFromComPort responseFromComPort = commandService.sendCommand(getStateRequest);
            System.out.println(responseFromComPort);
      }

      private static void getValues() {
            List<HexByteData> getValuesDate = new ArrayList<>();
            getValuesDate.add(new HexByteData("0x02" , HexByteType.STX));
            getValuesDate.add(new HexByteData("0x0A" , HexByteType.LEN_LO));
            getValuesDate.add(new HexByteData("0x00" , HexByteType.LEN_HI));
            getValuesDate.add(new HexByteData("0x05" , HexByteType.CMD));
            getValuesDate.add(new HexByteData("0x00" , HexByteType.START_LO));
            getValuesDate.add(new HexByteData("0x00" , HexByteType.START_HI));
            getValuesDate.add(new HexByteData("0x00" , HexByteType.STOP_LO));
            getValuesDate.add(new HexByteData("0x00" , HexByteType.STOP_HI));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getValuesDate);

            getValuesDate.add(new HexByteData(highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getValuesDate.add(new HexByteData(highLowByteOfSum.getKey() , HexByteType.CRC_HI));

            RequestToComPort getStateRequest = new RequestToComPort(RequestType.GET_VALUES,getValuesDate);
            System.out.println(getStateRequest);
            CommandService commandService =
                  new CommandService(
                        "COM2", 19200, 8,  1, 2);
            ResponseFromComPort responseFromComPort = commandService.sendCommand(getStateRequest);
            System.out.println(responseFromComPort);
      }

      private static void getConverterType() {
            List<HexByteData> getConverterTypeDate = new ArrayList<>();
            getConverterTypeDate.add(new HexByteData("0x02" , HexByteType.STX));
            getConverterTypeDate.add(new HexByteData("0x06" , HexByteType.LEN_LO));
            getConverterTypeDate.add(new HexByteData("0x00" , HexByteType.LEN_HI));
            getConverterTypeDate.add(new HexByteData("0x31" , HexByteType.CMD));
            getConverterTypeDate.add(new HexByteData("0x20" , HexByteType.START_LO));
            getConverterTypeDate.add(new HexByteData("0x49" , HexByteType.START_HI));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getConverterTypeDate);

            getConverterTypeDate.add(new HexByteData(highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getConverterTypeDate.add(new HexByteData(highLowByteOfSum.getKey() , HexByteType.CRC_HI));

            RequestToComPort getConverterTypeRequest = new RequestToComPort(RequestType.GET_CONVERTER_TYPE,getConverterTypeDate);
            System.out.println(getConverterTypeRequest);
            CommandService commandService =
                  new CommandService(
                        "COM2", 19200, 8,  1, 2);
            ResponseFromComPort responseFromComPort = commandService.sendCommand(getConverterTypeRequest);
            System.out.println(responseFromComPort);
      }
}
