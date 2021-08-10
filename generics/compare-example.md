# Understanding Generics Problem 

### Without Generics 

```
public class CollectionUtilities {
    public static List<String> getOnlyNewItems(List<String> itemsFromFirstList, List<String> itemsFromSecondList) {
        List<String> result = new ArrayList<>();
        for(String first : itemsFromSecondList){
            for(String second : itemsFromFirstList){
                if(!first.equals(second)){
                    result.add(first);
                }
            }
        }
        return result;
    }
}
```

### with Generics 
  
```
public class CollectionUtilities {  
  public static <T extends Comparable<T>> List<T> getNewItems(List<T> itemsFromFirstList, List<T> itemsFromSecondList) {
        List<T> result = new ArrayList<>();
        for(T first : itemsFromSecondList){
            for(T second : itemsFromFirstList){
                if(!first.equals(second)){
                    result.add(first);
                }
            }
        }
        return result;
    }
}
```

### Benifits : 
  1. Can be used in any kind of list
  2. Can be used to compare any object have ```equals()``` method implemented ( is comparable) 
