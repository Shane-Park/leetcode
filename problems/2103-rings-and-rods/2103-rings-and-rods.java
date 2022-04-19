class Solution {
 Map<Character, Rod> rods;

    public int countPoints(String rings) {
        rods = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            rods.put((char) (i + '0'), new Rod(i));
        }
        for (int i = 0; i < rings.length(); i += 2) {
            new Ring(rings.substring(i, i + 2));
        }

        return rods.values().stream().mapToInt(r -> r.isComplete()).sum();
    }

    class Ring {
        Color color;
        Rod rod;

        Ring(String data) {
            this.color = Color.valueOf(String.valueOf(data.charAt(0)));
            this.rod = rods.get(data.charAt(1));
            rod.addRing(this);
        }
    }

    class Rod {
        int number;
        Set<Color> colors;

        Rod(int number) {
            this.number = number;
            colors = new HashSet<>();
        }

        void addRing(Ring ring) {
            this.colors.add(ring.color);
        }

        int isComplete() {
            return (this.colors.size() == 3) ? 1 : 0;
        }
    }

    enum Color {
        R, G, B
    }
}