package com.hwh.myandfix;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.hwh.test.A;
import com.hwh.test.hwh;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
                    || checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{ Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            }
        }

        TextView textView = findViewById(R.id.sample_text);
        TextView classTv = findViewById(R.id.classTextView);
        textView.setText("有bug");
//        textView.setText("解决bug");
        hwh hwh = new hwh();
        classTv.setText(hwh.getTest() + "," + hwh.getFix());
//        classTv.setText(new hwh().getTest());


        Log.e(TAG, A.a("good"));
        Log.e(TAG, "" + new A().b("s1", "s2"));
        Log.e(TAG, "" + new A().getI());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.os.Process.killProcess(android.os.Process.myPid());
    }

}
