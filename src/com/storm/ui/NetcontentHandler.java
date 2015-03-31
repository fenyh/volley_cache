package com.storm.ui;

import android.os.Message;

import com.fengyh.volley.cache.main.HttpStringContentHandler;
import com.fengyh.volley.cache.util.DebugUtil;
import com.fengyh.volley.cache.util.JsonUtil;
import com.fengyh.volley.cache.util.NetWorkHandler;

public class NetcontentHandler extends HttpStringContentHandler{

	@Override
	public void onPraseJson(String jsonStr, boolean isCache,
			NetWorkHandler handler) {
		DebugUtil.d("--onPraseJson----", jsonStr);
		Message msg = handler.obtainMessage();
		
		//Object o = JsonUtil.deserialize(jsonStr, Object.class);
		msg.obj = jsonStr;
		if(!isCache){
			handler.sendSuccessCacheMesage(msg);
		}else{
			handler.sendSuccessMesage(msg);
		}
	}
}
