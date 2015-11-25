package com.eyeem.decorator.sample;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.eyeem.decorator.annotation.Decorate;

import java.util.List;

/**
 * Created by budius on 21.07.15.
 */
public class DecoratedView extends FrameLayout {

   @Override
   @Decorate
   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
   }

   @Override
   @Decorate
   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
   }

   @Override
   @Decorate
   protected void onSizeChanged(int w, int h, int oldw, int oldh) {
      super.onSizeChanged(w, h, oldw, oldh);
   }

   public DecoratedView(Context context) {
      super(context);
   }

   public DecoratedView(Context context, AttributeSet attrs) {
      super(context, attrs);
   }

   public DecoratedView(Context context, AttributeSet attrs, int defStyleAttr) {
      super(context, attrs, defStyleAttr);
   }

   @TargetApi(Build.VERSION_CODES.LOLLIPOP)
   public DecoratedView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
      super(context, attrs, defStyleAttr, defStyleRes);
   }

   @Decorate
   public interface TestInterface {
      public void method1();

      public List method2(String val);

      public boolean method3(String val);
   }

   @Decorate
   @Override protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
      super.onLayout(changed, left, top, right, bottom);
   }

   @Decorate
   public boolean blahBlahBlag(String val) {
      return false;
   }

   @Decorate
   public List<String> getListOfUsers(String val, int val2) {
      return null;
   }
}