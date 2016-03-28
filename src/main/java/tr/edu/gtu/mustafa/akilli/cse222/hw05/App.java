package tr.edu.gtu.mustafa.akilli.cse222.hw05;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedListRec<Integer> linkedListRec = new LinkedListRec<Integer>();

        linkedListRec.add(1);
        linkedListRec.add(2);
        linkedListRec.add(3);
        linkedListRec.add(4);
        linkedListRec.add(5);
        linkedListRec.add(6);
        linkedListRec.add(7);
        linkedListRec.add(8);
        linkedListRec.add(7);

        System.out.print(linkedListRec.toString());

        System.out.print("**********************************");

        linkedListRec.remove(7);

        System.out.print(linkedListRec.toString());

        System.out.print("**********************************");

    }
}
