package hometask;

public interface Iterator {
    public boolean hasNext();
    public Object next();
}

class Collection {
    private static Object[] collection;

    Collection(Object[] arr) {
        collection = arr;
    }

    private class Forward implements Iterator{
        int k = 0;
        @Override
        public boolean hasNext() {
            return k < collection.length;
        }
        @Override
        public Object next() {
            return collection[k++];
        }
    }
    private class Backward implements Iterator{
        int k = collection.length - 1;
        @Override
        public boolean hasNext() {
            return k >= 0;
        }
        @Override
        public Object next() {
            return collection[k--];
        }
    }

    public Forward goForward() {
        return new Forward();
    }

    public Backward goBackward() {
        return new Backward();
    }

    //==================================================

    public Iterator useAnonymous() {
        return new Iterator() {
            int k = collection.length - 1;
            @Override
            public boolean hasNext() {
                return k >= 3;
            }

            @Override
            public Object next() {
                int a = (int) collection[k];
                k -= 3;
                if ((a % 2) == 1)
                    return a;
                else
                    return null;
            }

            public void showAllArray() {
                for (int i = 0; i < collection.length; i++)
                    System.out.println(collection[i]);
            }
        };
    }
}
