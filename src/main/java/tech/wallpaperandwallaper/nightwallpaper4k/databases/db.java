package tech.wallpaperandwallaper.nightwallpaper4k.databases;

import java.util.ArrayList;

import tech.wallpaperandwallaper.nightwallpaper4k.R;
import tech.wallpaperandwallaper.nightwallpaper4k.recyler_items.item_image;

public class db {
    public static int myImageRes[] ={
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,



    };
    public static ArrayList<item_image> getImageArrayList(){
        ArrayList<item_image> myList = new ArrayList<>();
        for(int obj : myImageRes){
            item_image new_obj = new item_image();
            new_obj.setImage(obj);
            myList.add(new_obj);
        }
        return myList;
    }

}
