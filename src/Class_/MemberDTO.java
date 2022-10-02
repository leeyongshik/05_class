package Class_;

public class MemberDTO {
    private String name, num, ads, age;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }


    public String getAds() {
        return ads;
    }
    public void setAds(String ads) {
        this.ads = ads;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getTot(){
        return name + "\t" + age + "\t" + num + "\t" +ads;
    }



}
