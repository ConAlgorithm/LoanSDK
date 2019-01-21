package com.panshi.makepoint;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class MakePoint {
    private static int channelId;
    private static String gooleAdsId;
    public static Context Myapplication;

    public static void initMakePoint(Context context, int channelId) {
        MakePoint.channelId = channelId;
        try {
            Myapplication = context;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    //1 下载 2 注册 3 申请
    public static void makePoint(int eventKey) {
        if (channelId == 0) {
            throw new RuntimeException("channelId is error");
        } else {
            JSONObject jSONObject1 = new JSONObject();
            try {
                jSONObject1.put("channelId", channelId);
                jSONObject1.put("event", eventKey);
//                jSONObject1.put("gooleAdsId", gooleAdsId);
                jSONObject1.put("userId", 0);

                String resultStr = GetPostUrl.getPost.postBody(Constant.BaseUrl + Constant.channelstat, jSONObject1);

                JSONObject jSONObject = new JSONObject(resultStr);
                int code = jSONObject.optInt("code");
                boolean success = jSONObject.optBoolean("success");
                if (code != 0) {
                    throw new RuntimeException("request errorCode: " + code);
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }


}
