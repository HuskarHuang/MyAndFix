package com.hwh.myandfix;

import android.app.Application;
import android.os.Environment;
import android.util.Log;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.IOException;

public class MyApplication extends Application {
    private static final String TAG = "MyApplication";

    private static final String APATCH_PATH = "/out.apatch";
    /**
     * patch manager
     */
    private PatchManager mPatchManager;

    @Override
    public void onCreate() {
        super.onCreate();
        // initialize
        mPatchManager = new PatchManager(this);
        mPatchManager.init("1.0");
        Log.i(TAG, "inited.");

        // load patch
        mPatchManager.loadPatch();//加载修复包
        Log.i(TAG, "apatch loaded.");

        // add patch at runtime
        try {
            // .apatch file path
            String patchFileString = Environment.getExternalStorageDirectory()
                    .getAbsolutePath() + APATCH_PATH;
            mPatchManager.addPatch(patchFileString);//添加到管理器中
            Log.i(TAG, "apatch:" + patchFileString + " added.");
        } catch (IOException e) {
            Log.e(TAG, "", e);
        }
    }

}
