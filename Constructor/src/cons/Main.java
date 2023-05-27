package cons;
class Data{
    private int i;
    private static int j;
    public Data(){
        i = ++j;
    }
    public void print(){
        System.out.print(i + " " + j + ", ");
    }
}

class Main{
    public static void main(String[] args){
        Data[] arr = {new Data(), new Data(), new Data()};
        for(int i = 0; i < arr.length; i++){
            arr[i].print();
        }
    }
}