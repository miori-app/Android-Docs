package com.appprogramming.drawgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.Button;

public class MyButton extends androidx.appcompat.widget.AppCompatButton {
    public MyButton(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        // 기존의 button이 그려지는 행동을 그대로 수행
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        canvas.drawRect(100,300,700,700,paint);

    }
}
