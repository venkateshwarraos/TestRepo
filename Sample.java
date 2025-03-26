public class Sample {
    private int instanceVariable =2;

    public static void main(String[] args) {

        int c = Test.add(5,6);

        Sample sample = new Sample();
        sample.getPrint();


        System.out.println(c);



    }

    public void getPrint() {

        System.out.println("sample print test");


    }
}
