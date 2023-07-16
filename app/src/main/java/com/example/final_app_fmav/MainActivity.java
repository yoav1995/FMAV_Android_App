package com.example.final_app_fmav;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_app_fmav.Models.Vehicle;
import com.example.final_app_fmav.Utilities.DataManager;
import com.example.final_app_fmav.Utilities.SingleGen;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView main_LST_vehicles;
    private Button sign_In_BTN,sign_Out_BTN,yad2_BTN;
    private ImageView slogan_IMG;
    private SwitchCompat music_switch;
    public FirebaseAuth mAuth;
    public FirebaseUser currentUser;
    private ArrayList<Vehicle> vehicles;
    private MaterialTextView counter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();
        vehicles=DataManager.getVehicles();


        // init buttons and views

        findViews();
        yad2_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.yad2.co.il/vehicles/cars"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //music on or off switch

        music_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    SingleGen.getInstance().mediaPlayerOn();
                }
                else
                    SingleGen.getInstance().mediaPlayerOff();
            }
        });

                ////Sign Out User
        sign_Out_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
            }
        });

        sign_In_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogInWindow();
            }
        });
    }

    private void logout() {
       if(currentUser!=null) {
           currentUser.delete();
           mAuth.signOut();
           Toast.makeText(this, "Log Out Completed Successfully", Toast.LENGTH_SHORT).show();
       }
    }

    private void findViews() {
        sign_In_BTN =findViewById(R.id.Sign_in_BTN);
        yad2_BTN=findViewById(R.id.Yad2_BTN);
        music_switch=findViewById(R.id.music_Switch);
        slogan_IMG=findViewById(R.id.sloganIMG);
        sign_Out_BTN=findViewById(R.id.Sign_out_BTN);
        counter=findViewById(R.id.list_count_text);
        counter.setText("There Are "+vehicles.size()+" "+counter.getText());

    }
    private void openLogInWindow() {
        Intent myIntent=new Intent(this,LogInActivity .class);
        startActivity(myIntent);

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(SingleGen.getInstance().mediaPlayerIsPlaying())
            music_switch.setChecked(true);
        else
            music_switch.setChecked(false);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}