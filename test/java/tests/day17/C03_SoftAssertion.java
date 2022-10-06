package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_SoftAssertion extends TestBaseBeforeMethodAfterMethod {
    /*
       SoftAssert başlangıç ve bitiş satırları arasındaki tüm assertion'ları yapıp
       bitiş olarak belirtmemiz gereken assertAll() metoduyla test metodumuzdaki bütün assertion'ları
       kontrol eder. Failed olan olursa assertion yaptığımız metodun sonuna yazdığımız mesajı bize
       konsolda verir
        */
    @Test
    public void test01() {
        SoftAssert softAssert=new SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon123"),"kelimeyi içermiyor");
        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"web elente erişilemez");
        //4-arama kutusuna Nuella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed(),"sonuç web elementi görüntülenemedi");
        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(sonuc.getText().contains("Nutella123"),"nutella yok");
        softAssert.assertAll();//burada bter. Sonraki adımlara gitmez ve çalıştırmaz.Eğer fail ise
        System.out.println("Hata varsa burası çalışmaz");
    }
}

