package tr.edu.gtu.mustafa.akilli.cse222.hw05;

import java.util.*;

/**
 * HW05_131044017_Mustafa_Akilli
 *
 * File:   ClassRec
 *
 * Description:
 *
 * ClassRec have a 2 sorted list
 * ClassRec have a 3 important method about this 2 list
 *
 * @author Mustafa_Akilli
 * @since Sunday 28 March 2016 by Mustafa_Akilli
 */
public class ClassRec<E extends Comparable<E>>{

    private List<E> list1; /* First Sorted List */
    private List<E> list2; /* Second Sorted List */

    public ClassRec(){
        setList1();
        setList2();
    }

    /**
     * Get List1
     *
     * @return list1
     */
    public List getList1() {return list1;}

    /**
     * Sort newList1 and Set List1 given newList1
     *
     * @param newList1
     */
    public void setList1(List newList1) {this.list1 = sortList(newList1);}

    /**
     * set List1 new ArrayList
     */
    private void setList1() {this.list1 = new ArrayList();}

    /**
     * Get List2
     *
     * @return
     */
    public List getList2() {return list2;}

    /**
     * Sort newList2 and Set List2 given newList2
     *
     * @param newList2
     */
    public void setList2(List newList2) {this.list2 = sortList(newList2);}

    /**
     * set List2 new ArrayList
     */
    private void setList2() {this.list2 = new ArrayList();}

    /**
     * Sorts and returns list
     *
     * @param collection
     * @return increasing list
     * @throws if List is Null then throw NullPointerException
     */
    public List<E> sortList(Collection<? extends E> collection) throws NullPointerException{

        LinkedList<E> increasingSortedList = new LinkedList<E>(); /*SortsList*/
        Iterator<E> iterCollection = (Iterator<E>) collection.iterator(); /*Iterator */

        if(collection == null){
            throw new NullPointerException();
        }

        /*Appends all of the elements in the collection*/
        while(iterCollection.hasNext())
            increasingSortedList.add(iterCollection.next());

        boolean swapped;
        do {
            swapped = false;
            for (int index =0; index<=  increasingSortedList.size()-2; ++index) {
                if (increasingSortedList.get(index).compareTo(increasingSortedList.get(index+1)) > 0) {
                    //test whether the two elements are in the wrong order
                    E temp = increasingSortedList.get(index);
                    E temp_oth = increasingSortedList.get(index+1);

                    increasingSortedList.remove(index);
                    increasingSortedList.remove(index);

                    increasingSortedList.add(index,temp);
                    increasingSortedList.add(index,temp_oth);
                    swapped = true;
                }
            }
            if (!swapped) {
                //we can exit the outer loop here if no swaps occurred.
                break;
            }
            swapped = false;
            for (int index= increasingSortedList.size()-2; index>=0 ; --index) {
                if (increasingSortedList.get(index).compareTo(increasingSortedList.get(index+1)) > 0) {
                    E temp = increasingSortedList.get(index);
                    E temp_oth = increasingSortedList.get(index+1);

                    increasingSortedList.remove(index);
                    increasingSortedList.remove(index);

                    increasingSortedList.add(index,temp);
                    increasingSortedList.add(index,temp_oth);
                    swapped = true;
                }
            }
            //if no elements have been swapped, then the list is sorted
        } while (swapped);

        return increasingSortedList;
    }//end method sortList

    /**
     * Get List1 To String
     *
     * @return List1 To String
     */
    public String list1ToString(){
        StringBuilder list1String = new StringBuilder();
        for(int index =0; index < getList1().size(); ++index){
            list1String.append(getList1().get(index));
            if(index+1 < getList1().size())
                list1String.append(",");
        }

        return list1String.toString();
    }//end list1ToString method

    /**
     * Get List2 To String
     *
     * @return List2 To String
     */
    public String list2ToString(){
        StringBuilder list2String = new StringBuilder();
        for(int index =0; index < getList2().size(); ++index){
            list2String.append(getList2().get(index));
            if(index+1 < getList2().size())
                list2String.append(",");
        }

        return list2String.toString();
    }//end list2ToString method

    /**
     * Recursive method for Intersection Of Lists
     *
     * @return intersection set as a list of list1 and list 2
     * @throws EmptyListException if list1 or list2 are empty
     */
    public List<E> intersectionOfLists() throws EmptyListException{
        if(getList1().size() == 0 || getList2().size() == 0)
            throw new EmptyListException();

        return intersectionOfLists(getList1().size()-1,getList2().size()-1);/* returns intersection list */
    }

