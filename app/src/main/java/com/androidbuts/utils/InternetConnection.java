package com.androidbuts.utils;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * 
 * @author Pratik Butani
 * 
 */
public class InternetConnection {

	/** CHECK WHETHER INTERNET CONNECTION IS AVAILABLE OR NOT */
	public static boolean checkConnection(Context context) {
		return  ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo() != null;
	}
}
