package org.owltech.structural.adapter;

public class JpegShower implements AdvanceImageViewer {
    @Override
    public void showPng(String fileName) {

    }

    @Override
    public void showJpeg(String fileName) {
        System.out.println("Showing JPEG file: " + fileName);
    }
}
