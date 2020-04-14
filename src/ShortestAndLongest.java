public class ShortestAndLongest {

    public static void main(String[] args) {
        String str= "For given text find the longest and the shortest words";
        String [] words= str.split(" ");
        String sw,lw;
        sw=words[0];
        lw=words[0];
        int min=words[0].length();
        int max=words[0].length();
        for(int i=0;i<words.length;i++)
        {
        if(words[i].length()<min)
            {
            min=words[i].length();
            sw=words[i];
            }
        if(words[i].length()>max)
            {
            max=words[i].length();
            lw=words[i];
            }
        }
        System.out.println("The shortest word: " + sw);
        System.out.println("The longest words: " + lw);
    }
}
