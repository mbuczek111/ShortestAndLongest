public class ShortestAndLongest {

    public static void main(String[] args) {
        String str= "For given text find the longest and the shortest words tralalal";
        String [] words= str.split(" ");
        String [] sw = new String [words.length];
        String [] lw = new String [words.length];

        sw[0]=words[0];
        lw[0]=words[0];
        int scounter=1;
        int lcounter=1;
        int min=words[0].length();
        int max=words[0].length();
        for(int i=0;i<words.length;i++)
        {
        if(words[i].length()<=min)
            {
            min=words[i].length();
            sw[0]=words[i];
            }
        if(words[i].length()>=max)
            {
            max=words[i].length();
            lw[0]=words[i];
            }
        }
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()==min)
            {
                sw[scounter-1] = words[i];
                scounter++;
            }
            if(words[i].length()==max)
            {
                lw[lcounter-1] = words[i];
                lcounter++;
            }
        }

        System.out.println("The shortest words: ");
        for(int i=0;i<scounter-1;i++)
        {
            System.out.println(sw[i]);
        }
        System.out.println("The longest words: ");
        for(int i=0;i<lcounter-1;i++)
        {
            System.out.println(lw[i]);
        }

    }
}
