package com.coreassignments4.com;

public class PairPropertiesExample {

    private String key;
    private String value;

    public void setKey(String key) {
        if( key instanceof String)
            this.key = key;
    }

    public void setValue(String value) {
        if( value instanceof String)
            this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
