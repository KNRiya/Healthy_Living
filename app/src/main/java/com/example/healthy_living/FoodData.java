package com.example.healthy_living;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_data);
    }

    private String itemName;
    private String itemDescription;
    private String itemCalories;
    private int itemImage;

    public FoodData(String itemCalories) {
        this.itemCalories = itemCalories;
    }

    public FoodData(int contentLayoutId, String itemCalories) {
        super(contentLayoutId);
        this.itemCalories = itemCalories;
    }

    public FoodData(String itemName, String itemDescription, int itemImage) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
    }

    public FoodData(int contentLayoutId, String itemName, String itemDescription, int itemImage) {
        super(contentLayoutId);
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemCalories() {
        return itemCalories;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getItemImage() {
        return itemImage;
    }


    public class ViewHolder {
        public ViewHolder(View itemView) {

        }
    }
}


