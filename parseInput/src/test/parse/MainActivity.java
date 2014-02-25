package test.parse;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private boolean input(){
		GameScore = Parse.Object.extend("GameScore");
var gameScore = new GameScore();
 
gameScore.set("score", 1337);
gameScore.set("playerName", "Sean Plott");
gameScore.set("cheatMode", false);
 
gameScore.save(null, {
  success: function(gameScore) {
    // The object was saved successfully.
  },
  error: function(gameScore, error) {
    // The save failed.
    // error is a Parse.Error with an error code and description.
  }
});
	}
}
