package com.java.activ;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;


public class Controller extends Activity
{

	private static final int IDM_CREATE = 101;
	private static final int IDM_EXIT = 102;
	private static final int IDM_ABOUT = 103;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		getWindow().setFlags(
			WindowManager.LayoutParams.FLAG_FULLSCREEN
				| WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
			WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	//////////////////////////////////////////////////////////////////////////////////
	private void showInterfaceActivity() {
		Intent intent = new Intent(this, IntefaceCreater.class);
		startActivity(intent);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		//CharSequence message;
		switch (item.getItemId()) {
			case IDM_CREATE:
				showInterfaceActivity();
				break;
			case IDM_EXIT:
				super.onDestroy();
		        android.os.Process.killProcess(android.os.Process.myPid());
				break;
			case IDM_ABOUT: {
				AlertDialog alertDialog;
				alertDialog = new AlertDialog.Builder(this).create();
				alertDialog.setTitle("About this program.");
				alertDialog.setMessage("Program: !controller!\n" + "Version: v1.0.0\n"
					+ "Author: Vladimir Kozloff\n" + "09-It-1");
				alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				});
				alertDialog.show();
				return true;
			}
			default:
				return false;
		}
		// выводим уведомление о выбранном пункте меню
		/*Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();*/
		return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// добавляем пункты меню

		menu.add(Menu.NONE, IDM_CREATE, Menu.NONE, "Create interface");
		menu.add(Menu.NONE, IDM_EXIT, Menu.NONE, "Exit");
		menu.add(Menu.NONE, IDM_ABOUT, Menu.NONE, "About ?");
		return true;
	}
}
