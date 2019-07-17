package app.tait.androidchallenge.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnAboutAlC;
    private Button btnMyProfile;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAboutAlC = findViewById(R.id.btn_about_alc);
        btnMyProfile = findViewById(R.id.btn_my_profile);

        btnAboutAlC.setOnClickListener(this);
        btnMyProfile.setOnClickListener(this);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.main_activity_title);
        toolbar.setTitleTextColor(getResources().getColor(R.color.primary_white));


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_about_alc:



                startActivity(new Intent(this, AndelaLearningWebView.class));



                break;

            case R.id.btn_my_profile:

                startActivity(new Intent(this, MyProfile.class));

                break;


        }

    }
}
