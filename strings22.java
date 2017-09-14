class Strings {
    private static final String Test = "abcdefg\n";
    private static int i =0;

    public static void main(String args[]){
        System.out.println("name : " + strlen(Test));
    }

    private static int strlen(String str){
        if(str == null){
            return 0;
        }
        if(str.charAt(i) == '\n'){
            return 0;
        }
        i += 1;
        return 1 + strlen(str);
    }
}