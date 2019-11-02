package com.example.latihanmopro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    //    LinearLayout linearLayout;
//    static TextView sosmed;
//    static TextView noHp;
//    static TextView loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        linearLayout = findViewById(R.id.linear);
//        sosmed = findViewById(R.id.tv_sosmed);
//        noHp = findViewById(R.id.tv_sosmed);
//        loc = findViewById(R.id.tv_location);
        setContentView(R.layout.activity_profile);

//         Paper.init(this);
//         String language = Paper.book().read("language");
//         updateView((String)Paper.book().read("language"));
        initCreateAccountTextView();
    }

//    public void updateView(String language) {
//         Context context = LocaleHelper.setLocale(this , language);
//        Resources resource = context.getResources();
//        noHp.setText(resource.getString(R.string.contact));
//        sosmed.setText(resource.getString(R.string.sosmed));
//        loc.setText(resource.getString(R.string.loc));
//    }

    private void initCreateAccountTextView() {
        TextView tv_sosmed = findViewById(R.id.tv_sosmed);
        tv_sosmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com/mj_uhuy/";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData( Uri.parse(url));
                startActivity(browser);
            }
        });

        TextView tvPhone = findViewById(R.id.tv_phone);
        tvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "089607029417";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+phoneNumber));
                startActivity(dialPhoneIntent);
            }
        });

        TextView tvLoc = findViewById(R.id.tv_location);
        tvLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:-6.491538, 107.479404");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }

//    @Override
//    protected void attachBaseContext(Context newBase) {
//        super.attachBaseContext(LocaleHelper.onAttach(newBase,"in"));
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.profile:
//                Intent i = new Intent(ProfileActivity.this, ProfileActivity.class);
//                startActivity(i);
//                break;
//
//            case R.id.change_language:
//                Paper.book().write("language", "in");
//                updateView((String)Paper.book().read("laguage"));
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}