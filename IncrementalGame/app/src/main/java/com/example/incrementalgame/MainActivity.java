package com.example.incrementalgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private int axeLevel = 1;
    private int numOfWood = 0;
    private  int woodSellerLevel = 0;
    private int numOfMoney = 0;

    private TextView numOfWoodText;
    private  TextView numOfMoenyText;
    private Button cutDownButton;
    private Button upgradeAxe;
    private Button woodSeller;
    private ImageView axeImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numOfWoodText = (TextView)findViewById(R.id.numOfWood);
        cutDownButton = (Button)findViewById(R.id.cutDownButton);
        upgradeAxe = (Button)findViewById(R.id.upgradeAxe);
        axeImage = (ImageView)findViewById(R.id.axeImage);
        numOfMoenyText = (TextView)findViewById(R.id.numOfMoney);
        woodSeller = (Button)findViewById(R.id.woodSeller);

        cutDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOfWood+=axeLevel;
                numOfWoodText.setText("# Wood : "+String.valueOf(numOfWood));
            }
        });


        upgradeAxe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numOfWood >= 50*axeLevel){
                    // data upgrade
                    numOfWood -= 50* axeLevel;
                    axeLevel++;

                    //ui upgrade
                    numOfWoodText.setText("# Wood: "+ String.valueOf(numOfWood));
                    if (axeLevel ==2){
                        Resources res = getResources();
                        Drawable drawable = ResourcesCompat.getDrawable(res,R.drawable.axe2,null);
                        axeImage.setImageDrawable(drawable);
                    }
                    else if (axeLevel ==3){
                        Resources res = getResources();
                        Drawable drawable = ResourcesCompat.getDrawable(res,R.drawable.axe3,null);
                        axeImage.setImageDrawable(drawable);
                    }
                    else if (axeLevel ==4){
                        Resources res = getResources();
                        Drawable drawable = ResourcesCompat.getDrawable(res,R.drawable.axe4,null);
                        axeImage.setImageDrawable(drawable);
                    }
                    else if (axeLevel ==5){
                        Resources res = getResources();
                        Drawable drawable = ResourcesCompat.getDrawable(res,R.drawable.axe5,null);
                        axeImage.setImageDrawable(drawable);
                    }
                    else{
                        Resources res = getResources();
                        Drawable drawable = ResourcesCompat.getDrawable(res,R.drawable.axe6,null);
                        axeImage.setImageDrawable(drawable);
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"Not enough",Toast.LENGTH_SHORT).show();
                }
            }
        });

        woodSeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOfWood>=100){
                    numOfWood -= 100;
                    woodSellerLevel++;

                    // Timer 시작 제일 중요
                    // 1초에 하나씩 팔아서 돈 벌어줘야 하니까

                    //timer가 handler갖고 있어야함
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            if(numOfWood>0){
                                numOfWood--;
                                numOfMoney+=woodSellerLevel;

                                MainActivity.this.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        numOfWoodText.setText("# Wood : "+numOfWood);
                                        numOfMoenyText.setText("# Money : "+numOfMoney);
                                    }
                                });
                            }
                        }
                    },0,1000);
                    numOfWoodText.setText("# Wood :"+numOfWood);
                    woodSeller.setText("UPGRADE SELLER");
                }else{
                    Toast.makeText(MainActivity.this,"Not enough",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
