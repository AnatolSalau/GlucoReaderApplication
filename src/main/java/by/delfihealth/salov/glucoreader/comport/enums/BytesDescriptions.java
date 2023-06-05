package by.delfihealth.salov.glucoreader.comport.enums;

public enum BytesDescriptions {
      STX("fullDescription"),
      LEN_LO("fullDescription"),
      LEN_HI("fullDescription"),
      CMD("fullDescription"),
      CRC_LO("fullDescription"),
      CRC_HI("fullDescription");

      public final String fullDescription;

      BytesDescriptions(String fullDescription) {
            this.fullDescription = fullDescription;
      }
}
