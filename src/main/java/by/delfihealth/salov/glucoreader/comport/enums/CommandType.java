package by.delfihealth.salov.glucoreader.comport.enums;

public enum CommandType {
      GET_PROTOCOL_VERSION(
            "0x01",
            "Reading the exchange protocol version"
      ),
      GET_DEVICE_TYPE(
            "0x02",
            "Reading device type (glucometer), serial number, plate version, firmware version"
      ),
      GET_STATE(
            "0x03",
            "Reading device state - error code, temperature, battery level"
      ),
      GET_DATE_TIME(
            "0x04",
            "Reading date and time"
      ),
      GET_VALUES(
            "0x05",
            "Reading measurements from the archive "
      ),
      GET_CONVERTER_TYPE(
            "0x31",
            "Reading converter type, serial number, plate version, firmware version"
      ),
      SET_DATE_TIME(
            "0x81",
            "Set date and time in device (glucometer)"
      ),
      SET_CONVERTER_TYPE(
            "0xB1",
            "Set converter type, serial number, plate version, firmware version"
      );

      public final String hexCode;

      public final String textDescription;

      CommandType(String hexCode, String textDescription) {
            this.hexCode = hexCode;
            this.textDescription = textDescription;
      }
}
