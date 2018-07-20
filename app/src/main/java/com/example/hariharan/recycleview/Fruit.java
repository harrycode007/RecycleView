package com.example.hariharan.recycleview;

public class Fruit {

    private String fruitName;
    private int imageId;


    public Fruit(String fruitName , int imageId){
        this.fruitName = fruitName;
        this.imageId = imageId;
    }

    public String getFruitName(){
        return this.fruitName;
    }

    public int getImageId(){
        return this.imageId;
    }


}
