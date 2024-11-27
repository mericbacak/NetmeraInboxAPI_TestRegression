import io.qameta.allure.Description;import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;

@Story("InboxAPI_TestRegression") @Epic("0.0.1") @Owner("meric.bacak") @Tag("TestRegression")
public class TestCases {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(TestCases.class);
    Controller controller =new Controller();    Constants cons=new Constants();

    @Test(priority = 1)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 2 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status2MessagesTest() {
        logger.info("Status2MessagesTest Started");
        controller.BasariliDoluFetch(cons.RequestBody1, 200);
        logger.info("Status2MessagesTest Finished");
    }
    @Test(priority = 2)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 1 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status1MessagesTest() {
        logger.info("Status1MessagesTest Started");
        controller.BasariliBosFetch(cons.RequestBody2, 200);
        logger.info("Status1MessagesTest Finished");
    }
    @Test(priority = 3)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 3 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status3MessagesTest() {
        logger.info("ReadMesajlariGetirTest Started");
        controller.BasariliDoluFetch(cons.RequestBody3, 200);
        logger.info("Status3MessagesTest Finished");
    }
    @Test(priority = 4)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 4 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status4MessagesTest() {
        logger.info("Status4MessagesTest Started");
        controller.BasariliBosFetch(cons.RequestBody4, 200);
        logger.info("Status4MessagesTest Finished");
    }

    @Test(priority = 5)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 5 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status5MessagesTest() {
        logger.info("Status5MessagesTest Started");
        controller.BasariliBosFetch(cons.RequestBody5, 200);
        logger.info("Status5MessagesTest Finished");
    }
    @Test(priority = 6)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 6 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status6MessagesTest() {
        logger.info("Status6MessagesTest Started");
        controller.BasariliDoluFetch(cons.RequestBody6, 200);
        logger.info("Status6MessagesTest Finished");
    }
    @Test(priority = 7)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 7 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status7MessagesTest() {
        logger.info("Status7MessagesTest Started");
        controller.BasariliDoluFetch(cons.RequestBody7, 200);
        logger.info("Status7MessagesTest Finished");
    }
    @Test(priority = 8)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 8 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status8MessagesTest() {
        logger.info("Status8MessagesTest Started");
        controller.BasariliBosFetch(cons.RequestBody8, 200);
        logger.info("Status8MessagesTest Finished");
    }
    @Test(priority = 9)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 9 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status9MessagesTest() {
        logger.info("Status9MessagesTest Started");
        controller.BasariliBosFetch(cons.RequestBody9, 200);
        logger.info("Status9MessagesTest Finished");
    }
    @Test(priority = 10)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 10 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status10MessagesTest() {
        logger.info("Status10MessagesTest Started");
        controller.BasariliDoluFetch(cons.RequestBody10, 200);
        logger.info("Status10MessagesTest Finished");
    }
    @Test(priority = 11)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 11 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status11MessagesTest() {
        logger.info("Status11MessagesTest Started");
        controller.BasariliDoluFetch(cons.RequestBody11, 200);
        logger.info("Status11MessagesTest Finished");
    }
    @Test(priority = 12)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 12 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status12MessagesTest() {
        logger.info("Status12MessagesTest Started");
        controller.BasariliBosFetch(cons.RequestBody12, 200);
        logger.info("Status12MessagesTest Finished");
    }
    @Test(priority = 13)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 13 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status13MessagesTest() {
        logger.info("Status13MessagesTest Started");
        controller.BasariliBosFetch(cons.RequestBody13, 200);
        logger.info("Status13MessagesTest Finished");
    }
    @Test(priority = 14)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid ve status 14 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status14MessagesTest() {
        logger.info("Status14MessagesTest Started");
        controller.BasariliDoluFetch(cons.RequestBody14, 200);
        logger.info("Status14MessagesTest Finished");
    }
    @Test(priority = 15)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna nuat3 extid , status 15 ile istek atılır." +
            "response body kontrol edilir, ext id ait ilgili statudeki mesajlar gelmeli. Yapılan controller msg array altındaki objelerin zorunlu olanları null gelmediğini teyit etmek")
    public void Status15MessagesTest() {
        logger.info("Status15MessagesTest Started");
        controller.BasariliDoluFetch(cons.RequestBody15, 200);
        logger.info("Status15MessagesTest Finished");
    }
    @Test(priority = 16)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna extid nuat, status 16 ile istek atılır." +
            "response body kontrol edilir, MsgInboxStatus should be matched with the specified code hatası ve 2001 code değerleri görüntülenmeli")
    public void Status16MessagesTest() {
        logger.info("Status16MessagesTest Started");
        controller.FailFetch(cons.RequestBody16, "2001","MsgInboxStatus should be matched with the specified code",400);
        logger.info("Status16MessagesTest Finished");
    }
    @Test(priority = 17)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna extid olmadan istek atılır." +
            "response body kontrol edilir, extId is required hatası ve 2020 code değerleri görüntülenmeli")
    public void extidZorunludurHatasıTest() {
        logger.info("extidZorunludurHatasıTest Started");
        controller.FailFetch(cons.RequestBody17, "2020","extId is required",400);
        logger.info("extidZorunludurHatasıTest Finished");
    }
    @Test(priority = 18)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna status olmadan istek atılır." +
            "response body kontrol edilir, status is required hatası ve 2020 code değerleri görüntülenmeli")
    public void statusZorunludurHatasıTest() {
        logger.info("statusZorunludurHatasıTest Started");
        controller.FailFetch(cons.RequestBody18, "2020","status is required",400);
        logger.info("statusZorunludurHatasıTest Finished");
    }
    @Test(priority = 19)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna extid ve status olmadan istek atılır." +
            "response body kontrol edilir, extid is required hatası ve 2020 code değerleri görüntülenmeli")
    public void exitveStatusZorunludurHatasıTest() {
        logger.info("exitveStatusZorunludurHatasıTest Started");
        controller.FailFetch(cons.RequestBody19, "2020","extId is required",400);
        logger.info("exitveStatusZorunludurHatasıTest Finished");
    }
    @Test(priority = 20)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna extid nuat, status 15 endDate olmadan istek atılır." +
            "response body kontrol edilir, status15'de inbox kaydı oldğunu için zorunlu alanların null olmadığını kotnrol edilir.")
    public void EndDateOlmadanBasarılıGonderimTest() {
        logger.info("exitveStatusZorunludurHatasıTest Started");
        controller.BasariliDoluFetch(cons.RequestBody20, 200);
        logger.info("EndDateOlmadanBasarılıGonderimTest Finished");
    }
    @Test(priority = 21)
    @Description("https://rest-cloud-uat.sdpaas.com/rest/3.0/inbox/getAllInbox ucuna extid nuat, status 15 startDate olmadan istek atılır." +
            "response body kontrol edilir, status15'de inbox kaydı oldğunu için zorunlu alanların null olmadığını kotnrol edilir.")
    public void StartDateOlmadanBasariliGonderimTest() {
        logger.info("StartDateOlmadanBasariliGonderimTest Started");
        controller.BasariliDoluFetch(cons.RequestBody21, 200);
        logger.info("StartDateOlmadanBasariliGonderimTest Finished");
    }
}