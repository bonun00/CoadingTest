class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String[] video_time_ = new String[2];
        int video_time;
        video_time_ = video_len.split(":");
        video_time = Integer.parseInt(video_time_[0]) * 60 + Integer.parseInt(video_time_[1]);


        String[] op_start_;
        int op_st;
        op_start_ = op_start.split(":");
        op_st = Integer.parseInt(op_start_[0]) * 60 + Integer.parseInt(op_start_[1]);

        String[] op_end_;
        int op_en;
        op_end_ = op_end.split(":");
        op_en = Integer.parseInt(op_end_[0]) * 60 + Integer.parseInt(op_end_[1]);


        String[] now_;
        int now;
        now_ = pos.split(":");
        now = Integer.parseInt(now_[0]) * 60 + Integer.parseInt(now_[1]);

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("prev")) {
                now=minus_time(now, op_st, op_en, video_time);
            } else{
                now=plus_time(now, op_st, op_en, video_time);
            }
        }
        if(0<=now/60&& now/60<10){
            answer="0"+String.valueOf(now/60);
        } else{
            answer+=String.valueOf(now/60);

        }
        if(0<=now%60&& now%60<10){
            answer+=":0"+String.valueOf(now%60);
        }else{
            answer+=":"+String.valueOf(now%60);
        }
    
        return answer;
    }

        public int plus_time(int now , int op_st,int op_en,int video_time){// 시간 추가
            if(op_st<=now && now<=op_en) {
                now=op_en+10;
                if(video_time<now){
                    now=video_time;
                }
            }else if(video_time<now+10){
                now=video_time;
            }else{
                now+=10;
            }
           if(op_st<=now && now<=op_en) {
               now=op_en;
           }
            return now;
        }


    public int minus_time(int now , int op_st,int op_en,int video_time){// 시간 삭제
        if(op_st<=now && now<=op_en) {
            now=op_en-10;
            if(now<0){
                now=0;
            }
        }else if(now-10<0){
            now=0;
        }else{
            now-=10;
        }
         if(op_st<=now && now<=op_en) {
               now=op_en;
           }
        return now;
    }
}