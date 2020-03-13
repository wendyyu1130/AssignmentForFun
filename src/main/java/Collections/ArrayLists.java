package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> newList = new ArrayList(list1);
        newList.addAll(list2);
        return newList;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> newList = new ArrayList(list1);
        newList.addAll(list2);
        int a = 0;
        for (int i = 0; i < newList.size(); i++) {
            a = newList.get(i) + a;
        }
        return a;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> remove_list = new ArrayList<Integer>();
        remove_list.add(toRemove);
        original.removeAll(remove_list);
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        for(int i = 1; i < original.size(); i++){
            ArrayList<Character> lastChars = characterArrayListMaker(original.get(i-1));
            ArrayList<Character> currentChars = characterArrayListMaker(original.get(i));
            boolean compareFlag = false;
            for(Character last : lastChars){
                for(Character current : currentChars){
                    if (last.equals(current)){
                        compareFlag = true;
                    }
                }
            }
            if(!compareFlag){
                return false;
            }
        }
        return true;
    }

    private ArrayList<Character> characterArrayListMaker(String s) {
        ArrayList<Character> result = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++){
            result.add(s.charAt(i));
        }
        return result;
    }
}
