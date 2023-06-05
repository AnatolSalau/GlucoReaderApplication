package by.delfihealth.salov.glucoreader.comport.entity;

import javafx.util.Pair;

import java.util.Map;

public class GetConverterTypeResponse extends ComPortData {

      public GetConverterTypeResponse(String code, Map<Integer, Pair<String, String>> data) {
            super(code, data);
      }
}
