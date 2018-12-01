package tech.wallpaperandwallaper.nightwallpaper4k.tools;

import android.app.Activity;

import tech.wallpaperandwallaper.nightwallpaper4k.R;


public class static_tools {
    Activity activity;
    public static_tools(Activity activity){
        this.activity = activity;
    }
    public void overRideAnimationOpen(){
        activity.overridePendingTransition(R.anim.left_to_right ,R.anim.left_out);
    }

    public void overRideAnimationClose(){
        activity.overridePendingTransition(R.anim.right_to_left ,R.anim.right_out);
    }
    public void fadeAnimation(){
        activity.overridePendingTransition(R.anim.slide_in_up ,R.anim.slide_out_up);

    }

}
