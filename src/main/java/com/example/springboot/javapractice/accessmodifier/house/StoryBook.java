package com.example.springboot.javapractice.accessmodifier.house;


import com.example.springboot.javapractice.accessmodifier.library.Book;

public class StoryBook extends Book {
    public StoryBook(){
        modifyTemplate();
        Book book=new Book();
    }
}
