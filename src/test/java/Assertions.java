import io.restassured.response.Response;
import org.jetbrains.annotations.NotNull;
import org.testng.Assert;

public class Assertions {
    public void DoluCevapDonenBasariliKontroller(@NotNull Response response, int ResponseCode) {
        try{
            Assert.assertNotNull(response.jsonPath().getJsonObject("msgs[0].msgId"));
            Assert.assertNotNull(response.jsonPath().getJsonObject("msgs[0].extID"));
            Assert.assertNotNull(response.jsonPath().getJsonObject("msgs[0].pushInstanceId"));
            Assert.assertNotNull(response.jsonPath().getJsonObject("msgs[0].title"));
            Assert.assertNotNull(response.jsonPath().getJsonObject("msgs[0].message"));
            //Assert.assertNotNull(response.jsonPath().getJsonObject("msgs[0].deeplink"));
            Assert.assertNotNull(response.jsonPath().getJsonObject("msgs[0].status"));
            Assert.assertNotNull(response.jsonPath().getJsonObject("msgs[0].sts"));
        } catch (Exception ignored){};
        Assert.assertEquals(response.getStatusCode(), ResponseCode);
    }
    public void BosCevapDonenBasariliKontroller(@NotNull Response response, int ResponseCode) {
        String responseString=response.asString();
        Assert.assertTrue((responseString.contains("msgs"))&&(responseString.contains("cnts")));
        Assert.assertEquals(response.getStatusCode(), ResponseCode);
    }
    public void FailAssertions(@NotNull Response response, String code, String error, int ResponseCode){
        Assert.assertEquals(response.jsonPath().getJsonObject("code").toString(),code);
        Assert.assertEquals(response.jsonPath().getJsonObject("error").toString(),error);
        Assert.assertEquals(response.getStatusCode(), ResponseCode);
    }
}