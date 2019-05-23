package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public  class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        Toast.makeText(this, "快來 要開始嘍 ㄉㄚ ㄉㄚ ㄉㄚ", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(this, "大家一起來吧 ㄉㄚ ㄉㄧ ㄉㄚ ㄉㄚ", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(this, "一起來吧 ㄉㄨ ㄉㄨ ㄉㄨ", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "快啦吧 快 趕快來吧", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "冰淇淋不停的轉呀轉呀", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "看到布丁 搖搖搖", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "圓圓的甜甜圈", Toast.LENGTH_LONG).show();
    }

    public void onFinishClick(View view) {
        finish();
    }
}




