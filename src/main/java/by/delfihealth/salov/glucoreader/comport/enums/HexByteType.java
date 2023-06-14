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
      SERIAL_ID_B0("ID of device, byte № 0"),
      SERIAL_ID_B1("ID of device, byte № 1"),
      SERIAL_ID_B2("ID of device, byte № 2"),
      SERIAL_ID_B3("ID of device, byte № 3"),
      SERIAL_ID_B4("ID of device, byte № 4"),
      SERIAL_ID_B5("ID of device, byte № 5"),
      SERIAL_ID_B6("ID of device, byte № 6"),
      SERIAL_ID_B7("ID of device, byte № 7"),
      HW_VERSION("Hardware version"),
      SW_VERSION_LO("Software version, low byte"),
      SW_VERSION_HI("Software version, high byte"),
      ERROR_CODE("Error code"),
      TE_LO("Temperature, low byte"),
      TE_HI("Temperature, high byte"),
      BATTERY("Battery level")
      ;

      public final String textDescription;

      HexByteType(String textDescription) {
            this.textDescription = textDescription;
      }
}
