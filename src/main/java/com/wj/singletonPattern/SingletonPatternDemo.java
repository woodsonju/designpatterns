package com.wj.singletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        /*
            Illegal construct
            Compile Time Error : The constructor SingleObject() is not visible
            SingleObject object = new SingleObject();
         */
        
        //Get the only objet available
        SingleObject objet1 = SingleObject.getInstance();
        SingleObject objet2 = SingleObject.getInstance();


        //show message
        objet1.showMessage();

        System.out.println(objet1==objet2);
    }
}
