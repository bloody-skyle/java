package lecture_20230528;

import lecture_20230528.club.RealMadrid;

public class Match {
    public static void main(String[] args) {
        //RealMadrid 객체(인스턴스) 생성
        //기본생성자를 이용한 객체 생성
        RealMadrid group1 = new RealMadrid();

        String[] group1Members = {"한명", "두명"};
        group1.setCoach("지단");
        group1.setMembers(group1Members);
        group1.setPrice(1);
        System.out.println("coach = " + group1.getCoach() + ", members = " + group1.getMembers().toString() + ",price = " + group1.getPrice());

        //RealMadrid 객체 생성
        RealMadrid group2 = new RealMadrid("나야");

        String[] group2Members = {"가나다라마바사"};
        group2.setMembers(group2Members);
        group2.setPrice(2);
        group2.setLocation("Madrid");
        System.out.println("members = " + group2.getMembers().toString() + ", price = " + group2.getPrice() + ", location = " + group2.getLocation());

        RealMadrid group3 = new RealMadrid("enlxmfflsdis", new String[]{"dis", "diss"});
        group3.setCreatedYear(2020);
        System.out.println("year = " + group3.getCreatedYear());

        RealMadrid group4 = new RealMadrid("yujin", new String[]{"tenma","door","breaker"}, 444_444);
        group4.setUniformColor("red");
        System.out.println("group4 uniformcolor = " + group4.getUniformColor());
    }
}
