## Inbox Service API Automation
environment : Test
* web service repo is: https://gitlab.viennalife.com.tr/aegon-common/emakin-service
* swagger test address https://service-test.viennalife.com.tr/common/emakin-service/swagger-ui.html#/
* swagger preprod address https://service-preprod.viennalife.com.tr/common/emakin-service/swagger-ui.html#/

# Tech Stack
* allure-report
* rest-assured
* testng
* Java

# how to Run test
* Gitlab CI pipeline ile service tag çıkıldığında test ortamında repodaki testler otomatik koşar
* Intellj ile run edilmek istenirse terminalden mvn clean test komutu yeterli
* TestCases cases classında 5. satırda ike crtl+shift+f10 ile tüm caseler run ediliebilir
* senaryoların yanındaki play ile de test run edilebilir.

# Test Cases
* Status2MessagesTest
* Status1MessagesTest
* Status3MessagesTest
* Status4MessagesTest
* Status5MessagesTest
* Status6MessagesTest
* Status7MessagesTest
* Status8MessagesTest
* Status9MessagesTest
* Status10MessagesTest
* Status11MessagesTest
* Status12MessagesTest
* Status13MessagesTest
* Status14MessagesTest
* Status15MessagesTest
* Status16MessagesTest
* extidZorunludurHatasıTest
* statusZorunludurHatasıTest
* exitveStatusZorunludurHatasıTest
* EndDateOlmadanBasarılıGonderimTest
* StartDateOlmadanBasariliGonderimTest