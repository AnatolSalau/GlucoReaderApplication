package by.delfihealth.salov.glucoreader.comport.enums;

public enum ResponseType {
      GET_PROTOCOL_VERSION(
            "0x01",
            "Response to read the exchange protocol version",
            8
      ),
      GET_DEVICE_TYPE(
            "0x02",
            "Response to read device type (glucometer), serial number, plate version, firmware version"
            ,18
      ),
      GET_STATE(
            "0x03",
            "Response to read device state - error code, temperature, battery level",
            10
      ),
      GET_DATE_TIME(
            "0x04",
            "Response to read date and time",
            12
      ),
      GET_VALUES(
            "0x05",
            "Response to read measurements from the archive",
            1023
      ),
      GET_CONVERTER_TYPE(
            "0x31",
            "Response to read converter type, serial number, plate version, firmware version",
            18
      ),
      SET_DATE_TIME(
            "0x81",
            "Response to read date and time in device (glucometer)",
            7
      ),
      SET_CONVERTER_TYPE(
            "0xB1",
            "Response to read converter type, serial number, plate version, firmware version",
            7
      );

      public final String hexCode;

      public final String textDescription;

      public final int numberBytesInResponse;

      ResponseType(String hexCode, String textDescription, int numberBytesInResponse) {
            this.hexCode = hexCode;
            this.textDescription = textDescription;
            this.numberBytesInResponse = numberBytesInResponse;
      }
}
