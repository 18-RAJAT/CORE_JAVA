package Questions;

public class number_of_word_count
    {
        public static int count(String word)
        {
            int ct=0;
            char c[]=new char[word.length()];
            for(int i=0;i<word.length();++i)
            {
                c[i]=word.charAt(i);
                if(((i>0)&&(c[i]!=' ')&&(c[i-1]==' '))||((c[0]!=' ')&&(i==0)))ct++;
            }
            return ct;
        }
        public static void main(String[]args)
        {
            String word="my name is rajat joshi g e h u";
            System.out.println("Count is :" +count(word));
        }
}
