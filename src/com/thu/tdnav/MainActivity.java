package com.thu.tdnav;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import 	java.lang.String;
import android.content.Intent;
public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		tdnav appState = (tdnav)this.getApplication();
		appState.addActivity(this);
        setContentView(R.layout.main);	
    }
	//Create menu
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
	super.onCreateOptionsMenu(menu);
	getMenuInflater().inflate(R.menu.mainmenu, menu);
    return true;
	}
	@Override
	//onselected
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
        case R.id.menu_lookforplace:
            onmenusearchingclick();
            return true;
        case R.id.menu_showmap:
            onmenushowmapclick();
            return true;
		case R.id.menu_information:
			onmenuinformationclick();
			return true;
		case R.id.menu_setting:
			onmenusettingclick();
			return true;
		case R.id.menu_about:
			onmenuaboutclick();
			return true;
		case R.id.menu_exit:
			onmenuquitclick();
			return true;
        default:
            return super.onOptionsItemSelected(item);
		}
	}
    //debug dialog
    public void showDebugDialog()
    {
  		AlertDialog builder = new AlertDialog.Builder(this)
  		.setTitle("notice")
  		.setMessage("code uncompleted")
  		.setPositiveButton("I know",null)
  		.show();
    }
	public void showDebugDialog(String title)
	{
		AlertDialog builder = new AlertDialog.Builder(this)
  		.setTitle(title)
  		.setMessage("code uncompleted")
  		.setPositiveButton("I know",null)
  		.show();
	}
	//2d query
	public void inputby2d(View view)
	{
		showDebugDialog();
	}
	
	//start place voice query
	public void inputbyvoice_start(View view)
	{
		showDebugDialog();
	}
	
	//destination voice query
	public void inputbyvoice_end(View view)
	{
		showDebugDialog();
	}
	
	//menu
	public void menuonclick(View view)
	{
		openOptionsMenu();
	}
	
	//search
	public void searchonclick(View view)
	{
		Intent intent = new Intent(this,SearchActivity.class);
		startActivity(intent);
	}
	public void onmenusearchingclick()
	{
		showDebugDialog("menu_searching");
	}
	public void onmenushowmapclick()
	{
		showDebugDialog("menu_showmap");
	}
	public void onmenuinformationclick()
	{
		showDebugDialog("menu_info");
	}
	public void onmenusettingclick()
	{
		showDebugDialog("menu_setting");
	}
	public void onmenuaboutclick()
	{
		showDebugDialog("menu_about");
	}
	public void onmenuquitclick()
	{
		tdnav appState = (tdnav)getApplicationContext();
		appState.finishAll();
	}
}
