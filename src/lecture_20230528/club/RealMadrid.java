package lecture_20230528.club;

public class RealMadrid extends Fc{
    //멤버변수(월드)
    private String coach;
    private String[] members;
    private int price; // 구단가치
    //기본 생성자
    public RealMadrid(){

    }
    //생성자 오버로딩
    public RealMadrid(String coach){
        this.coach = coach;
    }
    public RealMadrid(String coach, String[] members){
        this.coach = coach;
        this.members = members;
    }
    public RealMadrid(String coach, String[] members, int price){
        this.coach = coach;
        this.members = members;
        this.price = price;
    }
    public String getCoach(){
        return coach;
    }
    public void setCoach(String coach){
        this.coach=coach;
    }
    public String[] getMembers(){
        return members;
    }
    public void setMembers(String[] members){
        this.members=members;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
