package com.example.cardview.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.adapter.PostAdapter;
import com.example.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPost;
    private List<Post> post = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPost = findViewById(R.id.recyclerPost);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPost.setLayoutManager(layoutManager);

        this.processingPost();
        PostAdapter adapter = new PostAdapter(post);
        recyclerPost.setAdapter(adapter);
    }

    public void processingPost() {
        Post p = new Post("Ahmad Raza", "#tbt cool trip", R.drawable.imagem1);
        this.post.add(p);

        p = new Post("John Doe", "#Paris!!", R.drawable.imagem2);
        post.add(p);

        p = new Post("Jane", "#What a beautiful picture!", R.drawable.imagem3);
        post.add(p);

        p = new Post("Sara Smith", "#Travel take advantage of our discounts!", R.drawable.imagem4);
        post.add(p);

    }
}