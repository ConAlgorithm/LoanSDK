package com.panshi.loansdk;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.moxie.client.exception.MoxieException;
import com.moxie.client.manager.MoxieCallBack;
import com.moxie.client.manager.MoxieCallBackData;
import com.moxie.client.manager.MoxieContext;
import com.moxie.client.manager.MoxieSDK;
import com.moxie.client.model.MxParam;
import com.panshi.makepoint.MakePoint;

public class MainActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.id_tv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MakePoint.makePoint(2);
                MakePoint.makePoint(3);
            }
        });

        //合作方系统中的客户ID
//        String mUserId = "123qwe";  //合作方系统中的客户ID
//        //获取任务状态时使用(合作方申请接入后由魔蝎数据提供) ApiKey:
//        String mApiKey = "d9f2381275074a58b62d7a372da6efee";
//        String mThemeColor = "#ff9500"; //SDK里页面主色调
//        MxParam mxParam = new MxParam();
//        mxParam.setUserId(mUserId);                      //必传
//        mxParam.setApiKey(mApiKey);                      //必传
//        mxParam.setTaskType("whatsapp");                 //必传
//        mxParam.setPhone("13500000000");
//        mxParam.setName("张小明");
//        mxParam.setCacheDisable(MxParam.PARAM_COMMON_YES);
//        mxParam.setTaskType("whatsapp");
//        mxParam.setIdcard("330000000000000000");
//        MoxieSDK.getInstance().start(this, mxParam, new MoxieCallBack() {
//            @Override
//            public boolean callback(MoxieContext moxieContext, MoxieCallBackData moxieCallBackData) {
//                Log.d("callbackcallback",  moxieCallBackData.getTaskId());
//
//                return super.callback(moxieContext, moxieCallBackData);
//            }
//            @Override
//            public void onError(MoxieContext moxieContext, MoxieException moxieException) {
//                Log.d("callbackcallback", "222");
//                super.onError(moxieContext, moxieException);
//            }
//        });
    }
}
