package com.example.projectpizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView photo;
        TextView Nom,description,details,preparation;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent in=getIntent();
        photo=findViewById(R.id.photo);
        Nom=findViewById(R.id.Nom);
        description=findViewById(R.id.description);
        details=findViewById(R.id.details);
        preparation=findViewById(R.id.preparation);

        photo.setImageResource(in.getIntExtra("Photo",0));
        Nom.setText(in.getStringExtra("Nom"));
        description.setText(in.getStringExtra("Description"));
        details.setText(in.getStringExtra("Details"));
        preparation.setText(in.getStringExtra("Preparation"));


    }
}