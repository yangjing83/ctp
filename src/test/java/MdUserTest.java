import com.optioninfo.jctp.ctp.CThostFtdcMdApi;
import com.optioninfo.jctp.ctp.CThostFtdcMdSpi;
import com.optioninfo.jctp.ctp.CThostFtdcQryMulticastInstrumentField;

import java.io.File;

public class MdUserTest {
	
	    static{
			System.out.println("java.library.path:"+System.getProperty("java.library.path"));

			System.loadLibrary("thostmduserapi_se");
			System.loadLibrary("thosttraderapi_se");
			System.loadLibrary("thosttraderapi_wrap_se");

			System.out.println("当前版本: " + CThostFtdcMdApi.GetApiVersion());

	    }
	    
	    // test
//		final static String mdAddress = "tcp://180.168.146.187:10110,tcp://180.168.146.187:10111,tcp://218.202.237.33:10112";
		// prod
		final static String mdAddress = "tcp://101.226.254.75:41213,tcp://101.226.254.76:41213,tcp://140.206.242.27:41213,tcp://140.206.242.28:41213";

	// 7-4
	//	第一组:Trade Front:180.168.146.187:10100,Market Front:180.168.146.187:10110;【电信】(看穿式前置)
//	第二组:Trade Front:180.168.146.187:10101,Market Front:180.168.146.187:10111;【电信】(看穿式前置,使用监控中心生产秘钥)
//	第三组:Trade Front:218.202.237.33:10102,Market Front:218.202.237.33:10112;【移动】(看穿式前置,使用监控中心生产秘钥)

	    private static int n = 0;

	static CThostFtdcMdSpi mdSpi;
	static CThostFtdcMdApi mdApi;

	public static void main(String[] args) throws Exception{
		String dir = "/data/record/" +
				CThostFtdcMdApi.GetApiVersion().substring(0, CThostFtdcMdApi.GetApiVersion().indexOf(" ")) + "/";

		File file = new File(dir + "/mduser/");
		if(!file.exists()) {
			file.mkdirs();
		}

//		mdSpi = new CThostFtdcMdSpi(null, dir + "/mduser/", mdAddress.split(","));
		mdSpi = new CThostFtdcMdSpi();
		mdApi = CThostFtdcMdApi.CreateFtdcMdApi();
		Thread.sleep(1000);

		testSubscribeMarketData();
		testReqQryMulticastInstrument();

		mdApi.Join();
		mdApi.Release();
	}

	 // STG DCE	4 宽跨式组合		STG v2105-P-7300&v2105-C-7500
	// OPL DCE	7 期权对锁组合	OPL c2009-C-1820&c2009-C-1820
	// SPC DCE	0 期货组合		SPC y2105&p2105 productid SPC y&p 跨品种
	// BUL DCE	1 垂直价差BUL	BUL v2105-P-7500&v2105-P-7200
	// BER DCE	2 垂直价差BER	BER v2105-P-7500&v2105-P-6200
	// SP DCE	0 期货组合	SP y2107&y2108 productId 有些有，有些没有
	// BFO DCE	8 买备兑组合	BFO v2105-P-7300&v2105
	// PRT DCE	5 备兑组合	PRT v2105-P-7400&v2105
	// STD DCE	3 跨式组合	STD c1909-C-1920&c1909-P-1920
	// SPD CZCE 0 期货组合	SPD AP005&AP007 productId: SPD ZC&ZC，名称：跨期套利-AP005/AP007
	// IPS CZCE	0 期货组合	IPS TA109&PF109	productId: IPS TA&PF, 名称：跨品种套利-TA109/PF1 （显示不全）

	public static void testSubscribeMarketData() {
//		mdSpi.subscribeMarketData("m2105");
//		mdSpi.subscribeMarketData("SP m2101&m2105");
//		mdSpi.subscribeMarketData("BER v2105-P-7500&v2105-P-6200");
	}

	public static void testSubscribeForQuoteRsp() {
		String[] instrumentIds = {"al2105C17800"};
		mdApi.SubscribeForQuoteRsp(instrumentIds, instrumentIds.length);
	}

	public static void testReqQryMulticastInstrument() {
		CThostFtdcQryMulticastInstrumentField field = new CThostFtdcQryMulticastInstrumentField();
		field.setInstrumentID("rb2101");
		field.setTopicID(1000);
		mdApi.ReqQryMulticastInstrument(field, 1);
	}

}
