public class Zillion{

    private int[] zill;
    public Zillion(int size){
        zill = new int[size];
        for(int x=0;x <size;x++){
            zill[x] = 0;
        }
    }
    public void increment(){
        zill[zill.length-1] +=1;
        for(int x = zill.length-1; x>=0; x--){
            if (zill[x] == 10) {
                zill[x] = 0;
                if (x >= 1) {
                    zill[x - 1] += 1;
                }
                else if (x == 0) {
//                    THIS WILL FREAKING INCREASE THE SIDE OF THE ARRAY
//                    EX: 9999+1 = 00000
//                    INSTEAD OF 9999+1 = 0000
//                    int[] a = new int[zill.length + 1];
//                    a[0] = 0;
//                    for (int z = 1; z < a.length; z++) {
//                        a[z] = zill[z - 1];
//                    }
//                    zill = a;
                }
            }
        }

    }
    public String toString(){
        String str = new String();
        for (int a : zill){
            str += a;
        }
        return str;
    }
}

