import com.optioninfo.jctp.ctp.*;

public class TestApi {

    public static void main(String[] args) {

        String path = "/data/ctp-flow-path/";
        CThostFtdcMdApi mdApi = CThostFtdcMdApi.CreateFtdcMdApi(path);
        CThostFtdcMdSpi mdSpi = new CThostFtdcMdSpi();

        // 新的版本6.6.1
        // 改动不是太大

        mdApi.RegisterSpi(mdSpi);

        System.out.println(mdApi.GetTradingDay());

        CThostFtdcReqUserLoginField field = new CThostFtdcReqUserLoginField();
        mdApi.ReqUserLogin(field, 1);

        // 订阅行情
        mdApi.SubscribeMarketData(new String[]{"rb2110"}, 1);

        mdApi.Init();
        mdApi.Join();

    }

}
