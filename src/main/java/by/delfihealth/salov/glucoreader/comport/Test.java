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


public class Test {
      public static void main(String[] args) {
            getProtocolVersion();
            getDeviceType();
            getState();
            getDateTime();
            getValues();
            getConverterType();
            setDateTime();
            setConverterType();
      }


      private static void getProtocolVersion() {
            List<HexByteData> getProtocolVersionDate = new ArrayList<>();

            getProtocolVersionDate.add(new HexByteData(0 ,"0x02" , HexByteType.STX));
            getProtocolVersionDate.add(new HexByteData(1, "0x06" , HexByteType.LEN_LO));
            getProtocolVersionDate.add(new HexByteData(2, "0x00" , HexByteType.LEN_HI));
            getProtocolVersionDate.add(new HexByteData(3, "0x01" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getProtocolVersionDate);

            getProtocolVersionDate.add(new HexByteData(4, highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getProtocolVersionDate.add(new HexByteData(5, highLowByteOfSum.getKey() , HexByteType.CRC_HI));

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
            getStateDate.add(new HexByteData(0, "0x02" , HexByteType.STX));
            getStateDate.add(new HexByteData(1, "0x06" , HexByteType.LEN_LO));
            getStateDate.add(new HexByteData(2, "0x00" , HexByteType.LEN_HI));
            getStateDate.add(new HexByteData(3, "0x02" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getStateDate);

            getStateDate.add(new HexByteData(4, highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getStateDate.add(new HexByteData(5, highLowByteOfSum.getKey() , HexByteType.CRC_HI));

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
            getStateDate.add(new HexByteData(0, "0x02" , HexByteType.STX));
            getStateDate.add(new HexByteData(1, "0x06" , HexByteType.LEN_LO));
            getStateDate.add(new HexByteData(2, "0x00" , HexByteType.LEN_HI));
            getStateDate.add(new HexByteData(3, "0x03" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getStateDate);

            getStateDate.add(new HexByteData(4, highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getStateDate.add(new HexByteData(5, highLowByteOfSum.getKey() , HexByteType.CRC_HI));

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
            getStateDate.add(new HexByteData(0, "0x02" , HexByteType.STX));
            getStateDate.add(new HexByteData(1, "0x06" , HexByteType.LEN_LO));
            getStateDate.add(new HexByteData(2, "0x00" , HexByteType.LEN_HI));
            getStateDate.add(new HexByteData(3, "0x04" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getStateDate);

            getStateDate.add(new HexByteData(4, highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getStateDate.add(new HexByteData(5, highLowByteOfSum.getKey() , HexByteType.CRC_HI));

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
            getValuesDate.add(new HexByteData(0, "0x02" , HexByteType.STX));
            getValuesDate.add(new HexByteData(1, "0x0A" , HexByteType.LEN_LO));
            getValuesDate.add(new HexByteData(2, "0x00" , HexByteType.LEN_HI));
            getValuesDate.add(new HexByteData(3, "0x05" , HexByteType.CMD));
            getValuesDate.add(new HexByteData(4, "0x00" , HexByteType.START_LO));
            getValuesDate.add(new HexByteData(5, "0x00" , HexByteType.START_HI));
            getValuesDate.add(new HexByteData(6, "0x00" , HexByteType.STOP_LO));
            getValuesDate.add(new HexByteData(7, "0x00" , HexByteType.STOP_HI));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getValuesDate);

            getValuesDate.add(new HexByteData(8, highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getValuesDate.add(new HexByteData(9, highLowByteOfSum.getKey() , HexByteType.CRC_HI));

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
            getConverterTypeDate.add(new HexByteData(0, "0x02" , HexByteType.STX));
            getConverterTypeDate.add(new HexByteData(1, "0x06" , HexByteType.LEN_LO));
            getConverterTypeDate.add(new HexByteData(2, "0x00" , HexByteType.LEN_HI));
            getConverterTypeDate.add(new HexByteData(3, "0x31" , HexByteType.CMD));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(getConverterTypeDate);

            getConverterTypeDate.add(new HexByteData(4, highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            getConverterTypeDate.add(new HexByteData(5, highLowByteOfSum.getKey() , HexByteType.CRC_HI));

            RequestToComPort getConverterTypeRequest = new RequestToComPort(RequestType.GET_CONVERTER_TYPE,getConverterTypeDate);
            System.out.println(getConverterTypeRequest);
            CommandService commandService =
                  new CommandService(
                        "COM2", 19200, 8,  1, 2);
            ResponseFromComPort responseFromComPort = commandService.sendCommand(getConverterTypeRequest);
            System.out.println(responseFromComPort);
      }

      private static void setDateTime() {
            List<HexByteData> setDateTimeDate = new ArrayList<>();
            setDateTimeDate.add(new HexByteData(0, "0x02" , HexByteType.STX));
            setDateTimeDate.add(new HexByteData(1, "0x0C" , HexByteType.LEN_LO));
            setDateTimeDate.add(new HexByteData(2, "0x00" , HexByteType.LEN_HI));
            setDateTimeDate.add(new HexByteData(3, "0x81" , HexByteType.CMD));
            setDateTimeDate.add(new HexByteData(4, "0x17" , HexByteType.DATE_YEAR));
            setDateTimeDate.add(new HexByteData(5, "0x05" , HexByteType.DATE_MONTH));
            setDateTimeDate.add(new HexByteData(6, "0x11" , HexByteType.DATE_DAY));
            setDateTimeDate.add(new HexByteData(7, "0x10" , HexByteType.TIME_HOUR));
            setDateTimeDate.add(new HexByteData(8, "0x11" , HexByteType.TIME_MINUTE));
            setDateTimeDate.add(new HexByteData(9, "0x0A" , HexByteType.TIME_SEC));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(setDateTimeDate);

            setDateTimeDate.add(new HexByteData(10, highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            setDateTimeDate.add(new HexByteData(11, highLowByteOfSum.getKey() , HexByteType.CRC_HI));

            RequestToComPort getConverterTypeRequest = new RequestToComPort(RequestType.SET_DATE_TIME,setDateTimeDate);
            System.out.println(getConverterTypeRequest);
            CommandService commandService =
                  new CommandService(
                        "COM2", 19200, 8,  1, 2);
            ResponseFromComPort responseFromComPort = commandService.sendCommand(getConverterTypeRequest);
            System.out.println(responseFromComPort);
      }

      /*

       */
      private static void setConverterType() {
            List<HexByteData> setConverterTypeData = new ArrayList<>();
            setConverterTypeData.add(new HexByteData(0, "0x02" , HexByteType.STX));
            setConverterTypeData.add(new HexByteData(1, "0x12" , HexByteType.LEN_LO));
            setConverterTypeData.add(new HexByteData(2, "0x00" , HexByteType.LEN_HI));
            setConverterTypeData.add(new HexByteData(3, "0xB1" , HexByteType.CMD));
            setConverterTypeData.add(new HexByteData(4, "0x02" , HexByteType.DEVICE_TYPE));
            setConverterTypeData.add(new HexByteData(5, "0x00" , HexByteType.SERIAL_ID_B0));
            setConverterTypeData.add(new HexByteData(6, "0x00" , HexByteType.SERIAL_ID_B1));
            setConverterTypeData.add(new HexByteData(7, "0x00" , HexByteType.SERIAL_ID_B2));
            setConverterTypeData.add(new HexByteData(8, "0x00" , HexByteType.SERIAL_ID_B3));
            setConverterTypeData.add(new HexByteData(9, "0x00" , HexByteType.SERIAL_ID_B4));
            setConverterTypeData.add(new HexByteData(10, "0x00" , HexByteType.SERIAL_ID_B5));
            setConverterTypeData.add(new HexByteData(11, "0x00" , HexByteType.SERIAL_ID_B6));
            setConverterTypeData.add(new HexByteData(12, "0x00" , HexByteType.SERIAL_ID_B7));
            setConverterTypeData.add(new HexByteData(13, "0x01" , HexByteType.HW_VERSION));
            setConverterTypeData.add(new HexByteData(14, "0x00" , HexByteType.SW_VERSION_LO));
            setConverterTypeData.add(new HexByteData(15, "0x00" , HexByteType.SW_VERSION_HI));

            ControlSumCRC16Service controlSumCRC16Service = new ControlSumCRC16Service();
            Pair<String, String> highLowByteOfSum = controlSumCRC16Service.getHighLowByteOfSum(setConverterTypeData);

            setConverterTypeData.add(new HexByteData(16, highLowByteOfSum.getValue() , HexByteType.CRC_LO));
            setConverterTypeData.add(new HexByteData(17, highLowByteOfSum.getKey() , HexByteType.CRC_HI));

            RequestToComPort getConverterTypeRequest = new RequestToComPort(RequestType.SET_CONVERTER_TYPE,setConverterTypeData);
            System.out.println(getConverterTypeRequest);
            CommandService commandService =
                  new CommandService(
                        "COM2", 19200, 8,  1, 2);
            ResponseFromComPort responseFromComPort = commandService.sendCommand(getConverterTypeRequest);
            System.out.println(responseFromComPort);
      }
}
