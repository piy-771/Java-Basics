class Test{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Test){
            Test t = (Test)obj;
            if(id == t.id)
                return true;
        }
        return false;
    }
}
public class EqualsMethod {
    public static void main(String[] args) {
        Test obj = new Test();
//        obj.setId(565);
//        Test obj1 = new Test();
//        obj1.setId(565);
//        System.out.println(obj == obj1);
//        System.out.println(obj.equals(obj1));

        //clone method
        

    }

}
