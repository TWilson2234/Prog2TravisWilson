package com.company;

public class DebugBox
{
    private int width = 5;
    private int length = 10;
    private int height = 20;

    private void FixDebugBox()
    {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox()
    {
        width = width;
        length = length;
        height = height;
    }
    public void showData()
    {
        System.out.println("Width: "  + width + "  Length: " +
        length + "  Height: " + height);
    }
    public double getVolume()
    {
        double vol = (length + width + height);
        return vol;
    }
}