package tech.wallpaperandwallaper.nightwallpaper4k.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import tech.wallpaperandwallaper.nightwallpaper4k.R;
import tech.wallpaperandwallaper.nightwallpaper4k.recyler_items.item_image;

public class recycler_image_adapter  extends RecyclerView.Adapter<recycler_image_adapter.MyViewHolder> {

    private LayoutInflater inflater;
    private Context ctx;
    private ArrayList<item_image> image_List;

    public recycler_image_adapter(Context ctx , ArrayList<item_image> image_List) {

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
        item_image item_obj = image_List.get(position);

        holder.image_view.setImageDrawable(item_obj.getImage());


    }

    @Override
    public int getItemCount() {
        return image_List.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView image_view;
        private CardView card_view;
        public MyViewHolder(View itemView) {
            super(itemView);

            image_view = (ImageView) itemView.findViewById(R.id.iv_item_image);
            image_view.setOnClickListener(this);
        }

        // onClick Listener for view
        @Override
        public void onClick(View v) {
           int radio_position = getPosition();
            notifyDataSetChanged();
            switch (v.getId()){

                case R.id.iv_item_image : // code


            }

        }


        }
    }




