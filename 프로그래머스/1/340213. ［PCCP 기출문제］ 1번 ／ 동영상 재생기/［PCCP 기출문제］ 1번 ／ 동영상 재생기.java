class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[][] str = new String[4][2];
        str[0] = video_len.split(":"); 
        str[1] = pos.split(":");
        str[2] = op_start.split(":");
        str[3] = op_end.split(":");
        
        int[] sec = new int[4];
        for(int i=0; i<4; i++) {
            sec[i] = Integer.parseInt(str[i][0]) * 60 + Integer.parseInt(str[i][1]);
        }
        
        int total = sec[0];
        int now = sec[1];
        int start = sec[2];
        int end = sec[3];
        
        if(now >= start && now < end) {
            now = end;
        }
        
        for (String c : commands) {
            
            if (c.equals("next")) {
                now += 10;
                if(now > total) {
                    now = total;
                }
            }
            
            if(c.equals("prev")) {
                now -= 10;
                if(now < 0) {
                    now = 0;
                }
            }
            
            if(now >= start && now < end) {
                now = end;
            }
            
        }
        
        int ans_min = now / 60;
        int ans_sec = now % 60;
        
        return String.format("%02d:%02d", ans_min, ans_sec);
    }
}