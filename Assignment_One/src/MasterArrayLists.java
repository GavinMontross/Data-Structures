import java.util.*;
public class MasterArrayLists {

    public static boolean unique(List<?> list){
        List<Object> seen = new ArrayList<>();
        for (int i = 0; i < list.size(); i ++){
            if(seen.contains(list.get(i))){
                return false;
            }
            seen.add(list.get(i));

        }
        return true;
    }
    public static List<Integer> allMultiples(List<Integer> list, int target){
        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i ++){
            if(list.get(i) % target == 0){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
    public static List<String> allStringsOfSize(List<String> list, int length){
        List<String> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i ++){
            if(list.get(i).length() == length){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
    public static boolean isPermutation(List<?> one, List<?> two){
        one.sort(null);
        two.sort(null);
        return one.equals(two);
    }
    public static List<String> tokenize(String input){
        List<String> list = new ArrayList<>();
        for(String word : input.split(" ")){
            list.add(word);
        }
        return list;
    }
    public static List<Integer> removeAll(List<Integer> list, int num){
        List<Integer> newList = new ArrayList();
        for (int i = 0; i < list.size(); i ++){
            if (list.get(i) != num){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
