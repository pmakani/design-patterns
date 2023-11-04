package org.owltech.structural.adapter;

public class ImageAdapter implements ImageViewer {

    private AdvanceImageViewer viewer;

    public ImageAdapter(String imageFormat) {
        if (imageFormat.equalsIgnoreCase("PNG")) {
            this.viewer = new PngShower();
        } else {
            this.viewer = new JpegShower();
        }
    }

    @Override
    public void show(String imageFormat, String fileName) {
        if (imageFormat.equalsIgnoreCase("PNG")) {
            this.viewer.showPng(fileName);
        } else {
            this.viewer.showJpeg(fileName);
        }
    }


}
