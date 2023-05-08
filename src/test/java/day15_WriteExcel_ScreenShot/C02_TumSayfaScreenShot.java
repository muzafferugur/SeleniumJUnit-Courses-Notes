package day15_WriteExcel_ScreenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_TumSayfaScreenShot extends TestBase {
    /*

     ***Get Screen Shot***Tüm Sayfa

    Selenium 3 ile tüm sayfanın fotoğrafını alabiliyorduk, Selenium 4 ile gelen güzel özelliklerden
    bir tanesi de istediğimiz web elementin fotoğrafını almamıza imkan tanımasıdır.

    ı.adım: Bir TakeScreenshot objesi oluşturup driverimizi TakeScreenshot'a cast yapalım.

    TakesScreenshot ts=(TakesScreenshot) driver;

    ıı.adım: Kaydettiğimiz ekran görüntüsünü projede istediğimiz yere kaydedeebilmek için
    path ile yeni bir File oluşturalım.

    File tumResim=new File("target/ekranResmi/tumSayfa");

    ııı.adım: TakeScreenshot objesini kullanarak getScreenshotAs() methodunu çalıştıralım ve gelen resmi
    geçici bir file'a assign edelim.

    File resimGecici=ts.getScreenshotAs(OutputType.FILE);

    ıv.adım: Kaydettiğimiz görüntüyü, saklamak istediğimiz dosyaya kopyalayalım.

            FileUtils.copyFile(resimGecici,tumResim);

     */


    //amazon sayfasına gidip tüm sayfanın fotoğrafını çekelim

    @Test
    public void tumSayfa() throws IOException {

        driver.get("https://www.amazon.com");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File tumSayfaResim = new File("target/ekranGoruntuleri/tumSayfa.jpeg");

        File geciciDosya = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(geciciDosya, tumSayfaResim);

    }
}
