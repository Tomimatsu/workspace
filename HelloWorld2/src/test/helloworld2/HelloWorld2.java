package test.helloworld2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class HelloWorld2 extends Activity implements OnClickListener{

	private Button button1;
	private TextView text1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//ヘッダータイトルのありなし等指定
		//setContentViewより先
		requestWindowFeature(Window.FEATURE_RIGHT_ICON);

		setContentView(R.layout.main);

		//アイコンの指定
		//setContentViewより後
		getWindow().setFeatureDrawableResource(Window.FEATURE_RIGHT_ICON, R.drawable.cat);



		//main.xmlと変数の紐付け？
		button1 = (Button)findViewById(R.id.button1);
		button1.setText("CLICK");
		button1.setBackgroundColor(Color.WHITE);
		button1.setOnClickListener(this);
		text1 =(TextView)findViewById(R.id.textView1);

	}

	//クリック時処理
	@Override
	public void onClick(View view) {
		text1.setText("HelloWorld!");
	}



}
