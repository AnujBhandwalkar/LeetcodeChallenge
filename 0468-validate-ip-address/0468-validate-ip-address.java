class Solution {
    public String validIPAddress(String queryIP) {
        if(queryIP.contains(".")){
            String[] arrIP4 = queryIP.split("\\.", -1);
            if (arrIP4.length != 4){
                return "Neither";
            }   
            for(int i=0;i<4;i++){
                String str= arrIP4[i];
                if (str.length() == 0){
                    return "Neither";
                }
                if (str.length() > 3){
                    return "Neither";
                }
                if (str.length() > 1 && str.charAt(0) == '0'){
                    return "Neither";
                }
                if (!str.matches("[0-9]+")){
                    return "Neither";
                }
                if(Integer.valueOf(str)<0 || Integer.valueOf(str)>255){
                    return "Neither";
                }
            }
        return "IPv4";
        }
        
        if(queryIP.contains(":")){
            String[] arrIP6 = queryIP.split(":", -1);
            if (arrIP6.length != 8){
                return "Neither";
            } 
            for(int i=0;i<8;i++){
                String str= arrIP6[i];
                if (str.length() < 1 || str.length() > 4){
                    return "Neither";
                }  
                if (!str.matches("[0-9A-Fa-f]+")){
                    return "Neither"; 
                }
            }
        return "IPv6";
        }
    return "Neither";
    }    
}