import java.util.ArrayList;

public class UAS1D {

    private String MESSAGEID;
    private String MESSAGENAME;
    private ArrayList<String> CONTEXT ;

    public String getMESSAGEID() {
        return MESSAGEID;
    }

    public void setMESSAGEID(String MESSAGEID) {
        this.MESSAGEID = MESSAGEID;
    }

    public String getMESSAGENAME() {
        return MESSAGENAME;
    }

    public void setMESSAGENAME(String MESSAGENAME) {
        this.MESSAGENAME = MESSAGENAME;
    }

    public ArrayList<String> getCONTEXT() {
        return CONTEXT;
    }

    public void setCONTEXT(ArrayList<String> CONTEXT) {
        this.CONTEXT = CONTEXT;
    }

    public Object FindWord(ArrayList<String> arry, String Cari ){
        for (String Cai : arry){
            if (Cai.contains(Cari)){
                System.out.println("Indeks ke " + arry.indexOf(Cai));
            }
        }

        return arry.indexOf(Cari);
    }

}
