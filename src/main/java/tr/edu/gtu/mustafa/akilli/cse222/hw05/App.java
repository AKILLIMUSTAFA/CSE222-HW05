package tr.edu.gtu.mustafa.akilli.cse222.hw05;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*List<Integer> linkedListRec = new LinkedList<Integer>();
        List<Integer> linkedListRec2 = new LinkedList<Integer>();


        linkedListRec.add(1);
        linkedListRec.add(2);
        linkedListRec.add(3);
        linkedListRec.add(44);
        linkedListRec.add(0);
        linkedListRec.add(1);


        linkedListRec2.add(1);
        linkedListRec2.add(1);
        linkedListRec2.add(1);


        ClassRec<Integer> classRec = new ClassRec<Integer>();

        classRec.setList1(linkedListRec);
        classRec.setList2(linkedListRec2);

        List<Integer> gg = classRec.intersectionOfLists();

        System.out.println("**********************************");

        for(int i=0; i<gg.size() ;++i)
            System.out.print(gg.get(i) + ",");


        System.out.println("**********************************");

        List<Integer> ff = classRec.unionOfLists();

        for(int i=0; i<ff.size() ;++i)
            System.out.print(ff.get(i) + ",");


        System.out.println("**********************************");


        System.out.println(classRec.isSubset());*/

        LinkedListRec<Integer> linkedListRec = new LinkedListRec<Integer>();
        boolean result = true;

        /* Add Element linkedListRec */
        linkedListRec.add(6);
        linkedListRec.add(3);
        linkedListRec.add(7);
        linkedListRec.add(8);
        linkedListRec.add(6);
        linkedListRec.add(2);
        linkedListRec.add(6);

        /* Remove 6 Element in linkedListRec */
        linkedListRec.remove(6);

        System.out.println(linkedListRec.toString());

    }
}
