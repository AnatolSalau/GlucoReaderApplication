package by.delfihealth.salov.glucoreader.comport.enums;

public enum HexType {
      STX("Start of data packet"),
      LEN_LO("Packet length, low byte"),
      LEN_HI("Packet length, high byte"),
      CMD("Command code"),
      DATA("Something data"),
      DATA_VERSION_LOW("Version low"),
      DATA_VERSION_HIGH("Version high"),
      CRC_LO("Control sum, low byte"),
      CRC_HI("Control sum, high byte");

      public final String textDescription;

      HexType(String textDescription) {
            this.textDescription = textDescription;
      }
}
