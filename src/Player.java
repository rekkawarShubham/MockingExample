public class Player {
 private  int pid;
 private  String name;
 private  int jersey_no;

  public Player(int id,String name,int jersey_no){
      this.pid = id;
      this.name = name;
      this.jersey_no = jersey_no;
  }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getJersey_no() {
        return jersey_no;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJersey_no(int jersey_no) {
        this.jersey_no = jersey_no;
    }
}
