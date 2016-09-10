package com.example.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.PrivateCredentialPermission;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {

	private String[] names=new String[]{"邓艾","姜维","鲁肃","陆逊","吕蒙","司马懿","许褚","张角","赵云","诸葛"};
	private String[] says=new String[]{"偷渡阴平，直取蜀汉","女等小儿，可敢杀我","合纵连横，方能以弱胜强","吾生脱俗，不为贪逸淫乐之事","留得青山在，不怕没柴烧",
			"出来混,迟早要还的!","脱！谁来与我大战三百回合","苍天已死，黄天当立，岁在甲子，天下大吉"," 吾乃常山赵子龙也","观今夜天象，知天下大事"};
	private int[] images=new int[]{R.drawable.dengai,R.drawable.jiangwei,R.drawable.lushu,R.drawable.luxun,R.drawable.lvmeng,R.drawable.simayi,R.drawable.xuchu,R.drawable.zhangjiao,R.drawable.zhaoyun,R.drawable.zhuge};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for(int i=0;i<names.length;i++){
			Map<String,Object> showitem=new HashMap<String, Object>();
			showitem.put("image",images[i]);
			showitem.put("name", names[i]);
			showitem.put("say",says[i]);
			
			list.add(showitem);
			
		}
		
		SimpleAdapter sim=new SimpleAdapter(this, list,
	    R.layout.list,new String[]{"image","name","say"}, 
		new int[]{R.id.image,R.id.name,R.id.say});
		
		ListView listView=(ListView)findViewById(R.id.lv);
		listView.setAdapter(sim);
	}

	
}
