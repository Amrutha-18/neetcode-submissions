class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character, Integer> maps = new HashMap<>();
        Map <Character, Integer> mapt = new HashMap<>();
        char [] sarray = s.toCharArray();
        char [] tarray = t.toCharArray();
        for( int i= 0 ; i <= sarray.length -1 ; i++)
        {
            char key = sarray[i];
            if(maps.containsKey(key))
            {
                int values = maps.get(key);
                maps.put(key , values + 1);
                values = 0 ;
            }
            else maps.put(key , 1);

        }
        for( int i= 0 ; i <= tarray.length -1 ; i++)
        {
            char key = tarray[i];
            if(mapt.containsKey(key))
            {
                int valuet = mapt.get(key);
                mapt.put(key , valuet + 1);
                valuet = 0 ;
            }
            else mapt.put(key , 1);

        }
        if (maps.equals(mapt)) {
            return true;
        }
        else return false;

    }
}
