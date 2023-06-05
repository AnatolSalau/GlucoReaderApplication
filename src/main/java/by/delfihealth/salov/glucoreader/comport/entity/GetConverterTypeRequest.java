package by.delfihealth.salov.glucoreader.comport.entity;

import javafx.util.Pair;

import java.util.Map;

public class GetConverterTypeRequest extends ComPortData{
      public GetConverterTypeRequest(String code, Map<Integer, Pair<String, String>> data) {
            super(code, data);
      }
}
