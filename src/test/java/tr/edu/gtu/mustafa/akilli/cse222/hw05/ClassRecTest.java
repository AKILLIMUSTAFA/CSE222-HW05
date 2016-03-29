package tr.edu.gtu.mustafa.akilli.cse222.hw05;

import junit.framework.TestCase;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by MustafaMonster on 29.03.2016.
 */
public class ClassRecTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testSetList1() throws Exception {
        List<Integer> linkedListRec = new LinkedList<Integer>();
        List<Integer> sortedLinkedListRec = new LinkedList<Integer>();
        ClassRec<Integer> classRec = new ClassRec<Integer>();
        boolean result = true;

        /* Add Element linkedListRec */
        linkedListRec.add(1);
        linkedListRec.add(2);
        linkedListRec.add(3);
        linkedListRec.add(44);
        linkedListRec.add(0);
        linkedListRec.add(1);

        /* Add Element sortedLinkedListRec */
        sortedLinkedListRec.add(0);
        sortedLinkedListRec.add(1);
        sortedLinkedListRec.add(1);
        sortedLinkedListRec.add(2);
        sortedLinkedListRec.add(3);
        sortedLinkedListRec.add(44);

        /* Set List 1 from linkedListRec */
        classRec.setList1(linkedListRec);

        /* Check */
        for(int index =0;index<sortedLinkedListRec.size();++index){
            if(sortedLinkedListRec.get(index).compareTo((Integer) classRec.getList1().get(index)) != 0)
                result = false;
        }

