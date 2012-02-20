package com.java.activ;
import android.app.*;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListAct extends Activity
{
	public ListAct selfpoint;
	public int userchoice;
	private static final int IDM_ADD = 301;
	private static final int IDM_BACK = 302;


	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    	getWindow().setFlags(
    						WindowManager.LayoutParams.FLAG_FULLSCREEN |
    						WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
    						WindowManager.LayoutParams.FLAG_FULLSCREEN);
	  super.onCreate(savedInstanceState);
	  ListView lv=new ListView(this);
	  final GlobalVars gvarsList=new GlobalVars();
	  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1, gvarsList.KeysNames);
	  lv.setAdapter(adapter);
	  lv.setScrollbarFadingEnabled(true);
	  lv.setClickable(true);
	  selfpoint=this;
	  lv.setOnItemClickListener(new OnItemClickListener()
	  {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)
		{
			CharSequence message =gvarsList.GetKeyName(arg2);
			userchoice=arg2;
			Toast toast = Toast.makeText(selfpoint, message, Toast.LENGTH_LONG);
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.show();
			BackToInterface(arg2);
		}
	  });

	  lv.setOnItemLongClickListener(new OnItemLongClickListener()
	  {
		@Override
		public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
				int arg2, long arg3) {
			CharSequence message ="Loong!";
			Toast toast = Toast.makeText(selfpoint, message, Toast.LENGTH_LONG);
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.show();
			long arr[]={0,80,20};
			Vibrator v = (Vibrator) getSystemService(selfpoint.VIBRATOR_SERVICE);
			v.vibrate(arr,0);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				v.cancel();
			}
			v.cancel();
			return false;
		}
	  });

	  setContentView(lv);

	}
	public void BackToInterface(int arg2)
	{
		GlobalVars.userchoice=arg2;

		super.finish();
	}

	// ////////////////////////////////////////////////////////////////////////////////
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			switch (item.getItemId())
			{
			case IDM_ADD:
				super.finish();
				break;
			case IDM_BACK:
			{
				super.finish();
			}
			default:
				return false;
			}
			return true;
		}
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			menu.add(Menu.NONE, IDM_ADD, Menu.NONE, "Select");
			menu.add(Menu.NONE, IDM_BACK, Menu.NONE, "Back");
			return true;
		}

}
