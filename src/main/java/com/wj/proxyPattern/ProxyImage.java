package com.wj.proxyPattern;

/**
 * Proxy: permettant d'acceder aux données de Image
 */
public class ProxyImage implements Image {
  
    private RealImage realImage;
    private String fileName;
    
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }


    public void display() {
        if(realImage == null)
            realImage = new RealImage(fileName);
        realImage.display();
    }
}
