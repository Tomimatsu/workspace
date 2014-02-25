package net.npaka.helloworld;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class HelloWorld extends Activity implements OnClickListener {

	private final static int WC = LinearLayout.LayoutParams.WRAP_CONTENT;


	//起動時に実行
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		//setContentView(new HelloView(this));


		LinearLayout layout = new LinearLayout(this);
		layout.setBackgroundColor(Color.GREEN);
		layout.setOrientation(LinearLayout.VERTICAL);
		setContentView(layout);

		layout.addView(makeButton("一瞬表示","0"));
		layout.addView(makeButton("ダイアログ表示","1"));
		layout.addView(makeButton("再描画","2"));

	}

	@Override
	public void onClick(View view) {
		int tag = Integer.parseInt((String)view.getTag());
		if(tag == 0){
			Toast.makeText(this, "HelloWorld!", Toast.LENGTH_SHORT).show();
		}else if(tag == 1){
			showDialog(this, "TestDialog", "HelloWorld!");
		}else if(tag == 2){
			setContentView(new HelloView(this));
		}

	}

	//ボタンレイアウト
	private Button makeButton(String text,String tag){
		Button button  = new Button(this);
		button.setText(text);
		button.setTag(tag);
		button.setBackgroundColor(Color.WHITE);
		//クリックイベント
		button.setOnClickListener(this);
		//???????????
		button.setLayoutParams(new LinearLayout.LayoutParams(WC,WC));
		return button;
	}


	//ダイアログで表示
	private static void showDialog(Context context,String title,String text){
		AlertDialog.Builder ad = new AlertDialog.Builder(context);
		ad.setTitle(title);
		ad.setMessage(text);
		//?????????????
		ad.setPositiveButton("OK",null);
		ad.show();
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
