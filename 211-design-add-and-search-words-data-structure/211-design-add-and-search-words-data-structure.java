class WordDictionary {

        Map<Integer, List<String>> map;

        public WordDictionary() {
            this.map = new HashMap<>();
        }

        public void addWord(String word) {
            List<String> list = map.getOrDefault(word.length(), new ArrayList<>());
            list.add(word);
            map.putIfAbsent(word.length(), list);
        }

        public boolean search(String word) {
            List<String> list = map.get(word.length());
                        if (list == null)
                return false;
            if (word.indexOf(".") < 0) {
                return list.contains(word);
            }
            loop:
            for (String s : list) {
                for (int i = 0; i < word.length(); i++) {
                    if (s.charAt(i) != word.charAt(i) && word.charAt(i) != '.')
                        continue loop;
                }
                return true;
            }
            return false;
        }
    }

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */