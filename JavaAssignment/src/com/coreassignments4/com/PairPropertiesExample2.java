package com.coreassignments4.com;

import java.util.*;

public class PairPropertiesExample2 {
	private String key;
    private Date value;

    public void setKey(String key) {
        if( key instanceof String)
            this.key = key;
    }

    public void setValue(Date value) {
        if( value instanceof Date)
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
