package com.example.design;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.Wave;

public class MainActivity extends AppCompatActivity {

    private Dialog loadingDialog;
    private Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          /*
              initial the loadingDialog
         */

        loadingDialog = new Dialog(this);
        loadingDialog.setContentView(R.layout.dialog_progressbar);
        loadingDialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.shaper));
        loadingDialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        loadingDialog.setCancelable(false);



                login_button = (Button) findViewById(R.id.login_btn_id);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadingDialog.show();
            }
        });
    }
}