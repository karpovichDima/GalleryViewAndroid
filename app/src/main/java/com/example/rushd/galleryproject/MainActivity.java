package com.example.rushd.galleryproject;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String image_urls[] = {
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.pethub.com/sites/default/files/dog-bath.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "https://www.petmd.com/sites/all/modules/breedopedia/images/thumbnails/dog/tn-american-eskimo-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
            "http://blogs.discovermagazine.com/discoblog/files/2013/03/angry-dog.jpg",
    };

    public static int width;
    public static int height;

    LinearLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setScreenSize();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.imagegallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<CreateList> createLists = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);
    }

    private void setScreenSize(){
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
    }

    private ArrayList<CreateList> prepareData(){

        ArrayList<CreateList> theimage = new ArrayList<>();
        for(int i = 0; i< image_urls.length; i++){
            CreateList createList = new CreateList();
            createList.setImageUrl(image_urls[i]);
            theimage.add(createList);
        }
        return theimage;
    }
}