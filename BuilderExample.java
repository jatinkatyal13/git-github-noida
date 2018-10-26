public class BuilderExample {
    public static void main(String[] args) {
        String s="Hello Brother";
        StringBuilder builder=new StringBuilder();
//        for (int i = 0; i <1000000; i++) {
//
//            s=s+"a";
//            builder.append("a");//builder do not create new object everytime
//        }
//        System.out.println(builder.toString());
        System.out.println(toggle(s));

    }

    public static String toggle(String line){//builder corresponding to line is created
        StringBuilder builder=new StringBuilder(line);
        for (int i = 0; i <builder.length() ; i++) {
            char ch=builder.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                ch=(char)('a'+(ch-'A'));//char-char is int
                //to lowercase
            }
            else if(ch<='a'&&ch>='z')
            {
                ch=(char)('A'+(ch-'a'));
            }
            builder.setCharAt(i,ch);
        }
        return builder.toString();
    }
    public static String oddeven(String line){//builder corresponding to line is created
        StringBuilder builder=new StringBuilder(line);
        for (int i = 0; i <builder.length() ; i++) {
            char ch=builder.charAt(i);

            if(i%2==0)
            {
                if(ch=='A'||ch=='a'){

                }
                ch=(char)(ch-1);//char-char is int
                //to lowercase
            }
            else
            {
                ch=(char)(ch+1);
            }
            builder.setCharAt(i,ch);
        }
        return builder.toString();
    }

}
