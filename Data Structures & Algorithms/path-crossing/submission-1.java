class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        HashSet<String> visited = new HashSet<>();
        visited.add("0,0");
        for (char move : path.toCharArray()) {
            if (move == 'N') y++;
            else if (move == 'S') y--;
            else if (move == 'E') x++;
            else if (move == 'W') x--;
            String current = x + "," + y;
            if (!visited.add(current)) {
                return true;
            }
        }

        return false;
    }
}
