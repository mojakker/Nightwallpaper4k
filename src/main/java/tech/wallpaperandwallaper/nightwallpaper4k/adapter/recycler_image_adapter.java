package tech.wallpaperandwallaper.nightwallpaper4k.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.ArrayList;

import tech.wallpaperandwallaper.nightwallpaper4k.R;
import tech.wallpaperandwallaper.nightwallpaper4k.image_activity;
import tech.wallpaperandwallaper.nightwallpaper4k.recyler_items.item_image;
import tech.wallpaperandwallaper.nightwallpaper4k.tools.static_tools;

public class recycler_image_adapter  extends RecyclerView.Adapter<recycler_image_adapter.MyViewHolder> {

    private LayoutInflater inflater;
    private Activity ctx;
    private ArrayList<item_image> image_List;

    public recycler_image_adapter(Activity ctx, ArrayList<item_image> image_List) {

        inflater = LayoutInflater.from(ctx);
        this.ctx = ctx;
        this.image_List = image_List;
    }

    @Override
    public recycler_image_adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_image, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(final recycler_image_adapter.MyViewHolder holder, int position) {
       /* if (position % 2 != 0)
            holder.getView().setAnimation(AnimationUtils.loadAnimation(ctx, R.anim.left_to_right));
        else {
            holder.getView().setAnimation(AnimationUtils.loadAnimation(ctx, R.anim.right_to_left));

        }*/
        item_image item_obj = image_List.get(position);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ctx.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        holder.image_view.getLayoutParams().width = width / 2;
        holder.image_view.getLayoutParams().height = width / 2;
        final int sdk = android.os.Build.VERSION.SDK_INT;
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            holder.image_view.setBackgroundDrawable(ContextCompat.getDrawable(ctx, item_obj.getImage()));
        } else {
            holder.image_view.setBackground(ContextCompat.getDrawable(ctx, item_obj.getImage()));
        }


    }


    @Override
    public int getItemCount() {
        return image_List.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        View view;
        ImageView image_view;
        private CardView card_view;

        public MyViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            image_view = (ImageView) itemView.findViewById(R.id.iv_item_image);
            card_view = (CardView) itemView.findViewById(R.id.card_view);
            card_view.setOnClickListener(this);
        }

        // onClick Listener for view
        @Override
        public void onClick(View v) {
            int radio_position = getPosition();
            notifyDataSetChanged();
            switch (v.getId()) {

                case R.id.card_view: // code
                    Intent intent = new Intent(ctx, image_activity.class);
                    intent.putExtra("res", image_List.get(radio_position).getImage());
                    ctx.startActivity(intent);
                    new static_tools(ctx).overRideAnimationClose();
                    
            }

        }


        public View getView() {
            return view;
        }
    }


}


