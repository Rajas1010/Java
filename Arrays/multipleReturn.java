import java.util.*;
public class multipleReturn {
    public static void main(String[] args) 
    {
        ReturnValue result = getValues();
        String stringValue = result.getStringValue();
        Integer integerValue = result.getIntegerValue();
        int[] arrayValue = result.getArrayValue();

        System.out.println("String value: " + stringValue);
        System.out.println("Integer value: " + integerValue);
        System.out.print("Array values: "+ Arrays.toString(arrayValue));
       
    }

    public static ReturnValue getValues() {
        String stringValue = "Hello";
        Integer integerValue = 42;
        int[] arrayValue = {1, 2, 3, 4, 5};

        return new ReturnValue(stringValue, integerValue, arrayValue);
    }

    public static class ReturnValue {
        private String stringValue;
        private Integer integerValue;
        private int[] arrayValue;

        public ReturnValue(String stringValue, Integer integerValue, int[] arrayValue) {
            this.stringValue = stringValue;
            this.integerValue = integerValue;
            this.arrayValue = arrayValue;
        }

        public String getStringValue() {
            return stringValue;
        }

        public Integer getIntegerValue() {
            return integerValue;
        }

        public int[] getArrayValue() {
            return arrayValue;
        }
    }
}
