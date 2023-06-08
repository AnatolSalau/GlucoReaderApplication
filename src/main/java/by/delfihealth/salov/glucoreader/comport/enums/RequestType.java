package by.delfihealth.salov.glucoreader.comport.enums;

public enum RequestType {
      GET_PROTOCOL_VERSION(
            "0x01",
            "Request to read the exchange protocol version",
            6
      ),
      GET_DEVICE_TYPE(
            "0x02",
            "Request to read device type (glucometer), serial number, plate version, firmware version"
            ,6
      ),
      GET_STATE(
            "0x03",
            "Request to read device state - error code, temperature, battery level",
            6
      ),
      GET_DATE_TIME(
            "0x04",
            "Request to read date and time",
            6
      ),
      GET_VALUES(
            "0x05",
            "Request to read measurements from the archive",
            10
      ),
      GET_CONVERTER_TYPE(
            "0x31",
            "Request to read converter type, serial number, plate version, firmware version",
            6
      ),
      SET_DATE_TIME(
            "0x81",
            "Request to read date and time in device (glucometer)",
            12
      ),
      SET_CONVERTER_TYPE(
            "0xB1",
            "Request to read converter type, serial number, plate version, firmware version",
            18
      );

      public final String hexCode;

      public final String textDescription;

      public final int numberBytesInRequest;

      RequestType(String hexCode, String textDescription, int numberBytesInRequest) {
            this.hexCode = hexCode;
            this.textDescription = textDescription;
            this.numberBytesInRequest = numberBytesInRequest;
      }
}
