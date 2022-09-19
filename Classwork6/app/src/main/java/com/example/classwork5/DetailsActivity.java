package com.example.classwork5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView nametext = findViewById(R.id.textViewNameD);
        TextView pricetext = findViewById(R.id.textViewpriceD);
        ImageView img = findViewById(R.id.imageViewD);

        Bundle bundle = getIntent().getExtras();
        Items sentItem = (Items) bundle.getSerializable("phone");

        nametext.setText(sentItem.getItemName());
        pricetext.setText(sentItem.getItemPrice() + "KD");
        img.setImageResource(sentItem.getItemImg());
    }
}