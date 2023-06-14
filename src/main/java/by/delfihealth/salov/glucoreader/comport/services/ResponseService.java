package by.delfihealth.salov.glucoreader.comport.services;

import by.delfihealth.salov.glucoreader.comport.entities.HexByteData;
import by.delfihealth.salov.glucoreader.comport.entities.ResponseFromComPort;
import by.delfihealth.salov.glucoreader.comport.enums.HexByteType;
import by.delfihealth.salov.glucoreader.comport.enums.ResponseType;

import java.util.ArrayList;
import java.util.List;

public class ResponseService {
      public ResponseFromComPort convertByteArrToResponse(
            byte[] data,
            ResponseType responseType) {
            switch (responseType) {
                  case GET_PROTOCOL_VERSION -> {
                        return byteArrToGetProtocolVersion(data);
                  }
                  case GET_DEVICE_TYPE -> {
                        return byteArrToGetDeviceType(data);
                  }
                  case GET_STATE -> {
                        return null;
                  }
                  case GET_DATE_TIME -> {
                        return null;

                  }
                  case GET_VALUES -> {
                        return null;
                  }
                  case GET_CONVERTER_TYPE -> {
                        return null;
                  }
                  case SET_DATE_TIME -> {
                        return null;
                  }
                  case SET_CONVERTER_TYPE -> {
                        return null;
                  }
            }

            return null;
      }

      private ResponseFromComPort byteArrToGetProtocolVersion(byte[] data) {
            List<HexByteData> dataList = new ArrayList<>();

            HexByteData dataStx = new HexByteData(data[0], HexByteType.STX);
            dataList.add(dataStx);
            HexByteData dataLenLo = new HexByteData(data[1], HexByteType.LEN_LO);
            dataList.add(dataLenLo);
            HexByteData dataLenHi = new HexByteData(data[2], HexByteType.LEN_HI);
            dataList.add(dataLenHi);
            HexByteData dataCmd = new HexByteData(data[3], HexByteType.CMD);
            dataList.add(dataCmd);
            HexByteData dataVersionLo = new HexByteData(data[4], HexByteType.DATA_VERSION_LOW);
            dataList.add(dataVersionLo);
            HexByteData dataVersionHi = new HexByteData(data[5], HexByteType.DATA_VERSION_HIGH);
            dataList.add(dataVersionHi);
            HexByteData dataCrcLo = new HexByteData(data[6], HexByteType.CRC_LO);
            dataList.add(dataCrcLo);
            HexByteData dataCrcHi = new HexByteData(data[7], HexByteType.CRC_HI);
            dataList.add(dataCrcHi);

            ResponseFromComPort response = new ResponseFromComPort(
                  ResponseType.GET_PROTOCOL_VERSION,

                  dataList);
            return response;
      }

      private ResponseFromComPort byteArrToGetDeviceType(byte[] data) {
            List<HexByteData> dataList = new ArrayList<>();

            HexByteData dataStx = new HexByteData(data[0], HexByteType.STX);
            dataList.add(dataStx);
            HexByteData dataLenLo = new HexByteData(data[1], HexByteType.LEN_LO);
            dataList.add(dataLenLo);
            HexByteData dataLenHi = new HexByteData(data[2], HexByteType.LEN_HI);
            dataList.add(dataLenHi);
            HexByteData dataCmd = new HexByteData(data[3], HexByteType.CMD);
            dataList.add(dataCmd);
            HexByteData dataDeviceType = new HexByteData(data[4], HexByteType.DEVICE_TYPE);
            dataList.add(dataDeviceType);
            HexByteData dataSerialId1 = new HexByteData(data[5], HexByteType.SERIAL_ID_B0);
            dataList.add(dataSerialId1);
            HexByteData dataSerialId2 = new HexByteData(data[6], HexByteType.SERIAL_ID_B1);
            dataList.add(dataSerialId2);
            HexByteData dataSerialId3 = new HexByteData(data[7], HexByteType.SERIAL_ID_B2);
            dataList.add(dataSerialId3);
            HexByteData dataSerialId4 = new HexByteData(data[8], HexByteType.SERIAL_ID_B3);
            dataList.add(dataSerialId4);
            HexByteData dataSerialId5 = new HexByteData(data[9], HexByteType.SERIAL_ID_B4);
            dataList.add(dataSerialId5);
            HexByteData dataSerialId6 = new HexByteData(data[10], HexByteType.SERIAL_ID_B5);
            dataList.add(dataSerialId6);
            HexByteData dataSerialId7 = new HexByteData(data[11], HexByteType.SERIAL_ID_B6);
            dataList.add(dataSerialId7);
            HexByteData dataSerialId8 = new HexByteData(data[12], HexByteType.SERIAL_ID_B7);
            dataList.add(dataSerialId8);
            HexByteData dataHwVersion = new HexByteData(data[13], HexByteType.HW_VERSION);
            dataList.add(dataHwVersion);
            HexByteData dataSwVersionLowByte = new HexByteData(data[14], HexByteType.SW_VERSION_LO);
            dataList.add(dataSwVersionLowByte);
            HexByteData dataSwVersionHighByte = new HexByteData(data[15], HexByteType.SW_VERSION_HI);
            dataList.add(dataSwVersionHighByte);
            HexByteData dataCrcLo = new HexByteData(data[16], HexByteType.CRC_LO);
            dataList.add(dataCrcLo);
            HexByteData dataCrcHi = new HexByteData(data[17], HexByteType.CRC_HI);
            dataList.add(dataCrcHi);

            ResponseFromComPort response = new ResponseFromComPort(
                  ResponseType.GET_DEVICE_TYPE,
                  dataList);
            return response;
      }
}
