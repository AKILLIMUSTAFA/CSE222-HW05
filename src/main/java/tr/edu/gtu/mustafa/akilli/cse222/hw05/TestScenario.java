package tr.edu.gtu.mustafa.akilli.cse222.hw05;

import java.util.LinkedList;
import java.util.List;

/**
 * HW05_131044017_Mustafa_Akilli
 *
 * File:   TestScenario
 *
 * Description:
 *
 * TestScenario for HW05
 *
 * @author Mustafa_Akilli
 * @since Sunday 30 March 2016 by Mustafa_Akilli
 */
public class TestScenario
{
    public static void main( String[] args )
    {
        /************************** Test For Hanoi *********************/
        System.out.println("*_*_*_*_*_*_*_* Test For Hanoi *_*_*_*_*_*_*_*");
        GameTowerOfHanoi gameTowerOfHanoi = new GameTowerOfHanoi();

        /* For 3 disk */
        System.out.println("\nFor 3 disk:");
        gameTowerOfHanoi.TowerOfHanoiIterative(3,'K','L','M');
        System.out.println("**********************************");

        /* For 4 disk */
        System.out.println("\nFor 4 disk:");
        gameTowerOfHanoi.TowerOfHanoiIterative(4,'K','L','M');
        System.out.println("**********************************");

        /* For 5 disk */
        System.out.println("\nFor 5 disk:");
        gameTowerOfHanoi.TowerOfHanoiIterative(5,'K','L','M');
        System.out.println("**********************************");

        /************************** Test For Remove Method in ListedListRec *********************/
        System.out.println("\n\n*_*_*_*_*_*_*_* Test For Remove Method in ListedListRec *_*_*_*_*_*_*_*\n");
        LinkedListRec<Integer> linkedListRec = new LinkedListRec<Integer>();

        /* Add Elements in linkedListRec */
        System.out.println("\nLinked List Rec: \n");
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(1);
        linkedListRec.add(8);
        linkedListRec.add(4);
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(5);
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(3);
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(8);
        linkedListRec.add(8);

        System.out.println(linkedListRec.toString());

        linkedListRec.remove(8);

        System.out.println("\nRemove 8, after Linked List Rec: \n");
        System.out.println(linkedListRec.toString());


        System.out.println("**********************************");
        List<Integer> linkedList1= new LinkedList<Integer>();
        List<Integer> linkedList2 = new LinkedList<Integer>();
        List<Integer> intersectionOfLists = new LinkedList<Integer>();
        List<Integer> unionOfLists = new LinkedList<Integer>();
        ClassRec<Integer> classRec = new ClassRec<Integer>();

        System.out.println("\n\n*_*_*_*_*_*_*_* Test For ClassRec *_*_*_*_*_*_*_*\n");

        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(44);
        linkedList1.add(0);
        linkedList1.add(1);
        linkedList1.add(1);


        linkedList2.add(1);
        linkedList2.add(1);
        linkedList2.add(1);
        linkedList2.add(3);

        classRec.setList1(linkedList1);
        classRec.setList2(linkedList2);

        System.out.println("Linked List 1 elements: ");
        System.out.println(linkedList1.toString() + "\n");

        System.out.println("Linked List 2 elements: ");
        System.out.println(linkedList2.toString());


        System.out.println("\n*_*_*_*_*_*_*_* Test For intersectionOfLists Method *_*_*_*_*_*_*_*\n");

        System.out.println("Linked List 1 and Linked List 2 intersection Of Lists : ");
        intersectionOfLists = classRec.intersectionOfLists();

        System.out.println(intersectionOfLists.toString());

        System.out.println("\nLinked List 1 and Linked List 2 union Of Lists : ");
        unionOfLists = classRec.unionOfLists();

        System.out.println(unionOfLists.toString());

        System.out.println("\nLinked List 2 is subset of Linked List 1: " + classRec.isSubset());

        System.out.println("\nSwitch Linked List 1 and Linked List 2");

        classRec.setList1(linkedList2);
        classRec.setList2(linkedList1);

        System.out.println("\nLinked List 1 is subset of Linked List 2: " + classRec.isSubset());
    }
}
