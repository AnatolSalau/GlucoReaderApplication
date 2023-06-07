package by.delfihealth.salov.glucoreader.comport.services;

import by.delfihealth.salov.glucoreader.comport.entities.HexByteData;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.zip.Checksum;

@AllArgsConstructor
public class ControlSumCRC16Service {


      public String getHighByteOfSum(List<HexByteData> hexByteData) {
            CRC16 checksum = new CRC16();
            hexByteData
                  .stream()
                  .map(HexByteData::getByteValue)
                  .forEach(checksum::update);
            String crcLoHiHex = Integer.toHexString((int) checksum.getValue());
            String crcHiHex = crcLoHiHex.substring(0, 2).toUpperCase();
            checksum = null;
            return crcHiHex;
      }
      public String getLowByteOfSum(List<HexByteData> hexByteData) {
            CRC16 checksum = new CRC16();
            hexByteData
                  .stream()
                  .map(HexByteData::getByteValue)
                  .forEach(checksum::update);
            String crcLoHiHex = Integer.toHexString((int) checksum.getValue());
            String crcLoHex = crcLoHiHex.substring(2, 4).toUpperCase();
            checksum = null;
            return crcLoHex;
      }
}
