package com.example.tubes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

public class fragmentHome extends FragmentActivity {

    private static final int NUM_PAGES=3;
    private ViewPager2 viewPager2;
    private FragmentStateAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_home);

        viewPager2=findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePageAdapter(this);
        viewPager2.setAdapter(pagerAdapter);
//        kode ini untuk animasi ketika di slide
//        viewPager2.setPageTransformer(new ZoomPageTransformer());
    }
    private class ScreenSlidePageAdapter extends FragmentStateAdapter {
        public ScreenSlidePageAdapter(fragmentHome fragmentHome) {
            super(fragmentHome);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0 :
                    return new fragment1();
                case 1 :
                    return new fragment2();
                case 2 :
                    return new fragment3();
                default:
                    return null;
            }
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
// lanjutannya, klw di swipe dia ba animasi :)

//    private class ZoomPageTransformer implements ViewPager2.PageTransformer {
//        private static final float MIN_SCALE=0.85f;
//        private static final float MIN_ALPHA=0.5f;
//
//        @Override
//        public void transformPage(@NonNull View page, float position) {
//            int pagewidth = page.getWidth();
//            int pageHeight = page.getHeight();
//            if (position<-1){
//                page.setAlpha(0f);
//            }
//            else if (position <=1){
//                float scaleFactor=Math.max(MIN_SCALE,1-Math.abs(position));
//                float vertMargin=pageHeight*(1-scaleFactor)/2;
//                float horzMargin=pagewidth*(1-scaleFactor)/2;
//
//                if (position<0){
//                    page.setTranslationX(horzMargin-vertMargin/2);
//                }else {
//                    page.setTranslationX(-horzMargin+vertMargin/2);
//                }
//                page.setScaleX(scaleFactor);
//                page.setScaleY(scaleFactor);
//                page.setAlpha(MIN_ALPHA+(scaleFactor-MIN_SCALE)/(1-MIN_SCALE)*(1-MIN_SCALE));
//            }
//            else{
//                page.setAlpha(0f);
//            }
//        }
//    }

}