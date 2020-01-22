package com.example.wifi;



import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b1=(Button)findViewById(R.id.on);
        b2=(Button)findViewById(R.id.off);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				WifiManager wi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
				wi.setWifiEnabled(true);
				Toast.makeText(getApplicationContext(), "Wifi On", Toast.LENGTH_LONG).show();
			}
		});
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				WifiManager wi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
				wi.setWifiEnabled(false);
				Toast.makeText(getApplicationContext(), "Wifi Off", Toast.LENGTH_LONG).show();
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
