package by.delfihealth.salov.glucoreader.comport.services;

import by.delfihealth.salov.glucoreader.comport.entities.HexByteData;
import javafx.util.Pair;
import lombok.AllArgsConstructor;

import java.util.List;


@AllArgsConstructor
public class ControlSumCRC16Service {
      /*
            How long have they been meeting with a therapist
            For a year and a half
       */
      public Pair<String, String> getHighLowByteOfSum(List<HexByteData> hexByteData) {
            CRC16 checksum = new CRC16();
            hexByteData
                  .stream()
                  .map(HexByteData::getByteValue)
                  .forEach(checksum::update);
            String crcLoHiHex = Integer.toHexString((int) checksum.getValue());
            String crcHiHex = "0x" + crcLoHiHex.substring(0, 2).toUpperCase();
            String crcLoHex = "0x" + crcLoHiHex.substring(2, 4).toUpperCase();
            checksum = null;
            return new Pair<>(crcHiHex, crcLoHex);
      }
}
