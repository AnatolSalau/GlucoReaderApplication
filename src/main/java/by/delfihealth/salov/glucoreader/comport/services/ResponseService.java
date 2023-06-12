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
                        return null;
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
            HexByteData dataSerialId = new HexByteData(data[5], HexByteType.SERIAL_ID);
            dataList.add(dataSerialId);

            HexByteData dataCrcLo = new HexByteData(data[6], HexByteType.CRC_LO);
            dataList.add(dataCrcLo);
            HexByteData dataCrcHi = new HexByteData(data[7], HexByteType.CRC_HI);
            dataList.add(dataCrcHi);

            ResponseFromComPort response = new ResponseFromComPort(
                  ResponseType.GET_PROTOCOL_VERSION,

                  dataList);
            return response;
      }
}
