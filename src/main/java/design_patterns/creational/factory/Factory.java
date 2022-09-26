package design_patterns.creational.factory;

import java.util.Objects;

public class Factory {

    public OS getInstance(String str){
        if (Objects.equals(str, "Open")){
            return new Android();
        }else if (Objects.equals(str, "Close")){
            return new IOS();
        }else {
            return null;
        }
    }
}
