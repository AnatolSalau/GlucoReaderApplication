package by.delfihealth.salov.glucoreader.comport.entity;

import javafx.util.Pair;
import lombok.Data;

import java.util.Map;

@Data
public abstract class ComPortData {
      private final String hexCode;
      private final Map<Integer, Pair<String, String>> hexData;
}
