package com.example.image_slider;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider=findViewById(R.id.image_slider);

        ArrayList<SlideModel> images =new ArrayList<>();
        images.add(new SlideModel(R.drawable.a1,null));
        images.add(new SlideModel("http://virtuosos.in/be-konnected/uploads/offers_image/301_banner1.png", null));
        images.add(new SlideModel("https://bit.ly/2BteuF2", "Elephants and tigers may become extinct.",null));
        images.add(new SlideModel(R.drawable.a2,null));
        images.add(new SlideModel(R.drawable.a3,null));
        images.add(new SlideModel(R.drawable.a4,null));

        imageSlider.setImageList(images, ScaleTypes.CENTER_CROP);

        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                Toast.makeText(MainActivity.this,"Item "+i+"Selected",Toast.LENGTH_SHORT).show();
            }
        });
    }
}