package com.java.activ;


import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;
import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.scene.Scene.IOnSceneTouchListener;
import org.anddev.andengine.entity.scene.background.SpriteBackground;
import org.anddev.andengine.entity.scene.menu.MenuScene;
import org.anddev.andengine.entity.scene.menu.MenuScene.IOnMenuItemClickListener;
import org.anddev.andengine.entity.scene.menu.item.IMenuItem;
import org.anddev.andengine.entity.sprite.Sprite;
import org.anddev.andengine.entity.util.FPSLogger;
import org.anddev.andengine.input.touch.TouchEvent;
import org.anddev.andengine.opengl.texture.TextureOptions;
import org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.anddev.andengine.opengl.texture.region.TextureRegion;
import org.anddev.andengine.ui.activity.BaseGameActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;


public class IntefaceCreater extends BaseGameActivity implements IOnSceneTouchListener,
	IOnMenuItemClickListener
{
	public TextView x;
	public static Camera mCamera;
	public static final int Camera_width = 800;
	public static final int Camera_height = 480;
	public static Scene mMainScene;

	private BitmapTextureAtlas mBitmapTextureAtlas;
	private TextureRegion mBackGr;
	private TextureRegion[] ButtonsImage = new TextureRegion[4];
	private Sprite[] ButtinsSprite = new Sprite[4];

	public int choisenbutton;
	public int ScaleId;

	private static final int IDM_SAVE = 201;
	private static final int IDM_BACK = 202;
	private static final int IDM_LOAD = 203;
	private static final int IDM_NEW = 204;
	public GlobalVars ggg = new GlobalVars();

	public void onCreate(Bundle savedInstanceState) {
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		getWindow().setFlags(
			WindowManager.LayoutParams.FLAG_FULLSCREEN
				| WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
			WindowManager.LayoutParams.FLAG_FULLSCREEN);
		x = new TextView(this);
		super.onCreate(savedInstanceState);
		x.setText("This will be something that help you to crete the interface!");
		//setContentView(x);
	}

	@Override
	public Engine onLoadEngine() {
		mCamera = new Camera(0, 0, Camera_width, Camera_height);
		return new Engine(new EngineOptions(true, ScreenOrientation.LANDSCAPE,
			new RatioResolutionPolicy(Camera_width, Camera_height), mCamera).setNeedsMusic(true));
	}

	// ////////////////////////////////////////////////////////////////////////////////
	private void showListActivity() {
		Intent intent = new Intent(this, ListAct.class);
		startActivity(intent);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		CharSequence message;
		switch (item.getItemId()) {
			case IDM_NEW:
				message = "New!";
				mMainScene.detachChildren();
				mMainScene.attachChild(ButtinsSprite[0]);
				mMainScene.registerTouchArea(ButtinsSprite[0]);
				mMainScene.attachChild(ButtinsSprite[1]);
				mMainScene.registerTouchArea(ButtinsSprite[1]);
				break;
			case IDM_SAVE:
				message = "Save!";
				showListActivity();
				break;
			case IDM_LOAD: {
				int a = GlobalVars.userchoice;
				message = "Laod!" + a;
				break;
			}
			case IDM_BACK: {
				message = "";
				super.finish();
			}
			default:
				return false;
		}
		Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
		return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(Menu.NONE, IDM_SAVE, Menu.NONE, "Save interface");
		menu.add(Menu.NONE, IDM_NEW, Menu.NONE, "New interface");
		menu.add(Menu.NONE, IDM_LOAD, Menu.NONE, "Load interface");
		menu.add(Menu.NONE, IDM_BACK, Menu.NONE, "Back");
		return true;
	}

	// ////////////////////////////////////////////////////////////////////////////////
	@Override
	public void onLoadResources() {
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");
		mBitmapTextureAtlas = new BitmapTextureAtlas(2048, 2048, TextureOptions.DEFAULT);
		mBackGr = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mBitmapTextureAtlas,
			this, "7.jpg", 0, 0);
		ButtonsImage[0] = BitmapTextureAtlasTextureRegionFactory.createFromAsset(
			this.mBitmapTextureAtlas, this, "b1.png", 820, 0);
		ButtonsImage[1] = BitmapTextureAtlasTextureRegionFactory.createFromAsset(
			this.mBitmapTextureAtlas, this, "b3.png", 820, 200);
		ButtonsImage[2] = BitmapTextureAtlasTextureRegionFactory.createFromAsset(
			this.mBitmapTextureAtlas, this, "str.png", 820, 400);
		this.mEngine.getTextureManager().loadTexture(this.mBitmapTextureAtlas);
	}

	@Override
	public Scene onLoadScene() {
		this.mEngine.registerUpdateHandler(new FPSLogger());
		mMainScene = new Scene();
		Sprite bak = new Sprite(0, 0, mBackGr);
		mMainScene.setBackground(new SpriteBackground(bak));
		mMainScene.setOnSceneTouchListener(this);
		ButtinsSprite[0] = new Sprite(40, 20, ButtonsImage[0]) {
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
				final float pTouchAreaLocalX, final float pTouchAreaLocalY) {
				switch (pSceneTouchEvent.getAction()) {
					case TouchEvent.ACTION_DOWN: {
						if ((choisenbutton != 1) && (choisenbutton != 0)) {
							ButtinsSprite[choisenbutton - 1].setScale(1.0f);
							ScaleId = 0;
						}
						if (ScaleId == 0) {
							choisenbutton = 1;
							this.setScale(1.25f);
						}
						else {
							this.setScale(1.0f);
							choisenbutton = 0;
						}
						ScaleId = (ScaleId + 1) % 2;
					}
						break;
					default:
						break;
				}
				return true;
			}
		};
		ButtinsSprite[1] = new Sprite(300, 20, ButtonsImage[1]) {
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
				final float pTouchAreaLocalX, final float pTouchAreaLocalY) {
				switch (pSceneTouchEvent.getAction()) {
					case TouchEvent.ACTION_DOWN: {
						if ((choisenbutton != 2) && (choisenbutton != 0)) {
							ScaleId = 0;
							ButtinsSprite[choisenbutton - 1].setScale(1.0f);
						}
						if (ScaleId == 0) {
							choisenbutton = 2;
							this.setScale(1.5f);
						}
						else {
							this.setScale(1.0f);
							choisenbutton = 0;
						}
						ScaleId = (ScaleId + 1) % 2;
					}
						break;
				}
				return true;
			}
		};
		ButtinsSprite[2] = new Sprite(400, 20, ButtonsImage[2]) {
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
				final float pTouchAreaLocalX, final float pTouchAreaLocalY) {
				switch (pSceneTouchEvent.getAction()) {
					case TouchEvent.ACTION_DOWN: {
						if ((choisenbutton != 3) && (choisenbutton != 0)) {
							ScaleId = 0;
							ButtinsSprite[choisenbutton - 1].setScale(1.0f);
						}
						if (ScaleId == 0) {
							choisenbutton = 3;
							this.setScale(1.5f);
						}
						else {
							this.setScale(1.0f);
							choisenbutton = 0;
						}
						ScaleId = (ScaleId + 1) % 2;
					}
						break;
				}
				return true;
			}
		};
		mMainScene.attachChild(ButtinsSprite[0]);
		mMainScene.registerTouchArea(ButtinsSprite[0]);
		mMainScene.attachChild(ButtinsSprite[1]);
		mMainScene.registerTouchArea(ButtinsSprite[1]);
		mMainScene.attachChild(ButtinsSprite[2]);
		mMainScene.registerTouchArea(ButtinsSprite[2]);

		return mMainScene;

	}

	@Override
	public void onLoadComplete() {
	}

	@Override
	public boolean onMenuItemClicked(MenuScene pMenuScene, IMenuItem pMenuItem,
		float pMenuItemLocalX, float pMenuItemLocalY) {
		return false;
	}

	@Override
	public boolean onSceneTouchEvent(Scene pScene, TouchEvent pSceneTouchEvent) {
		// TODO Auto-generated method stub
		if (pSceneTouchEvent.getY() < 150)
			return false;
		if (choisenbutton != 0) {
			Sprite btt1 = new Sprite(pSceneTouchEvent.getX(), pSceneTouchEvent.getY(),
				ButtonsImage[choisenbutton - 1]);
			btt1.setHeight((float) (btt1.getHeight() * 2));
			btt1.setWidth((float) (btt1.getWidth() * 2));
			mMainScene.attachChild(btt1);
			showListActivity();
			//String lalala=(String) ggg.GetKeyName(ggg.userchoice);
			//Text _text1 = new Text(pSceneTouchEvent.getX()+10, pSceneTouchEvent.getY()+10, new Font(), lalala);
			//_text1.setColor(127/255f, 127/255f, 255/255f); //���� ������ ����� ���������
			//mMainScene.attachChild(_text1);
		}
		return false;
	}

}
