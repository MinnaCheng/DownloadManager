package com.androidapps.cm.downloadmanager.com.androidapps.cm.downloadmanager;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.androidapps.cm.downloadmanager.R;

public class MainActivity extends AppCompatActivity {
    private Button btnDownload;
    private Button btnDownloadCancled;
    private EditText editTextDownloadAdd;
    private ProgressBar downloadBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        btnDownload = (Button)findViewById(R.id.buttonDownload);
        btnDownloadCancled = (Button)findViewById(R.id.buttonDownloadCancle);
        editTextDownloadAdd = (EditText)findViewById(R.id.editTextDownloadAddress);
        downloadBar = (ProgressBar)findViewById(R.id.progressBar);
    }
}
