package com.l000phone.wen.liwushuo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;

/**
 * 项目名称：
 * 类描述：
 * 创建人：a.wen
 * 创建时间：2016/4/24
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class CropCornersTransformation implements Transformation<Bitmap> {

    private BitmapPool mBitmapPool;
    private int radius ;

    public CropCornersTransformation(Context context,int radius) {
        this(Glide.get(context).getBitmapPool());
        this.radius = radius;
    }

    public CropCornersTransformation(BitmapPool pool) {
        this.mBitmapPool = pool;
    }

    @Override
    public Resource<Bitmap> transform(Resource<Bitmap> resource, int outWidth, int outHeight) {
        Bitmap source = resource.get();
        int size = Math.min(source.getWidth(), source.getHeight());

        int width = (source.getWidth() - size) / 2;
        int height = (source.getHeight() - size) / 2;

        Bitmap bitmap = mBitmapPool.get(size, size, Bitmap.Config.ARGB_8888);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
        }

        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        BitmapShader shader =
                new BitmapShader(source, BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP);
        if (width != 0 || height != 0) {
            // source isn't square, move viewport to center
            Matrix matrix = new Matrix();
            matrix.setTranslate(-width, -height);
            shader.setLocalMatrix(matrix);
        }
        paint.setShader(shader);
        paint.setAntiAlias(true);

//        float r = size / 2f;
//        canvas.drawCircle(r, r, r, paint);


        RectF rectFLeft = new RectF(0f, 0f, source.getWidth(), source.getHeight());
        canvas.drawRoundRect(rectFLeft, radius, radius, paint);
//        RectF rectFRight = new RectF(0f, 0f, source.getWidth(), source.getHeight());
//        canvas.drawRoundRect(rectFRight, radius, radius, paint);

        return BitmapResource.obtain(bitmap, mBitmapPool);
    }

    @Override
    public String getId() {
        return "CropCornersTransformation()";
    }
}