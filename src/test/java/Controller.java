import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;

import static io.restassured.RestAssured.given;
public class Controller {
    Constants cons = new Constants();    Assertions assertions= new Assertions();
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Controller.class);
    public void BaseConfig(){
        RestAssured.config = RestAssuredConfig.config().httpClient(HttpClientConfig.httpClientConfig()
                .setParam("http.connection.timeout", 5000) // Connection timeout in milliseconds
                .setParam("http.socket.timeout", 5000) // Socket timeout in milliseconds
                .setParam("http.connection-manager.timeout", 5000)); // Connection request timeout in milliseconds
    }
    public void BasariliDoluFetch(String requestBody, int ResponseCode) {
        BaseConfig();
        String RequestPath=cons.requestPath+"getAllInbox";
        logger.info("RequestPath "+RequestPath);
        /*Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("extid", extid);
        requestBody.put("startDate",startDate);
        requestBody.put("endDate", endDate);
        requestBody.put("status", status);*/
        Response response = given().header("X-netmera-api-key",cons.netmeraApiKey).contentType(ContentType.JSON).when().body(requestBody).post(RequestPath);
        logger.info("Response: "+response.asString());
        assertions.DoluCevapDonenBasariliKontroller(response,ResponseCode);
    }
    public void BasariliBosFetch(String requestBody, int ResponseCode) {
        BaseConfig();
        String RequestPath=cons.requestPath+"getAllInbox";
        logger.info("RequestPath "+RequestPath);
        Response response = given().header("X-netmera-api-key",cons.netmeraApiKey).contentType(ContentType.JSON).when().body(requestBody).post(RequestPath);
        logger.info("Response: "+response.asString());
        assertions.BosCevapDonenBasariliKontroller(response,ResponseCode);
    }
    public void FailFetch(String requestBody,String code, String error, int ResponseCode) {
        BaseConfig();
        String RequestPath=cons.requestPath+"getAllInbox";
        logger.info("RequestPath "+RequestPath);
        Response response = given().header("X-netmera-api-key",cons.netmeraApiKey).contentType(ContentType.JSON).when().body(requestBody).post(RequestPath);
        logger.info("Response: "+response.asString());
        assertions.FailAssertions(response,code,error,ResponseCode);
    }

}