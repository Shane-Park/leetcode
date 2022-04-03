    class Encrypter {

        Map<String, Integer> dictionary = new HashMap<>();
        Map<Character, String> map = new HashMap<>();

        public Encrypter(char[] keys, String[] values, String[] dictionary) {
            for (int i = 0; i < keys.length; i++) {
                map.put(keys[i], values[i]);
            }
            for (String s : dictionary) {
                String encrypted = encrypt(s);
                this.dictionary.put(encrypted, this.dictionary.getOrDefault(encrypted, 0) + 1);
            }
        }

        public String encrypt(String word1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word1.length(); i++) {
                sb.append(map.get(word1.charAt(i)));
            }
            return sb.toString();
        }

        public int decrypt(String word2) {
            return dictionary.getOrDefault(word2, 0);
        }
    }