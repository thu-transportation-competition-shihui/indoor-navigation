package com.thu.tdnav;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class SearchActivity extends MainActivity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		tdnav appState = (tdnav)this.getApplication();
		appState.addActivity(this);
		setContentView(R.layout.search);
	}
	public void backonclick(View view)
	{
		finish();
	}
}