package tech.wallpaperandwallaper.nightwallpaper4k;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

import tech.wallpaperandwallaper.nightwallpaper4k.tools.static_tools;

public class image_activity extends Activity {


    ImageView myImage;
    int url ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_image);

        url = getIntent().getIntExtra("res", R.drawable.ic_launcher);

        myImage = findViewById(R.id.myImage);
        final int sdk = android.os.Build.VERSION.SDK_INT;

        if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            myImage.setBackgroundDrawable(ContextCompat.getDrawable(this, url) );
        } else {
            myImage.setBackground(ContextCompat.getDrawable(this,url));
        }

        /*
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(myImage);
*/
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        new static_tools(this).overRideAnimationClose();
    }
}
