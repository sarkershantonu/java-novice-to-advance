package org.practice.example.app;

public class Calculator {

    public <T extends Number> T add(T first, T second){

            if (first.getClass().equals(Long.class)){
                return (T) (Long)(first.longValue() + second.longValue());
            }else if (first.getClass().equals(Integer.class)){
                return (T) (Integer)(first.intValue() + second.intValue());
            }else if (first.getClass().equals(Short.class)){
                return (T) (Short)((short)(first.shortValue() + second.shortValue()));
            }else if (first.getClass().equals(Integer.class)){
                return (T) (Byte)((byte)(first.byteValue() + second.byteValue()));
            }else if (first.getClass().equals(Double.class)){
                return (T) (Double)(first.doubleValue() + second.doubleValue());
            }else if (first.getClass().equals(Float.class)){
                return (T) (Float)(first.floatValue() + second.floatValue());
            }else {
                return null;
            }
    }
}
