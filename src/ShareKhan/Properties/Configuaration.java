package ShareKhan.Properties;

public class Configuaration {
	//This Is an Page Object
public static final String testsite="http://old.sharekhan.com/welcome/default.html";


//xpaths

//Sharekhan page Launch
public static final String popupclose=".//*[@id='divBanner']/div/div/span";
public static final String popupimage=".//*[@id='divBanner']/div/div/div[1]/div/table/tbody/tr/td/a/img";
public static final String ShareKhanLogo =".//*[@id='ctl00']/div[3]/table/tbody/tr[1]/td/div/div[1]/a/img";
public static final String VisitHomePage =".//*[@id='ctl00']/div[3]/table/tbody/tr[3]/td/div/div[1]";
public static final String TradeNow =".//*[@id='ctl00']/div[3]/table/tbody/tr[3]/td/div/div[2]";
public static final String OpenAccount=".//*[@id='ctl00']/div[3]/table/tbody/tr[3]/td/div/div[3]";
public static final String Help=".//*[@id='ctl00']/div[3]/table/tbody/tr[3]/td/div/div[4]";
public static final String Gallary=".//*[@id='ctl00']/div[3]/table/tbody/tr[3]/td/div/div[5]";

//VisitHomePage verification

public static final String TradeNowHomePage =".//*[@id='tdTradeNow']";
public static final String ContactUsHomePage =".//*[@id='ctl00_TopBetaMenu1_divTopMenu']/a[5]";



// sharekhan Login page
//public static final String LogIn_id ="html>body>form>table>tbody>tr>td>input"; 
public static final String LogIn_id ="html/body/form/table/tbody/tr[1]/td[2]/input";
public static final String Mpin ="html/body/form/table/tbody/tr[2]/td[2]/input";
public static final String Tpin ="html/body/form/table/tbody/tr[3]/td[2]/input";
public static final String signin ="html/body/form/table/tbody/tr[5]/td[2]/input";
public static final String LogInButton =".//*[@id='ctl00_TopBetaMenu1_divTopMenu']/a[1]/span";
public static final String Equity=".//*[@id='div_1']/h1[1]/a";
public static final String Derivative=".//*[@id='div_2']";
public static final String Mutual_Fund=".//*[@id='div_7']";
public static final String currency=".//*[@id='div_4']";
public static final String IPO=".//*[@id='div_6']";
public static final String Go_To="html/body/form/table/tbody/tr[4]/td[2]/select";
public static final String Profile=".//*[@id='nameTags']/div[1]/span[1]";
public static final String moduleSection="html/body/div[3]/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[2]/div/div[1]";

public static final String ActiveMember =".//*[@id='name']";
public static final String Webtable ="html/body/div[3]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/div[1]";
public static final String logid="Shonna143";
public static final String MPIN="143";


public static final String ExchangeField =".//*[@id='exchangecode']";
public static final String ScripField =".//*[@id='scrip']";
public static final String BUYorSELL_Field =".//*[@id='buysell']";
public static final String ValidityField =".//*[@id='validity']";
public static final String OrderQuantityField =".//*[@id='quantity']";
public static final String Cancel=".//*[@id='orderconfirclosXY']";
public static final String limitPriceField =".//*[@id='price']";
public static final String limitPriceRadio =".//*[@id='hidetr1']/td[1]";
public static final String PlaceNewOrder=".//*[@id='placeOrderbutton']";

public static final String MoveFunds ="html/body/div[3]/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[1]/div/div[1]/ul/li[3]/a";		
public static final String TransferMoneyAmount="html/body/div[1]/table/tbody/tr[2]/td/form/table/tbody/tr[1]/td[2]/div/table/tbody/tr[2]/td[2]/input";
public static final String FromBank=".//*[@id='frombank']";
public static final String ToBank=".//*[@id='tobank']";
public static final String TransferFundButton="html/body/div[1]/table/tbody/tr[2]/td/form/table/tbody/tr[1]/td[2]/div/table/tbody/tr[6]/td[2]/input";
public static final String ErrorMsg=".//*[@id='tobank']";


public static final String ViewReport="html/body/div[3]/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[1]/div/div[1]/ul/li[4]/a";
public static final String OrderReport="html/body/center/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/div[1]/ul/li[1]/a";
public static final String SelectTypeOfReport="html/body/div[1]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/span/select";
public static final String LimitStatementTableRow="html/body/div[1]/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr";
public static final String LimitStatementTableColumn="html/body/div[1]/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/th";
public static final String Home="html/body/div[3]/table/tbody/tr[1]/td/div[2]/table/tbody/tr/td/a[1]";


public static final String ProfileMenu ="html/body/div[3]/table/tbody/tr[1]/td/div[2]/table/tbody/tr/td/a[3]";
public static final String ViewProfile ="html/body/div[1]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/div[1]/ul/li[1]/a";
public static final String MainMenu ="html/body/div[3]/table/tbody/tr[1]/td/div[2]";
public static final String EditProfile="html/body/center/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/div[1]/ul/li[2]/a";
public static final String SwitchToOldSite="html/body/div[1]/div/div/div[2]/div/div[1]/div/a";
public static final String LogInIDOLd=".//*[@id='loginid']";
public static final String MpinOld=".//*[@id='pwSignup']";
public static final String TpinOld=".//*[@id='pwSignup1']";
public static final String LoginOld=".//*[@id='logintable']/tbody/tr[5]/td[2]/input";


}