        /* Control Point */
        assertEquals(true,result);
    }

    public void testSetList2() throws Exception {

        List<Integer> linkedListRec = new LinkedList<Integer>();
        List<Integer> sortedLinkedListRec = new LinkedList<Integer>();
        ClassRec<Integer> classRec = new ClassRec<Integer>();
        boolean result = true;

        /* Add Element linkedListRec */
        linkedListRec.add(1);
        linkedListRec.add(2);
        linkedListRec.add(3);
        linkedListRec.add(44);
        linkedListRec.add(0);
        linkedListRec.add(1);

        /* Add Element sortedLinkedListRec */
        sortedLinkedListRec.add(0);
        sortedLinkedListRec.add(1);
        sortedLinkedListRec.add(2);
        sortedLinkedListRec.add(1);
        sortedLinkedListRec.add(3);
        sortedLinkedListRec.add(44);

        /* Set List 2 from linkedListRec */
        classRec.setList2(linkedListRec);

        /* Check */
        for(int index =0;index<sortedLinkedListRec.size();++index){
            if(sortedLinkedListRec.get(index).compareTo((Integer) classRec.getList2().get(index)) != 0)
                result = false;
        }

        /* Control Point */
        assertEquals(false,result);
    }

    public void testIntersectionOfLists() throws Exception {

        List<Integer> linkedListRec = new LinkedList<Integer>();
        List<Integer> linkedListRec2 = new LinkedList<Integer>();
        List<Integer> expectedLinkedList = new LinkedList<Integer>();
        List<Integer> unexpectedLinkedList = new LinkedList<Integer>();
        List<Integer> sortedList;
        ClassRec<Integer> classRec = new ClassRec<Integer>();
        boolean result = true;

        /* Add Element linkedListRec */
        linkedListRec.add(1);
        linkedListRec.add(2);
        linkedListRec.add(3);
        linkedListRec.add(55);
        linkedListRec.add(0);
        linkedListRec.add(1);

        /* Add Element linkedListRec2 */
        linkedListRec2.add(0);
        linkedListRec2.add(1);
        linkedListRec2.add(84);
        linkedListRec2.add(2);
        linkedListRec2.add(3);
        linkedListRec2.add(44);

        /* Set List 1 from linkedListRec */
        classRec.setList1(linkedListRec);
        /* Set List 2 from linkedListRec2 */
        classRec.setList2(linkedListRec2);

        /* Add Element expectedLinkedList */
        expectedLinkedList.add(0);
        expectedLinkedList.add(1);
        expectedLinkedList.add(2);
        expectedLinkedList.add(3);

        /* Assignment sortedList intersection Of linkedListRec and linkedListRec2 */
        sortedList = classRec.intersectionOfLists();

        /* Check */
        for(int index =0; index < sortedList.size(); ++index){
            if(expectedLinkedList.get(index).compareTo(sortedList.get(index)) != 0)
                result = false;
        }

        /* Control Point */
        assertEquals(true,result);

         /* Add Element unexpectedLinkedList */
        unexpectedLinkedList.add(0);
        unexpectedLinkedList.add(5);
        unexpectedLinkedList.add(2);
        unexpectedLinkedList.add(3);

        /* Check */
        for(int index =0; index < sortedList.size(); ++index){
            if(unexpectedLinkedList.get(index).compareTo(sortedList.get(index)) != 0)
                result = false;
        }

        /* Control Point */
        assertEquals(false,result);
    }

    public void testUnionOfLists() throws Exception {

        List<Integer> linkedListRec = new LinkedList<Integer>();
        List<Integer> linkedListRec2 = new LinkedList<Integer>();
        List<Integer> expectedLinkedList = new LinkedList<Integer>();
        List<Integer> unexpectedLinkedList = new LinkedList<Integer>();
        List<Integer> unionList;
        ClassRec<Integer> classRec = new ClassRec<Integer>();
        boolean result = true;

        /* Add Element linkedListRec */
        linkedListRec.add(1);
        linkedListRec.add(2);
        linkedListRec.add(3);
        linkedListRec.add(55);
        linkedListRec.add(0);
        linkedListRec.add(1);

        /* Add Element linkedListRec2 */
        linkedListRec2.add(0);
        linkedListRec2.add(1);
        linkedListRec2.add(84);
        linkedListRec2.add(2);
        linkedListRec2.add(3);
        linkedListRec2.add(44);

        /* Set List 1 from linkedListRec */
        classRec.setList1(linkedListRec);
        /* Set List 2 from linkedListRec2 */
        classRec.setList2(linkedListRec2);

        /* Add Element expectedLinkedList */
        expectedLinkedList.add(0);
        expectedLinkedList.add(0);
        expectedLinkedList.add(1);
        expectedLinkedList.add(1);
        expectedLinkedList.add(1);
        expectedLinkedList.add(2);
        expectedLinkedList.add(2);
        expectedLinkedList.add(3);
        expectedLinkedList.add(3);
        expectedLinkedList.add(44);
        expectedLinkedList.add(55);
        expectedLinkedList.add(84);

        /* Assignment unionList intersection Of linkedListRec and linkedListRec2 */
        unionList = classRec.unionOfLists();

        /* Check */
        for(int index =0; index < unionList.size(); ++index){
            if(expectedLinkedList.get(index).compareTo(unionList.get(index)) != 0 )
                result = false;
        }

        /* Control Point */
        assertEquals(true,result);

         /* Add Element unexpectedLinkedList */
        unexpectedLinkedList.add(0);
        unexpectedLinkedList.add(5);
        unexpectedLinkedList.add(2);
        unexpectedLinkedList.add(3);

        /* Check */
        for(int index =0; index < unexpectedLinkedList.size(); ++index){
            if(unexpectedLinkedList.get(index).compareTo(unionList.get(index)) > 0)
                result = false;
        }

        /* Control Point */
        assertEquals(false,result);
    }

    public void testIsSubset() throws Exception {
        List<Integer> linkedListRec = new LinkedList<Integer>();
        List<Integer> subLinkedListRec = new LinkedList<Integer>();
        List<Integer> notSubLinkedListRec = new LinkedList<Integer>();
        List<Integer> unionList;
        ClassRec<Integer> classRec = new ClassRec<Integer>();
        boolean result = true;

        /* Add Element linkedListRec */
        linkedListRec.add(1);
        linkedListRec.add(2);
        linkedListRec.add(3);
        linkedListRec.add(55);
        linkedListRec.add(0);
        linkedListRec.add(4);

        /* Add Element linkedListRec2 */
        subLinkedListRec.add(1);
        subLinkedListRec.add(55);

        /* Set List 1 from linkedListRec */
        classRec.setList1(linkedListRec);
        /* Set List 2 from subLinkedListRec */
        classRec.setList2(subLinkedListRec);

        /* Control Point */
        assertEquals(true,classRec.isSubset());

        /* Add Element expectedLinkedList */
        notSubLinkedListRec.add(1);
        notSubLinkedListRec.add(1);
        notSubLinkedListRec.add(2);

        /* Set List 2 from notSubLinkedListRec */
        classRec.setList2(notSubLinkedListRec);

        /* Control Point */
        assertEquals(false,classRec.isSubset());
    }

    public void testHowManyContain() throws Exception {

        List<Integer> linkedListRec = new LinkedList<Integer>();
        ClassRec<Integer> classRec = new ClassRec<Integer>();
        boolean result;

        /* Add Element linkedListRec */
        linkedListRec.add(1);
        linkedListRec.add(2);
        linkedListRec.add(3);
        linkedListRec.add(44);
        linkedListRec.add(0);
        linkedListRec.add(1);

        /* Check */
        if( 2 == classRec.howManyContain(linkedListRec, 1))
            result = true;
        else
            result = false;

        /* Control Point */
        assertEquals(true,result);

        /* Check */
        if( 1 == classRec.howManyContain(linkedListRec, 2))
            result = true;
        else
            result = false;

        /* Control Point */
        assertEquals(true,result);
    }
}