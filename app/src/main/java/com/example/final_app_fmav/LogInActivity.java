package com.example.final_app_fmav;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;
public class LogInActivity extends AppCompatActivity {
    private RecyclerView main_LST_vehicles;
    public FirebaseAuth mAuth;
    private Boolean musicChecked;
    public static final String KEY_MUSIC = "KEY_MUSIC";

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        Intent intent=getIntent();
        mAuth=FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    private void updateUI(FirebaseUser currentUser) {
        if(currentUser != null){
            Toast.makeText(this,"You Signed In successfully",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this,VehiclesLST.class));

        }else {
            Toast.makeText(this,"You Didn't signed in",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAuth=FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            currentUser.reload();
        }
    }

    private void login() {
        // Choose authentication providers
        List<AuthUI.IdpConfig> providers = Arrays.asList(
                new AuthUI.IdpConfig.EmailBuilder().build(),
                new AuthUI.IdpConfig.PhoneBuilder().build());

        // Create and launch sign-in intent
        Intent signInIntent = AuthUI.getInstance()
                .createSignInIntentBuilder()
                .setAvailableProviders(providers)
                .setLogo(R.mipmap.logo_img_foreground)
                .setTheme(com.firebase.ui.auth.R.style.FirebaseUI_DefaultMaterialTheme)
                .build();
        signInLauncher.launch(signInIntent);
    }

    private final ActivityResultLauncher<Intent> signInLauncher = registerForActivityResult(
            new FirebaseAuthUIActivityResultContract(),
            new ActivityResultCallback<FirebaseAuthUIAuthenticationResult>() {
                @Override
                public void onActivityResult(FirebaseAuthUIAuthenticationResult result) {
                    onSignInResult(result);
                }
            }
    );


    private void onSignInResult(FirebaseAuthUIAuthenticationResult result) {
        IdpResponse response = result.getIdpResponse();
        if (result.getResultCode() == RESULT_OK) {
            // Successfully signed in
            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

            // ...
            Intent previousIntent = getIntent();
            musicChecked=previousIntent.getBooleanExtra(KEY_MUSIC,false);
            Intent newIntent= new Intent(this,VehiclesLST.class);
            newIntent.putExtra(VehiclesLST.KEY_MUSIC, musicChecked);
            startActivity(newIntent);
            finish();
        } else {
            // Sign in failed. If response is null the user canceled the
            // sign-in flow using the back button. Otherwise check
            // response.getError().getErrorCode() and handle the error.
            // ...
            Toast.makeText(this,"Unsuccessful Login!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, LogInActivity.class);
            startActivity(intent);
        }
    }

}