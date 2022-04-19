
class CustomStack {

    int maxSize;
    LinkedList<Integer> list = new LinkedList<>();

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (list.size() < maxSize)
            list.add(x);
    }

    public int pop() {
        if(list.size() == 0)
            return -1;
        return list.remove(list.size() - 1);
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, list.size()); i++) {
            list.set(i, list.get(i) + val);
        }
    }
}
