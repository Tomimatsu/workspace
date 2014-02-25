package net.npaka.helloworld;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class HelloView extends View{

	public HelloView(Context context){
		super(context);
		setBackgroundColor(Color.GREEN);
	}

	@Override
	protected void onDraw(Canvas canvas){
		canvas.drawText("Hello Wolrd!", 0, 50, new Paint());
	}
}
