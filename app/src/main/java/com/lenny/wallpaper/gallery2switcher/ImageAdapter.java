package com.lenny.wallpaper.gallery2switcher;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by lenny on 2017/10/11.
 */

public class ImageAdapter extends BaseAdapter {
    private Context myContext;
    private int[] myImgaes;
    public  ImageAdapter(Context c, int[] Images ){
        this.myContext = c;
        this.myImgaes = Images;
    }

    @Override
    public int getCount() {
        return this.myImgaes.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView image = new ImageView(this.myContext);
        image.setImageResource(this.myImgaes[position]);
        image.setScaleType(ImageView.ScaleType.FIT_XY);
        image.setAdjustViewBounds(true);
        return image;
    }
}
