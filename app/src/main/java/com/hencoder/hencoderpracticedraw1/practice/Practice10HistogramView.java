package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class Practice10HistogramView extends View {
    private  int itemPadding = 20 ;
    private Paint linePaint;
    private ArrayList<Integer> datas= new ArrayList<>();
    private ArrayList<String> names= new ArrayList<>();
    private int itemWidth;

    public Practice10HistogramView(Context context) {
        this(context,null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        linePaint.setColor(Color.WHITE);
        datas.add(0);
        datas.add(50);
        datas.add(60);
        datas.add(120);
        datas.add(30);
        datas.add(360);
        datas.add(200);
        names.add("Froyo");
        names.add("GB");
        names.add("ICS");
        names.add("JB");
        names.add("KitKat");
        names.add("L");
        names.add("M");
        itemWidth = 500/(datas.size()+1);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.scale(1f,-1f);
        canvas.translate(0,-100);
        canvas.drawRect(100,100,200,200,linePaint);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawLine(100,50,100,450,linePaint);
        canvas.drawLine(100,450,600,450,linePaint);

        int totalNum = 0;
        for (int i = 0; i < datas.size(); i++) {
            Integer integer = datas.get(i);
            totalNum += integer;
        }

        for (int i = 0; i < datas.size(); i++) {
            Integer integer = datas.get(i);
            int itemPrecent= integer *100/totalNum ;
            int startX = (i +1) *itemPadding + i* itemWidth;
            int endX  = startX+itemWidth;

           // canvas.drawRect(startX,);

        }



    }
}
