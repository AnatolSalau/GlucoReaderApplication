package by.delfihealth.salov.glucoreader.comport.enums;

public enum HexByteType {
      STX("Start of data packet"),
      LEN_LO("Packet length, low byte"),
      LEN_HI("Packet length, high byte"),
      CMD("Command code"),
      DATA("Something data"),
      DATA_VERSION_LOW("Version low"),
      DATA_VERSION_HIGH("Version high"),
      CRC_LO("Control sum, low byte"),
      CRC_HI("Control sum, high byte"),
      DEVICE_TYPE("Type of device"),
      SERIAL_ID("ID of device"),
      HW_VERSION("Hardware version"),
      SW_VERSION_LO("Software version, low byte"),
      SW_VERSION_HI("Software version, high byte");

      public final String textDescription;

      HexByteType(String textDescription) {
            this.textDescription = textDescription;
      }
}
