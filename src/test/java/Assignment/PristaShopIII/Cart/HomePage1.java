package Assignment.PristaShopIII.Cart;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HomePage1 {

    public HomePage1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//ul[@id='homefeatured']/li[2]/div/div/div/a/img")
     public WebElement blousePrdt;
    @FindBy(xpath="//button[@name='Submit']")
    public WebElement hoverOverCart;
    @FindBy(className="fancybox-iframe")
    public WebElement iframe;
    @FindBy(xpath = "//div[@class='button-container']/a")
    public WebElement proceedtocart;
    @FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a")
    public WebElement hoveroveronCart;
    @FindBy(xpath = "(//p[@class='product-name'])[2]")
    public WebElement cartDetails;
    @FindBy(xpath = "(//p[@class='cart_navigation clearfix']/a)[1]")
    public WebElement proceedToCheckOut;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "passwd")
    public WebElement password;
    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;


    public void Login(String email,String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        signInButton.click();

    }

    public void open(){
        Driver.getDriver().get("http://automationpractice.com/index.php");

    }
    @FindBy(xpath = "//div[@class='header_user_info']")
    public WebElement sigIn;
    @FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[2]")
    public WebElement backToHomePage;
    @FindBy(xpath = "(//div[@class='product-container'])[1]")
    public WebElement addPdt2;
   @FindBy(xpath = "//span[.='Add to cart']")
    public WebElement addPdt2ToCart;
@FindBy(xpath = "//div[@class='button-container']/a")
    public WebElement proceedToCheckOut2;
@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public WebElement hoverOverCart1;
@FindBy(xpath = "(//p[@class='product-name'])[2]")
public WebElement cartDetails2;
@FindBy(xpath = "//a[@class='logout']")
    public WebElement logout;
@FindBy(xpath = "//p[@class='alert alert-warning']")
public WebElement emptyMessage;



@FindBy(xpath = "//ul[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[1]")
public WebElement addanyPdt;
 @FindBy(xpath = "(//ul[@id='homefeatured']/li/div)[2]")
public WebElement hoveroverp2;
 @FindBy(xpath = "//div[@class='clearfix']/div[2]/div[4]/a/span/i")
 public WebElement proced;
@FindBy(xpath = "//a[@class='ajax_cart_block_remove_link']")
public WebElement xbutton;
@FindBy(xpath = "//div[@class='shopping_cart']/a/span[5]")
public WebElement emtymesage;

//CartCheckoutDeleteTest

@FindBy(xpath = "(//div[@class='product-container'])[4]")
  public WebElement hoverover1;
@FindBy(xpath = "(//div[@class='button-container'])[5]")
public WebElement addcartNew;
@FindBy(xpath = "//i[@class='icon-chevron-left left']")
public WebElement continueshopping;
@FindBy(xpath = "(//div[@class='product-container'])[6]")
public WebElement hoverOver2;
@FindBy(xpath = "(//a[@class='button ajax_add_to_cart_button btn btn-default'])[6]")
    public WebElement addCartNew2;
@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    public WebElement proceedtocheekout1;
@FindBy(xpath = "(//i[@class='icon-trash'])[1]")
    public WebElement delete1Pdt;
    @FindBy(xpath = "//td[@class='cart_delete text-center']/div/a")
    public WebElement delete1Pdt2;
  @FindBy(xpath = "//p[@class='alert alert-warning']")
    public WebElement emptymesge;





}
