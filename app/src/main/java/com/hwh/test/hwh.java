package com.hwh.test;

public class hwh {
    private String test = "hwh bug";
    private int fix = 0;

    public String getTest() {
        setTest("hwh bug fix");
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getFix() {
        System.out.println(fix);
        setFix(2);
        return fix;
    }

    public void setFix(int fix) {
        this.fix = fix;
    }

/*    public void testRemove(){
        System.out.println("test remove");
    }*/
}
