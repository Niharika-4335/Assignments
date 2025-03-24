package com.selenuimexpress.dlo;

public class Student {
    private Cheat cheat;


//    public void setMathCheat(MathCheat mathCheat) {
//        this.mathCheat = mathCheat;
//    }MathCheat


    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void cheating(){
        cheat.cheat();
    }

}
