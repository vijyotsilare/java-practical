class Student {
    String name;
    String regNo;
    String address;
    long mobNo;

    Student(String name, String address, long mobNo,String regNo) {
        this.name = name;
        this.address = address;
        this.mobNo = mobNo;
        this.regNo=regNo;
    }
    void displayStudent(){
        System.out.println("name:"+name);
        System.out.println("address:"+address);
        System.out.println("Reg No:"+regNo);
        System.out.println("mobNo:"+mobNo);
        System.out.println("--------------------");
    }
}
