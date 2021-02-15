package Program.Collection;

import java.util.EnumSet;

public class enumSetApp {

    public static enum gender{
        MALE, FEMALE, NO_MENTION
    }
    public static void main(String[] args) {

        EnumSet<gender> genders = EnumSet.allOf(gender.class);

        for (var gender : genders){
            System.out.println(gender);
        }


    }
}
