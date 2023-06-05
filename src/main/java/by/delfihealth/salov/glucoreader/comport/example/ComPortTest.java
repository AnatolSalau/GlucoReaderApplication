package by.delfihealth.salov.glucoreader.comport.example;

import java.util.Arrays;
import java.util.List;

public class ComPortTest {
      public static void main(String[] args) {
            ComPortService comPortService = new ComPortService();
/*            List<String> allSystemPortNames = comPortService.getAllSystemPortNames();
            System.out.println(allSystemPortNames);
            List<String> allSystemPortDescription = comPortService.getAllSystemPortDescription();
            System.out.println(allSystemPortDescription);
            List<String> allSystemPortDescriptiveNames = comPortService.getAllSystemPortDescriptiveNames();
            System.out.println(allSystemPortDescriptiveNames);

            System.out.println("__________________________________________________________________________ \n");
            System.out.println("GetProtocolVersion");
            String[] requestProtocolVersion = {"02","06","00","01","20","5D"};
            System.out.println("Request to port : " + Arrays.toString(requestProtocolVersion));
            String[] responseProtocolVersion = comPortService.getResponseFromPort("COM2", requestProtocolVersion, 8);
            System.out.println("Response from port : " + Arrays.toString(responseProtocolVersion));
            System.out.println("__________________________________________________________________________\n");

            System.out.println("__________________________________________________________________________ \n");
            System.out.println("GetDeviceType");
            String[] requestDeviceType = {"02","06","00","02","60","5C"};
            System.out.println("Request to port : " + Arrays.toString(requestDeviceType));
            String[] responseDeviceType = comPortService.getResponseFromPort("COM2", requestDeviceType, 17);
            System.out.println("Response from port : " + Arrays.toString(responseDeviceType));
            System.out.println("__________________________________________________________________________\n");

            System.out.println("__________________________________________________________________________ \n");
            System.out.println("GetState");
            String[] requestGetState = {"02","06","00","03","A1","9C"};
            System.out.println("Request to port : " + Arrays.toString(requestGetState));
            String[] responseGetState = comPortService.getResponseFromPort("COM2", requestGetState, 9);
            System.out.println("Response from port : " + Arrays.toString(responseGetState));
            System.out.println("__________________________________________________________________________\n");

            System.out.println("__________________________________________________________________________ \n");
            System.out.println("GetDateTime");
            String[] requestGetDateTime = {"02","06","00","04","E0","5E"};
            System.out.println("Request to port : " + Arrays.toString(requestGetDateTime));
            String[] responseGetDateTime = comPortService.getResponseFromPort("COM2", requestGetDateTime, 11);
            System.out.println("Response from port : " + Arrays.toString(responseGetDateTime));
            System.out.println("__________________________________________________________________________\n");*/

            System.out.println("__________________________________________________________________________ \n");
            System.out.println("GetValues");
/*            String[] requestGetValues = {"02","0A","00","05","00","00","00","00","A7","D2"};*/
/*            String[] requestGetValues = {"02","0A","00","05","00","00","01","00","A6","42"};*/
/*            String[] requestGetValues = {"02","0A","00","05","01","00","01","00","A7","BE"};*/
/*            String[] requestGetValues = {"02","0A","00","05","00","00","02","00","A6","B2"};*/
            String[] requestGetValues = {"02","0A","00","05","01","00","02","00","A7","4E"};
/*            String[] requestGetValues = {"02","0A","00","05","00","00","03","00","A7","22"};*/
/*            String[] requestGetValues = {"02","0A","00","05","00","00","04","00","A5","12"};*/

            System.out.println("Request to port : " + Arrays.toString(requestGetValues));
            String[] responseGetValues = comPortService.getResponseFromPort(
                  "COM2",
                  requestGetValues,
                  20);
            System.out.println("Response from port : " + Arrays.toString(responseGetValues));
            System.out.println("__________________________________________________________________________\n");
            System.out.println("__________________________________________________________________________ \n");
            System.out.println("GetConverterType");
            String[] requestGetConverterType = {"02","06","00","31","20","49"};
            System.out.println("Request to port : " + Arrays.toString(requestGetConverterType));
            String[] responseGetConverterType = comPortService.getResponseFromPort("COM2", requestGetConverterType, 17);
            System.out.println("Response from port : " + Arrays.toString(responseGetConverterType));
            System.out.println("__________________________________________________________________________\n");

            System.out.println("__________________________________________________________________________ \n");
            System.out.println("SetDateTime");
            String[] requestSetDateTime = {"02","0C","00","81","17","05","11","10","11","0A","52","4C"};
            System.out.println("Request to port : " + Arrays.toString(requestSetDateTime));
            String[] responseSetDateTime = comPortService.getResponseFromPort("COM2", requestSetDateTime, 6);
            System.out.println("Response from port : " + Arrays.toString(responseSetDateTime));
            System.out.println("__________________________________________________________________________\n");

            System.out.println("__________________________________________________________________________ \n");
            System.out.println("SetConverterType");
            String[] requestSetConverterType = {"02","12","00","B1","01","07","03","04","05","00","00","00","00","05","00","01","25","AA"};
            System.out.println("Request to port : " + Arrays.toString(requestSetConverterType));
            String[] responseSetConverterType = comPortService.getResponseFromPort("COM2", requestSetConverterType, 6);
            System.out.println("Response from port : " + Arrays.toString(responseSetConverterType));
            System.out.println("__________________________________________________________________________\n");
      }
}
