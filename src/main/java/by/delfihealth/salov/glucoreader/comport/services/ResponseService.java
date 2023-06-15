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
                        return byteArrToGetState(data);
                  }
                  case GET_DATE_TIME -> {
                        return byteArrToGetDateTime( data);

                  }
                  case GET_VALUES -> {
                        return byteArrToGetValues( data);
                  }
                  case GET_CONVERTER_TYPE -> {
                        return byteArrToGetConverterType( data);
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
            HexByteData dataVersionLo = new HexByteData(data[4], HexByteType.VERSION_LOW);
            dataList.add(dataVersionLo);
            HexByteData dataVersionHi = new HexByteData(data[5], HexByteType.VERSION_HIGH);
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

      private ResponseFromComPort byteArrToGetState(byte[] data) {
            List<HexByteData> dataList = new ArrayList<>();

            HexByteData dataStx = new HexByteData(data[0], HexByteType.STX);
            dataList.add(dataStx);
            HexByteData dataLenLo = new HexByteData(data[1], HexByteType.LEN_LO);
            dataList.add(dataLenLo);
            HexByteData dataLenHi = new HexByteData(data[2], HexByteType.LEN_HI);
            dataList.add(dataLenHi);
            HexByteData dataCmd = new HexByteData(data[3], HexByteType.CMD);
            dataList.add(dataCmd);
            HexByteData dataErrorCode = new HexByteData(data[4], HexByteType.ERROR_CODE);
            dataList.add(dataErrorCode);
            HexByteData dataTemperatureHigh = new HexByteData(data[5], HexByteType.TE_HI);
            dataList.add(dataTemperatureHigh);
            HexByteData dataTemperatureLow = new HexByteData(data[6], HexByteType.TE_LO);
            dataList.add(dataTemperatureLow);
            HexByteData dataBattery = new HexByteData(data[7], HexByteType.BATTERY);
            dataList.add(dataBattery);
            HexByteData dataCrcLo = new HexByteData(data[8], HexByteType.CRC_LO);
            dataList.add(dataCrcLo);
            HexByteData dataCrcHi = new HexByteData(data[9], HexByteType.CRC_HI);
            dataList.add(dataCrcHi);

            ResponseFromComPort response = new ResponseFromComPort(
                  ResponseType.GET_STATE,
                  dataList);
            return response;
      }

      private ResponseFromComPort byteArrToGetDateTime(byte[] data) {
            List<HexByteData> dataList = new ArrayList<>();

            HexByteData dataStx = new HexByteData(data[0], HexByteType.STX);
            dataList.add(dataStx);
            HexByteData dataLenLo = new HexByteData(data[1], HexByteType.LEN_LO);
            dataList.add(dataLenLo);
            HexByteData dataLenHi = new HexByteData(data[2], HexByteType.LEN_HI);
            dataList.add(dataLenHi);
            HexByteData dataCmd = new HexByteData(data[3], HexByteType.CMD);
            dataList.add(dataCmd);
            HexByteData dataDateYear = new HexByteData(data[4], HexByteType.DATE_YEAR);
            dataList.add(dataDateYear);
            HexByteData dataDateMonth = new HexByteData(data[5], HexByteType.DATE_MONTH);
            dataList.add(dataDateMonth);
            HexByteData dataDateDay = new HexByteData(data[6], HexByteType.DATE_MONTH);
            dataList.add(dataDateDay);
            HexByteData dataTimeHour = new HexByteData(data[7], HexByteType.TIME_HOUR);
            dataList.add(dataTimeHour);
            HexByteData dataTimeMin = new HexByteData(data[8], HexByteType.TIME_MINUTE);
            dataList.add(dataTimeMin);
            HexByteData dataTimeSec = new HexByteData(data[9], HexByteType.TIME_SEC);
            dataList.add(dataTimeSec);

            HexByteData dataCrcLo = new HexByteData(data[10], HexByteType.CRC_LO);
            dataList.add(dataCrcLo);
            HexByteData dataCrcHi = new HexByteData(data[11], HexByteType.CRC_HI);
            dataList.add(dataCrcHi);

            ResponseFromComPort response = new ResponseFromComPort(
                  ResponseType.GET_DATE_TIME,
                  dataList);
            return response;
      }

      private ResponseFromComPort byteArrToGetValues(byte[] data) {
            List<HexByteData> dataList = new ArrayList<>();

            HexByteData dataStx = new HexByteData(data[0], HexByteType.STX);
            dataList.add(dataStx);
            HexByteData dataLenLo = new HexByteData(data[1], HexByteType.LEN_LO);
            dataList.add(dataLenLo);
            HexByteData dataLenHi = new HexByteData(data[2], HexByteType.LEN_HI);
            dataList.add(dataLenHi);
            HexByteData dataCmd = new HexByteData(data[3], HexByteType.CMD);
            dataList.add(dataCmd);
            HexByteData dataIndexLo = new HexByteData(data[4], HexByteType.INDEX_LO);
            dataList.add(dataIndexLo);
            HexByteData dataIndexHi = new HexByteData(data[5], HexByteType.INDEX_HI);
            dataList.add(dataIndexHi);
            HexByteData dataDateYear = new HexByteData(data[6], HexByteType.DATE_YEAR);
            dataList.add(dataDateYear);
            HexByteData dataDateMonth = new HexByteData(data[7], HexByteType.DATE_MONTH);
            dataList.add(dataDateMonth);
            HexByteData dataDateDay = new HexByteData(data[8], HexByteType.DATE_DAY);
            dataList.add(dataDateDay);
            HexByteData dataTimeHour = new HexByteData(data[9], HexByteType.TIME_HOUR);
            dataList.add(dataTimeHour);
            HexByteData dataTimeMinute = new HexByteData(data[10], HexByteType.TIME_MINUTE);
            dataList.add(dataTimeMinute);
            HexByteData dataTimeSec = new HexByteData(data[11], HexByteType.TIME_SEC);
            dataList.add(dataTimeSec);
            HexByteData dataGlucoseHi = new HexByteData(data[12], HexByteType.GLUCOSE_HI);
            dataList.add(dataGlucoseHi);
            HexByteData dataGlucoseLo = new HexByteData(data[13], HexByteType.GLUCOSE_LO);
            dataList.add(dataGlucoseLo);
            HexByteData dataTeHi = new HexByteData(data[14], HexByteType.TE_HI);
            dataList.add(dataTeHi);
            HexByteData dataTeLo = new HexByteData(data[15], HexByteType.TE_LO);
            dataList.add(dataTeLo);
            HexByteData dataHematocritHi = new HexByteData(data[15], HexByteType.HEMATOCRIT_HI);
            dataList.add(dataHematocritHi);
            HexByteData dataHematocritLo = new HexByteData(data[15], HexByteType.HEMATOCRIT_LO);
            dataList.add(dataHematocritLo);
            HexByteData dataState = new HexByteData(data[15], HexByteType.STATE);
            dataList.add(dataState);

            HexByteData dataCrcLo = new HexByteData(data[19], HexByteType.CRC_LO);
            dataList.add(dataCrcLo);
            HexByteData dataCrcHi = new HexByteData(data[20], HexByteType.CRC_HI);
            dataList.add(dataCrcHi);

            ResponseFromComPort response = new ResponseFromComPort(
                  ResponseType.GET_VALUES,
                  dataList);
            return response;
      }

      private ResponseFromComPort byteArrToGetConverterType(byte[] data) {
            List<HexByteData> dataList = new ArrayList<>();

            HexByteData dataStx = new HexByteData(data[0], HexByteType.STX);
            dataList.add(dataStx);
            HexByteData dataLenLo = new HexByteData(data[1], HexByteType.LEN_LO);
            dataList.add(dataLenLo);
            HexByteData dataLenHi = new HexByteData(data[2], HexByteType.LEN_HI);
            dataList.add(dataLenHi);
            HexByteData dataCmd = new HexByteData(data[3], HexByteType.CMD);
            dataList.add(dataCmd);

            HexByteData dataCrcLo = new HexByteData(data[16], HexByteType.CRC_LO);
            dataList.add(dataCrcLo);
            HexByteData dataCrcHi = new HexByteData(data[17], HexByteType.CRC_HI);
            dataList.add(dataCrcHi);

            ResponseFromComPort response = new ResponseFromComPort(
                  ResponseType.GET_CONVERTER_TYPE,
                  dataList);
            return response;
      }
}
