package dab;

/**
 * @author Bryan de Ridder
 * @version 1.0 01/11/2016 22:02
 */
public class DemoRadio {
    public static void main(String[] args) {
        String response;
        DAB_Radio radio = new DAB_Radio();
        response = radio.getResponse();
        System.out.println(response);
        radio.aan();
        response = radio.getResponse();
        System.out.println(response);
        radio.setZender(10);
        response = radio.getResponse();
        System.out.println(response);
        radio.setZender(0);
        response = radio.getResponse();
        System.out.println(response);
        radio.setZender(5);
        response = radio.getResponse();
        System.out.println(response);
        radio.uit();
        System.out.println("De radio is "
                + (radio.getStatus() ? "aan" : "uit"));
    }
}