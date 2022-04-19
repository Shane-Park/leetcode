   class OrderedStream {

        String[] arr;
        int ptr = 0;

        public OrderedStream(int n) {
            arr = new String[n];
        }

        public List<String> insert(int idKey, String value) {
            arr[idKey - 1] = value;

            if (ptr < idKey - 1)
                return Collections.emptyList();

            List<String> list = new ArrayList<>();
            while (ptr < arr.length && arr[ptr] != null) {
                list.add(arr[ptr++]);
            }
            return list;

        }
    }

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */