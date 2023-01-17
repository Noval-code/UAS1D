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

        list.add(Cari);

        for (int index = 0; index < list.size(); index++){
            list.get(index).indexOf(Cari);

        }
        return "Indeks ke " + list.indexOf(Cari);
    }

}
