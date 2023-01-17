import java.util.ArrayList;

public class UAS1D {

    private String MESSAGEID;
    private String MESSAGENAME;
    private ArrayList<String> CONTEXT ;

    public void setMESSAGEID(String MESSAGEID) {
        this.MESSAGEID = MESSAGEID;
    }


    public void setMESSAGENAME(String MESSAGENAME) {
        this.MESSAGENAME = MESSAGENAME;
    }


    public void setCONTEXT(ArrayList<String> CONTEXT) {
        this.CONTEXT = CONTEXT;
    }

    public String FindWord(ArrayList<String> list, String Cari ){

        list.contains(Cari);
//        context.indexOf(context.contains(cari));
        return  "Kata : "+Cari+"("+list.contains(Cari)+")"+" , Ada Pada Indeks Ke - "+list.indexOf(Cari);
    }

}
