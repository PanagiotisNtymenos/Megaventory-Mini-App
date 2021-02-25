package API;

import model.*;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class APICalls {

    final private String APIKEY = "891ce16029d7e576@m117861";
    final private String BASE_URL = "https://api.megaventory.com/v2017a";

    public void addProduct(Product product) {

        String query = "/Product/ProductUpdate";
        try {
//            make url and headers for HTTP call
            URL url = new URL(BASE_URL + query);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("charset", "utf-8");
            conn.setRequestProperty("Accept", "application/json");

//            create POST body
            JSONObject body = product.toJSON();
            body.put("APIKEY", APIKEY);

//            make body length for POST call
            try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                wr.write(body.toString().getBytes(StandardCharsets.UTF_8));
            }

//            HTTP response code
            int status = conn.getResponseCode();

            System.out.println("Http status code: " + status);

//            API's response data
            StringBuffer data = readData(conn.getInputStream());

//            close connection
            conn.disconnect();

            try {
                JSONObject contentJSON = new JSONObject(data.toString());
                System.out.println(contentJSON);
            } catch (Exception e) {
                System.out.println(data);
            }
        } catch (Exception e) {
            System.err.println("Connection to the API failed successfully!");
        }
    }

    public void addClient(Client client) {

        String query = "/SupplierClient/SupplierClientUpdate";
        try {
//            make url and headers for HTTP call
            URL url = new URL(BASE_URL + query);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("charset", "utf-8");
            conn.setRequestProperty("Accept", "application/json");

//            create POST body
            JSONObject body = client.toJSON();
            body.put("APIKEY", APIKEY);

//            make body length for POST call
            try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                wr.write(body.toString().getBytes(StandardCharsets.UTF_8));
            }

//            HTTP response code
            int status = conn.getResponseCode();

            System.out.println("Http status code: " + status);

//            API's response data
            StringBuffer data = readData(conn.getInputStream());

//            close connection
            conn.disconnect();

            try {
                JSONObject contentJSON = new JSONObject(data.toString());
                System.out.println(contentJSON);
            } catch (Exception e) {
                System.out.println(data);
            }
        } catch (Exception e) {
            System.err.println("Connection to the API failed successfully!");
        }
    }

    public void addWarehouse(Warehouse warehouse) {

        String query = "/InventoryLocation/InventoryLocationUpdate";
        try {
//            make url and headers for HTTP call
            URL url = new URL(BASE_URL + query);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("charset", "utf-8");
            conn.setRequestProperty("Accept", "application/json");

//            create POST body
            JSONObject body = warehouse.toJSON();
            body.put("APIKEY", APIKEY);

//            make body length for POST call
            try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                wr.write(body.toString().getBytes(StandardCharsets.UTF_8));
            }

//            HTTP response code
            int status = conn.getResponseCode();

            System.out.println("Http status code: " + status);

//            API's response data
            StringBuffer data = readData(conn.getInputStream());

//            close connection
            conn.disconnect();

            try {
                JSONObject contentJSON = new JSONObject(data.toString());
                int id = Integer.parseInt((String) contentJSON.get("InventoryLocationID"));
                System.out.println();
                System.out.println(id);
            } catch (Exception e) {
//                System.out.println(data);
            }
        } catch (Exception e) {
            System.err.println("Connection to the API failed successfully!");
        }
    }

    public void addTax(Tax tax) {
        String query = "/Tax/TaxUpdate";
        try {
//            make url and headers for HTTP call
            URL url = new URL(BASE_URL + query);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("charset", "utf-8");
            conn.setRequestProperty("Accept", "application/json");

//            create POST body
            JSONObject body = tax.toJSON();
            body.put("APIKEY", APIKEY);

//            make body length for POST call
            try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                wr.write(body.toString().getBytes(StandardCharsets.UTF_8));
            }

//            HTTP response code
            int status = conn.getResponseCode();

            System.out.println("Http status code: " + status);

//            API's response data
            StringBuffer data = readData(conn.getInputStream());

//            close connection
            conn.disconnect();

            try {
                JSONObject contentJSON = new JSONObject(data.toString());

                System.out.println(contentJSON);

            } catch (Exception e) {
//                System.out.println(data);
            }
        } catch (Exception e) {
            System.err.println("Connection to the API failed successfully!");
        }
    }

    public void makeSale(Sale sale) {

        String query = "/InventoryLocation/InventoryLocationUpdate";
        try {
//            make url and headers for HTTP call
            URL url = new URL(BASE_URL + query);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("charset", "utf-8");
            conn.setRequestProperty("Accept", "application/json");

//            create POST body
            JSONObject body = sale.toJSON();
            body.put("APIKEY", APIKEY);

//            make body length for POST call
            try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                wr.write(body.toString().getBytes(StandardCharsets.UTF_8));
            }

//            HTTP response code
            int status = conn.getResponseCode();

            System.out.println("Http status code: " + status);

//            API's response data
            StringBuffer data = readData(conn.getInputStream());

//            close connection
            conn.disconnect();

            try {
                JSONObject contentJSON = new JSONObject(data.toString());
                System.out.println(contentJSON);
            } catch (Exception e) {
                System.out.println(data);
            }
        } catch (Exception e) {
            System.err.println("Connection to the API failed successfully!");
        }
    }

    private StringBuffer readData(InputStream inputStream) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            return content;
        } catch (Exception e) {
            return null;
        }

    }

}
