package com.example.customdrawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MyCircle extends View {
    Map<String, Float> data = new HashMap<>();
    private int mNumCircles = 5;
    private Paint mPaint;
    private Random mRandom;
    private float barWidth= 60f;
    private float barSpace = 40f;
    int count =0;
    public MyCircle(Context context, AttributeSet attrs) {
        super(context, attrs);

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mRandom = new Random();

        data.put("A",0.20f);
        data.put("A-",0.12f);
        data.put("B",0.80f);
        data.put("B-", 0.9f);
        data.put("F", 0.1f);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.BLUE);
        float sw = canvas.getWidth();
        float sh = canvas.getHeight();
        canvas.drawARGB(255,255,255,0);

        canvas.drawLine(20,sh*7/8f,sw-20,sh*7/8f, mPaint);
        canvas.drawLine(sw*1/8f,0,sw*1/8f,sh,mPaint);
        mPaint.setTextSize(50);
        data.forEach((key, value)->{
            mPaint.setColor(Color.RED);
            canvas.drawRect(sw/8+count*(barWidth+barSpace),sh*(7/8f-(float) value),sw/8 + barWidth+count*(barWidth+barSpace),sh*7/8f,mPaint);
            mPaint.setColor(Color.GREEN);
            canvas.drawText(key,sw/8+15+count*(barWidth+barSpace),7*sh/8+80,mPaint );
            count++;
        });

//        mPaint.setColor(Color.RED);
//        canvas.drawRect(sw/8+0*(barWidth+barSpace),sh*(7/8f-(float) data.get("A")),sw/8 + barWidth+0*(barWidth+barSpace),sh*7/8f,mPaint);
//
//        mPaint.setColor(Color.GREEN);
//        canvas.drawRect(sw/8+1*(barWidth+barSpace),sh*(7/8f-(float) data.get("A-")),sw/8 + barWidth+1*(barWidth+barSpace),sh*7/8f,mPaint);
//
//        mPaint.setColor(Color.CYAN);
//        canvas.drawRect(sw/8+2*(barWidth+barSpace),sh*(7/8f-(float) data.get("F")),sw/8 + barWidth+2*(barWidth+barSpace),sh*7/8f,mPaint);


//        for (int c = 0; c < mNumCircles; c++) {
//            int randomColor = Color.argb(150, mRandom.nextInt(256),
//                    mRandom.nextInt(256), mRandom.nextInt(256));
//            mPaint.setColor(randomColor);
//            float centerX = mRandom.nextInt(getWidth());
//            float centerY = mRandom.nextInt(getHeight());
//            float radius = mRandom.nextInt(200) + 100;
//            canvas.drawCircle(centerX, centerY, radius, mPaint);
//        }
    }
}
