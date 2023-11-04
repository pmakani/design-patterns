package org.owltech.structural.adapter;

public class GalleryApp implements ImageViewer {

    private ImageAdapter adapter;

    @Override
    public void show(String imageFormat, String fileName) {
        if (imageFormat.equalsIgnoreCase("JPEG")) {
            System.out.println("Showing JPEG file : " + fileName);
        } else if (imageFormat.equalsIgnoreCase("PNG") || imageFormat.equalsIgnoreCase("JPG")) {
            adapter = new ImageAdapter(imageFormat);
            adapter.show(imageFormat, fileName);
        } else {
            System.out.println("FileFormat not supported : " + fileName);
        }
    }
}
