package hometask;

public class Application {
    public static void main(String[] args) {
        Integer[] array = {-2,34,21,453,2,6,9,-12,0};

        Collection collection = new Collection(array);
        Iterator iForward = collection.goForward();
        Iterator iBackward = collection.goBackward();

        System.out.println("");
        while(iForward.hasNext())
            System.out.println(iForward.next());

        System.out.println("");
        while(iBackward.hasNext())
            System.out.println(iBackward.next());

        System.out.println("");
        Iterator anonymous = collection.useAnonymous();
        while (anonymous.hasNext()) {
            Object a = anonymous.next();
            if (a != null)
                System.out.println(a);
        }

    }
}
