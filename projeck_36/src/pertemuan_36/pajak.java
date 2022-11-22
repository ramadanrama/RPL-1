
package pertemuan_36;


public class pajak {
    public static void main(String[] args) {
        int G=2500000; //G adalah gaji kotor
        int L=0; //L adalah pajak  0%
        int M=2; //M adalah pajak  2%
        int N=3;// N adalah pajak  3%
        
        boolean bujangan=true; //variabel bujangan/status bernilai true/false
        //jika bujangan=false artinya menikah.jika bujangan=true artinya masih bujang
        if(G>=0&&G<=499999)
            System.out.println("pajak"+L+"%sisa gaji=Rp."+(G));
        if(G>=500000&&bujangan==true) //input status diberikan mulai G>1500000 dst
            System.out.println("status bujangan.gaji.gaji=gaji=Rp."+G+"-pajak 3% sisa Gaji =Rp."+(G-(G*N/100)));
        if (G>1500000&&bujangan==false)
            System.out.println("status nikah.gaji=Rp."+G+"-pajak 2% sisa Gaji=Rp."+(G-(G*M/100)));
    }
}
    

