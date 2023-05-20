package com.example.redsocial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*View header = navigationView.getHeaderView(0);
        final ImageView photo = header.findViewById(R.id.photoImageView);
        final TextView name = header.findViewById(R.id.displayNameTextView);
        final TextView email = header.findViewById(R.id.emailTextView);

        FirebaseAuth.getInstance().addAuthStateListener(new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();

                if(user != null){
                    Glide.with(MainActivity.this)
                            .load(FirebaseAuth.getInstance().getCurrentUser().getPhotoUrl().toString())
                            .circleCrop()
                            .into(photo);
                    name.setText(FirebaseAuth.getInstance().getCurrentUser().getDisplayName());
                    email.setText(FirebaseAuth.getInstance().getCurrentUser().getEmail());
                }
            }
        });*/
    }
}