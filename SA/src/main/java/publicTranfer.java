public class publicTranfer {
    public int num;
    public int fuel = 100;
    public int speed = 0;
    public int remaining;
    public int maxPassenger;
    public int pay;
    public int money;
    public int passenger;
    public String go = "����";
    void now(){
        if(passenger == 0){
            System.out.println("���� �Ұ�");
        }else {
            System.out.println("������");
        }
    }
    void shift() {
        if (fuel < 10) {
            System.out.println("���� �ʿ�");
        }
    }
}

