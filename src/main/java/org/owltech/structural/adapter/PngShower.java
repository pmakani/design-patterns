package org.owltech.structural.adapter;

public class PngShower implements AdvanceImageViewer {
    @Override
    public void showPng(String fileName) {
        System.out.println("Showing PNG file: " + fileName);
    }

    @Override
    public void showJpeg(String fileName) {

    }
}
