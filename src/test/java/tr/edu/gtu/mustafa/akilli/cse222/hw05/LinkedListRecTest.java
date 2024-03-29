package tr.edu.gtu.mustafa.akilli.cse222.hw05;

import junit.framework.TestCase;

/**
 * HW05_131044017_Mustafa_Akilli
 *
 * File:   LinkedListRecTest
 *
 * Description:
 *
 * Junit Tests for LinkedListRec
 *
 * @author Mustafa_Akilli
 * @since Sunday 30 March 2016 by Mustafa_Akilli
 */
public class LinkedListRecTest extends TestCase {

    public void testRemove() throws Exception {
        LinkedListRec<Integer> linkedListRec = new LinkedListRec<Integer>();
        LinkedListRec<Integer> expectedLinkedListRec = new LinkedListRec<Integer>();
        boolean result = false;

        /* Add Element linkedListRec */
        linkedListRec.add(6);
        linkedListRec.add(3);
        linkedListRec.add(7);
        linkedListRec.add(8);
        linkedListRec.add(6);
        linkedListRec.add(2);
        linkedListRec.add(6);

        /* Add Element expectedLinkedListRec */
        expectedLinkedListRec.add(3);
        expectedLinkedListRec.add(7);
        expectedLinkedListRec.add(8);
        expectedLinkedListRec.add(2);

        /* Remove 6 Element in linkedListRec */
        linkedListRec.remove(6);

        /* Check */
        if(linkedListRec.toString().compareTo(expectedLinkedListRec.toString()) == 0)
                result = true;

        /* Control Point */
        assertEquals(true,result);
    }
}