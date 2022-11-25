public class Bus extends PublicTransit{
/*
* 1. 최대 승객수 maxPassenger
2. 현재 승객수 passenger
3. 요금 fee
4. 버스 번호 num
5. 주유량 gas
6. 현재 속도 speed
7. 상태 state
* */
    private int fee = 1000;
    private int income = 0;
    private int totalIncome;

    Bus(int num){
        this.setNum(num);
        this.setMaxPassenger(30);
        this.changeState("운행중");
    }

    @Override
    public void changeState(String state){
        super.changeState(state);
        this.setPassenger(0);
        this.totalIncome += income;
    }
    @Override
    public void addGas(int addGas){
        super.addGas(addGas);
        if(this.getGas() == 0){
            this.changeState("차고지행");
            System.out.println("기름이 부족하여 " + this.getState() + " 합니다.");
        }else if(this.getGas() < 10){
            System.out.println("주유가 필요합니다.");
        }
    }

    @Override
    public void addPassenger(int addPassenger){
        if(this.getState()!="운행중"){
            System.out.println("버스가 운행상태가 아닙니다.");
        }else{
            super.addPassenger(addPassenger);
            System.out.println("현재 승객 수 : " + super.getPassenger());
            this.income = this.getPassenger()*this.fee;
        }
    }

    public int getFee() {
        return fee;
    }

    public int getIncome() {
        return income;
    }

    public int getTotalIncome() {
        return totalIncome;
    }
}
