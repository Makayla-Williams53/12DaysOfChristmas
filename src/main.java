import java.util.ArrayList;
public class main
{
    public static void main(String[] args)
    {
        System.out.println(verses(12));
    }

    static String verses(int n)
    {
        String output = "";

        String[] days = new String[]{"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelth"};


        for(int i = 0; i <= n - 1; i++)
        {
            if(i == 0)
            {
                output += "On the " + days[i] + " my trule love gave to me \nA partridge in a pear tree\n";
            }
            else
            {
                output += "\nOn the " + days[i]+ " day of Christmas, my true love gave to me " + lines(i) + "\n";
            }
        }


        return output;
    }

    static String lines(int n)
    {
        ArrayList<String> gifts = new ArrayList<String>();
        gifts.add("And a partridge in a pear tree");
        gifts.add("Two turtle-doves");
        gifts.add("Three French hens");
        gifts.add("Four calling birds");
        gifts.add("Five golden rings");
        gifts.add("Six geese a-laying");
        gifts.add("Seven swans a-swimming");
        gifts.add("Eight maids a-milking");
        gifts.add("Nine ladies dancing");
        gifts.add("Ten lords a-leaping");
        gifts.add("Eleven pipers piping");
        gifts.add("Twelve drummers drumming");

        String output = "";

        if(n == 0)
        {
            output += "\n" + gifts.get(0);
        }
        else
        {
            output += "\n" + gifts.get(n) + lines(n - 1);
        }

        return output;
    }

}