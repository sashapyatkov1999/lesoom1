package Lesson3.Lesson4HomeWork4;

public class PrincipalStaff {
    private String name;
    private  int checkList = 0;

    public PrincipalStaff(String name){
        this.name = name;

    }


    public  void setVodka(Stock kkk, int amount){
            if (kkk.getBalance() - amount > 0) {
                kkk.setBalance(kkk.getBalance() - amount);
                this.checkList += amount;
                System.out.println("Ура, я, " + this.name + ", испортил водку!");
            } else {
                System.out.println("Достаточно набил");
            }

        }
        int getLogBook () {
            return this.checkList;
        }

    }

