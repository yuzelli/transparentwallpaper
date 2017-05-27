package com.example.yuzelli.transparentwallpaper;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final int PERMISSIONS_REQUEST_CAMERA = 454;
    private Context mContext;
    static final String PERMISSION_CAMERA = Manifest.permission.CAMERA;
    private CheckBox mCbVoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        findViewById(R.id.text)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startWallpaper();
                    }
                });

        mCbVoice = (CheckBox) findViewById(R.id.id_cb_voice);

        mCbVoice.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(
                            CompoundButton buttonView, boolean isChecked) {

                        if (isChecked) {
                            // 静音
                            CameraLiveWallpaper.voiceSilence(getApplicationContext());
                        } else {
                            CameraLiveWallpaper.voiceNormal(getApplicationContext());
                        }
                    }
                });



    }



    /**
     * 选择壁纸
     */
    void    startWallpaper() {
        final Intent pickWallpaper = new Intent(Intent.ACTION_SET_WALLPAPER);
        Intent chooser = Intent.createChooser(pickWallpaper, getString(R.string.choose_wallpaper));
        startActivity(chooser);
    }

    /**
     * 不需要手动启动服务
     */
    public void setVideoToWallPaper(View view) {
        CameraLiveWallpaper.setToWallPaper(this);
    }
}
