class lengthOfString {
    public static int lenStr(String a){
        if(a == ""){
            return 0;
        }
        return 1+lenStr(a.substring(1));
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String a = "abcdef";
        System.out.println(lenStr(a));
    }
