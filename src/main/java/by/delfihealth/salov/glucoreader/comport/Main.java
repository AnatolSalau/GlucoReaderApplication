package by.delfihealth.salov.glucoreader.comport;

import java.util.List;

public class Main {
      public static void main(String[] args) {
            ComPortService comPortService = new ComPortService();
            List<String> allSystemPortNames = comPortService.getAllSystemPortNames();
            System.out.println(allSystemPortNames);

            List<String> allSystemPortDescription = comPortService.getAllSystemPortDescription();
            System.out.println(allSystemPortDescription);

            List<String> allSystemPortDescriptiveNames = comPortService.getAllSystemPortDescriptiveNames();
            System.out.println(allSystemPortDescriptiveNames);

            comPortService.sendData();
      }
}
