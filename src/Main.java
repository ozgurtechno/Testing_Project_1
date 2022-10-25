import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class Main extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.get("https://www.akakce.com/");

        //sayfa açılıyormu
        WebElement anasayfa=driver.findElement(By.cssSelector("div[class='g-4_v8']>a"));
        Assert.assertEquals("Akakce.com",anasayfa.getText());
        Bekle(1);

        //hesap açma
        WebElement hesapaç= driver.findElement(By.cssSelector("div[id='H_rl_v8'] a:first-child"));
        hesapaç.click();
        Bekle(1);

        WebElement name=driver.findElement(By.cssSelector("form input[name='rnufn']"));
        name.sendKeys("bahriye");
        WebElement lastname= driver.findElement(By.cssSelector("span>[name='rnufs']"));
        lastname.sendKeys("hankulu");
        WebElement eposta= driver.findElement(By.cssSelector("form[id='FrmRnuS']>span:nth-of-type(3)>input"));
        eposta.sendKeys("technostudy16@gmail.com");
        WebElement epostatekrar= driver.findElement(By.cssSelector("form[id='FrmRnuS']>span:nth-of-type(4)>input"));
        epostatekrar.sendKeys("technostudy16@gmail.com");
        WebElement sifre=driver.findElement(By.cssSelector("label[for='rnufp1']+span>input"));
        sifre.sendKeys("123456Bh5");
        WebElement sifreTekrar =driver.findElement(By.cssSelector("label[for='rnufp2']+span>input"));
        sifreTekrar.sendKeys("123456Bh5");
        WebElement cinsiyet= driver.findElement(By.cssSelector("span[class='radio_v8']>:nth-child(1)"));
        cinsiyet.click();
        WebElement il=driver.findElement(By.cssSelector("label[for='locpr']+select"));
        il.click();
        WebElement ilseç= driver.findElement(By.cssSelector("select[name='locpr']>:nth-child(16)"));
        ilseç.click();
        WebElement ilçe= driver.findElement(By.cssSelector("label[for='locds']+select"));
        ilçe.click();
        WebElement ilçeseç= driver.findElement(By.cssSelector("select[name='locds']>:nth-child(14)"));
        ilçeseç.click();
        WebElement dogumGün= driver.findElement(By.cssSelector("span[class='frm_v8 inl_v8']>select[name='bd']"));
        dogumGün.click();
        WebElement dogumGünSeç=driver.findElement(By.cssSelector("select[name='bd']>:nth-child(15)"));
        dogumGünSeç.click();
        WebElement dogumAy=driver.findElement(By.cssSelector("span[class='frm_v8 inl_v8']+span>select[name='bm']"));
        dogumAy.click();
        WebElement dogumAySeç =driver.findElement(By.cssSelector("select[name='bm']>:nth-child(3)"));
        dogumAySeç.click();
        WebElement dogumYıl=driver.findElement(By.cssSelector("span[class='frm_v8 inl_v8']+span+span>select[name='by']"));
        dogumYıl.click();
        WebElement dogumYılSeç=driver.findElement(By.cssSelector("select[name='by']>:nth-child(13)"));
        dogumYılSeç.click();
        WebElement sözleşme=driver.findElement(By.cssSelector("[name='rnufpca']"));
        sözleşme.click();
        WebElement hesapAç=driver.findElement(By.cssSelector("[type='submit'][value='Hesap aç']"));
        hesapAç.click();
        Bekle(1);

        //hesap dogrulama
        WebElement hesapdogrulama=driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        Assert.assertEquals("Bahriye",hesapdogrulama.getText());
        Bekle(1);

        //hesabıma giriş
        WebElement profil =driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        profil.click();
        Bekle(1);


        //sipariş listesi kontrol
        WebElement Sparislerim =driver.findElement(By.cssSelector("li[class='order first']>b+a"));
        Sparislerim.click();
        Bekle(1);

        WebElement mesaj=driver.findElement(By.cssSelector("[class='no-record']"));
        Assert.assertEquals("Kayıtlı siparişiniz bulunmuyor.", mesaj.getText());
        Bekle(1);

        //ana sayfa don
        WebElement anasayfa1=driver.findElement(By.cssSelector("span[itemprop='name']"));
        anasayfa1.click();
        Bekle(1);

        //profile tekrar gir
        WebElement profil2 =driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        profil2.click();
        Bekle(1);

        WebElement mesajlarım =driver.findElement(By.cssSelector("li[class='order first']>b+a+a"));
        mesajlarım.click();
        Bekle(1);

        WebElement mesajkutusukontrl=driver.findElement(By.cssSelector("div[class='wbb_v8']>p"));
        Assert.assertEquals("Listelenecek mesaj bulunamadı.",mesajkutusukontrl.getText());
        Bekle(1);

        //ana sayfaya tekrar dön
        WebElement anasayfadön=driver.findElement(By.cssSelector("[itemprop='item'][title='akakce.com ana sayfa']"));
        anasayfadön.click();
        Bekle(1);

        //işlem bitti hesabı sil
        WebElement profıleGir=driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        profıleGir.click();
        Bekle(1);
        WebElement hesapSil=driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        hesapSil.click();

        WebElement sifregir=driver.findElement(By.cssSelector("[type='password']"));
        sifregir.sendKeys("123456Bh5");
        Bekle(1);

        WebElement hesabımısil=driver.findElement(By.cssSelector("[type='submit']"));
        hesabımısil.click();

        BekleKapat();

    }
}
