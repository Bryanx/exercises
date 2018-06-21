package topdrie;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 10:56
 */
public class Resultaat {
    private String[] data;

    public Resultaat(String[] data) {
        this.data = data;
    }

    public String topDrie(String top){
        class Tierce{
            String kop;

            public Tierce(String kop) {
                this.kop = kop;
            }

            private String getTop(){
                return //eerste drie elementen van data
            }
        }
        Tierce tierce = new Tierce();
        return tierce.getTop();
    }
}
