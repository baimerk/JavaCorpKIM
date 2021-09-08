package lesson_8;

public class FortyLess {
    public static void main(String[] args) {
        System.out.println("-------------");
        String text = "Each fighter shall wear regulated gloves provided by the promoter. In principle, usage of regulated protective cup and mouthpiece is mandatory.\n" +
                "Each fighter shall. prepare their own protective cup. and a mouthpiece. Fighters must wear official protective cup specified by the promoter, and the usage of commercially available protective cups which tend to cause defect upon application, and structurally defective is prohibited. If fighters do not exercise their duties, they are not entitled to preferential treatment to remedy unfairness caused by accidents.\n" +
                "Furthermore,in case fighters do. not wear official. protective cups, and use their own cups, a fighters may severely be penalized for delaying the fight when the cup is damaged due to an accident, or when the process of arranging a new cup to replace the damaged one is time consuming.";
        String [] s = text.split("\\.");
        for (int i = 0;i< s.length;i++){
            String[] s2 = s[i].split(" ");
            if (s2.length>=3 && s2.length<=5);
            System.out.println(s[i]);
        }
        //System.out.println();
    }
}
