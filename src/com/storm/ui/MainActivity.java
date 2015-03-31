package com.storm.ui;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.fengyh.volley.cache.main.RequestContent;
import com.fengyh.volley.cache.util.Configs;
import com.fengyh.volley.cache.util.DebugUtil;
import com.fengyh.volley.cache.util.JsonUtil;
import com.fengyh.volley.cache.util.NetWorkHandler;
import com.fengyh.app.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{

	private Button but;
	
	public static enum CacheTime{
		Time(Configs.TIME_HOUR),Dat(Configs.TIME_DAY);
		private int time;
		private CacheTime(int time){
			this.time = time;
		}
	}
	
	private NetWorkHandler handler = new NetWorkHandler(Looper.myLooper()) {
		@Override
		protected void onNetRequestSuccess(Message msg) {
			DebugUtil.d("---onNetRequestSuccess---", msg.obj+"");
		}
		
		protected void onCacheRequestSuccess(Message msg) {
			DebugUtil.d("---onCacheRequestSuccess---", msg.obj+"");
		};
		
		@Override
		protected void onNetRequestFailure(Message msg) {
			
		}
	};
	/**
	 * 生产地址
	 */
	public static final String BASE_TEST_POST_URL = "https://mgateway.cmbchinaucs.com/Interface.aspx";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.activity_main);
		Button but = (Button) findViewById(R.id.but);
		but.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				/*Map<String, String> params = new HashMap<String, String>();
				params.put("FtCode", "1");
				RequestContent content = new RequestContent(MainActivity.this);
				//content.getRequestContent(BASE_TEST_POST_URL, 80000, params, handler, new NetcontentHandler());
				//content.getRequestContent(BASE_TEST_POST_URL, 80000, params, "123456", handler, new NetcontentHandler());
				
				content.getRequestContentMemoryIntel(BASE_TEST_POST_URL, 80000, params, "123456", handler, new NetcontentHandler());
			*/
			
			}
		});
	}
}
