
package pertemuan_36;


public class pajak {
    public static void main(String[] args) {
        int G=2500000; //G adalah gaji kotor
        int L=100; //L adalah pajak  2%
        int M=20000000; //M adalah pajak  5%
        int N=30000000;// N adalah pajak  3%
        
        boolean bujangan=true; //variabel bujangan/status bernilai true/false
        //jika bujangan=false artinya menikah.jika bujangan=true artinya masih bujangan
        if(G>=0&&G<=2500000)
            System.out.println("pajak"+L+"%sisa gaji=Rp."+(G));
        if(G>=500000&&bujangan==true) //input status diberikan mulai G>1500000 dst
            System.out.println("status bujangan=Rp."+G+"-pajak 5% sisa Gaji =Rp."+(G-(G*N/100)));
        if (G>1500000&&bujangan==false)
            System.out.println("status nikah.gaji=Rp."+G+"-pajak 2% sisa Gaji=Rp."+(G-(G*M/100)));
    }
}
    

