package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {

    private TextView txtBookName, txtAuthorName, txtNumberOfPages, txtDescription;
    private Button btnAddToCurrentlyReading, btnAddToWantToReadList, btnAddToAlreadyRead, btnAddToFavorites;
    private ImageView imgBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();

        Book book = new Book(1, "1Q84", "Haruki Murakami", 1350,
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1483103331l/10357575.jpg",
                "A work of maddening brilliance", "Long Description");
        setData(book);
    }

    private void setData(Book book){
        txtBookName.setText(book.getName());
        txtAuthorName.setText(book.getAuthor());
        txtNumberOfPages.setText(String.valueOf(book.getPages()));
        txtDescription.setText(book.getLongDesc());
        Glide.with(this).asBitmap().load(book.getImageUrl()).into(imgBook);
    }

    private void initViews() {
        txtBookName = findViewById(R.id.txtBookName);
        txtAuthorName = findViewById(R.id.txtAuthorName);
        txtNumberOfPages = findViewById(R.id.txtNumberOfPages);
        txtDescription = findViewById(R.id.txtDescription);

        btnAddToCurrentlyReading = findViewById(R.id.btnAddToCurrentlyReading);
        btnAddToWantToReadList = findViewById(R.id.btnAddToWantToReadList);
        btnAddToAlreadyRead = findViewById(R.id.btnAddToAlreadyRead);
        btnAddToFavorites = findViewById(R.id.btnAddToFavorites);

        imgBook = findViewById(R.id.imgBook);
    }
}