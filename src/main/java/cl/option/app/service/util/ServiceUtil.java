package cl.option.app.service.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

@Service
public class ServiceUtil {

    private final String apikeyEmail = "bdfb282af5a8c77002ad4d8e63bf25f0";
    private final String apiKeyNumber = "f248885fc7890bab1a3c37fd820e1df3";

    /**
     * Upper Case Name Persona
     * 
     * @param sentence
     * @return
     */
    public String upperCaseName(String name) {
        String words[] = name.replaceAll("\\s+", " ").trim().split(" ");
        String newSentence = "";
        for (String word : words) {
            for (int i = 0; i < word.length(); i++)
                newSentence = newSentence + ((i == 0) ? word.substring(i, i + 1).toUpperCase()
                        : (i != word.length() - 1) ? word.substring(i, i + 1).toLowerCase()
                                : word.substring(i, i + 1).toLowerCase().toLowerCase());
        }

        return newSentence;
    }
    /**
     * Le da formato a un rut, concatenándole puntos y guión.
     * 
     * @param rut Rut a formatear.
     * @return Un nuevo String, con el rut formateado.
     */
    public String formatRut(String rut) {
        int cont = 0;
        String format;
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        format = "-" + rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            format = rut.substring(i, i + 1) + format;
            cont++;
            if (cont == 3 && i != 0) {
                format = "." + format;
                cont = 0;
            }
        }
        return format;
    }

    /**
     * Valida un rut de acuerdo a su dígito verificador.
     * 
     * @param rut Rut a validar
     * @return true si el rut es válido, false en cualquier otro caso.
     */
    public boolean validar(String rut) {
        int suma = 0;
        String dvR, dvT;
        int[] serie = { 2, 3, 4, 5, 6, 7 };
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        dvR = rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            suma += Integer.valueOf(rut.substring(i, i + 1)) * serie[(rut.length() - 2 - i) % 6];
        }
        dvT = String.valueOf(11 - suma % 11);
        if (dvT.compareToIgnoreCase("10") == 0) {
            dvT = "K";
        }

        if (dvT.compareToIgnoreCase(dvR) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * check email service https://apilayer.net
     * 
     * @param email
     * @throws Exception
     */
    public void checkEmail(String email) throws Exception {

        String url = "https://apilayer.net/api/check?access_key=" + apikeyEmail + "&email=" + email
                + "&smtp=1&format=1";

        URL urlobj = new URL(url);

        HttpURLConnection con = (HttpURLConnection) urlobj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        // add request header
        con.setRequestProperty("User-Agent", "Mozilla/17.0");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // print result
        System.out.println(response.toString());

    }

    public void checkPhone(String phonenum) throws Exception {

        String url = "http://apilayer.net/api/validate?access_key=" + apiKeyNumber + "&number=" + phonenum;

        URL urlobj = new URL(url);

        HttpURLConnection con = (HttpURLConnection) urlobj.openConnection();

        con.setRequestMethod("GET");

        // add request header
        con.setRequestProperty("User-Agent", "Mozilla/17.0");

        int responseCode = con.getResponseCode();

        System.out.println("Sending GET req to URL: " + url);
        System.out.println("Response Code: " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        /*
         * JSONParser jsonParser = new JSONParser(); JSONObject jsonObject =
         * (JSONObject) jsonParser.parse(response.toString());
         */

        // String valid = (String) jsonObject.get("valid");
        /* number = (String) jsonObject.get("number"); */
        // String number = (String) jsonObject.get("number");
        /*
         * String countrycode = (String) jsonObject.get("country_code"); carrier =
         * (String) jsonObject.get("carrier");
         */
        // System.out.println("valid : " + valid);
        /*
         * System.out.println("number : " + number); System.out.println("countrycode : "
         * + countrycode); System.out.println("carrier : " + carrier);
         */
        // get an array from the JSON object
        // JSONArray lang= (JSONArray) jsonObject.get("languages");

        /* return conn; */
        // may want to return response object instead?
    }

}