    /**
     * Recursive method for Intersection Of Lists
     *
     * @param indexOfList1 index of List1
     * @param indexOfList2 index of List2
     * @return intersection set as a list of list1 and list 2
     */
    private List<E> intersectionOfLists(int indexOfList1, int indexOfList2){

        List<E> intersectionList = new LinkedList<E>(); /*IntersectList*/

        /* End of the lists */
        if(indexOfList1<0 && indexOfList2<0){
            return intersectionList;
        }

        else{
            /* Go until end of the list 1 */
            if(indexOfList1 >= 0){
                intersectionList = intersectionOfLists(indexOfList1-1,indexOfList2);/* Recursive call */
                E temp = (E) getList1().get(indexOfList1);
                if(!intersectionList.contains(temp))
                    if(getList1().contains(temp))
                        if(getList2().contains(temp))
                            intersectionList.add(temp);/* Add element if intersection */
                return intersectionList; /* returns intersection list */
            }

            /* Go until end of the list 2 */
            else if (indexOfList1 < 0){
                /* Recursive call */
                intersectionList = intersectionOfLists(indexOfList1,indexOfList2-1);
                E temp = (E) getList2().get(indexOfList2);
                if(!intersectionList.contains(temp))
                    if(getList1().contains(temp))
                        if(getList2().contains(temp))
                            intersectionList.add(temp); /* Add element if intersection */
                return intersectionList; /* returns intersection list */
            }

            return intersectionList; /* returns intersection list */
        }
    }

    /**
     * Union Of Lists
     *
     * @return union set as a list of list1 and list 2
     * @throws EmptyListException if list1 or list2 are empty
     */
    public List<E> unionOfLists() throws EmptyListException{

        if(getList1().size() == 0 && getList2().size() == 0)
            throw new EmptyListException();

        return sortList(unionOfLists(getList1().size()-1,getList2().size()-1));/* returns intersection list */
    }

    /**
     * Recursive method for Union Of Lists
     *
     * @return union set as a list of list1 and list 2
     */
    private List<E> unionOfLists(int indexOfList1, int indexOfList2){

        List<E> unionList = new LinkedList<E>(); /*unionList*/

        /* End of the lists */
        if(indexOfList1<0 && indexOfList2<0){
            return unionList;
        }

        else{
            /* Go until end of the list 1 */
            if(indexOfList1 >= 0){
                unionList = unionOfLists(indexOfList1-1,indexOfList2); /* Recursive call */
                unionList.add((E) getList1().get(indexOfList1));/* Add element */
                return unionList; /* returns unionList */
            }

             /* Go until end of the list 2 */
            else if (indexOfList1 < 0){
                unionList = unionOfLists(indexOfList1,indexOfList2-1); /* Recursive call */
                unionList.add((E) getList2().get(indexOfList2)); /* Add element */
                return unionList;/* returns unionList */
            }

            return unionList;/* returns unionList */
        }
    }

    /**
     * is list2 subset of list1
     *
     * @return true if list2 is subset of list1
     * @throws EmptyListException if list1 or list2 are empty
     */
    public boolean isSubset() throws EmptyListException{

        if(getList1().size() == 0 && getList2().size() == 0)
            throw new EmptyListException();

        return isSubset(getList2().size()-1);
    }

    /**
     * Recursive method for is list2 subset of list1
     *
     * @param secondListIndex
     * @return true if list2 is subset of list1
     */
    private boolean isSubset(int secondListIndex){

        if(secondListIndex < 0 ){
            return true;
        }
        else{

            if(isSubset(secondListIndex-1) == false )
                return false;

            if(getList1().contains(getList2().get(secondListIndex))){
                if(howManyContain(getList1(), (E) getList2().get(secondListIndex)) >= howManyContain(getList2(), (E) getList2().get(secondListIndex)) )
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
    }

    /**
     * Recursive method for how Many Contain
     *
     * @param list element will searc in this list
     * @param element searched element
     * @return how Many times used element in the given list
     */
    public int howManyContain(List<E> list, E element){
        if(list.size() == 0){
            return 0;
        }
        else{
            if(list.get(0).compareTo(element) == 0)
                return 1 + howManyContain(list.subList(1,list.size()), element);

            else
                return howManyContain(list.subList(1,list.size()), element);
        }

    }

}
