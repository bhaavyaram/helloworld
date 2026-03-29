class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String str : emails)
        {
            StringBuilder sb = new StringBuilder();
            int i=0;
            while(i<str.length()&&str.charAt(i)!='@')
            {
                if(str.charAt(i)=='.')
                {
                    i++;
                    continue;
                }
                if(str.charAt(i)=='+')
                {
                    while(str.charAt(i)!='@')i++;
                    break;
                }
                sb.append(str.charAt(i));
                i++;
            }
            sb.append(str.substring(i));
            set.add(sb.toString());
        }
        return set.size();
    }
}