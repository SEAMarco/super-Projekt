package de.telekom.sea7.lotto;

public class LottoMain {

    public static void main(String[] args) {
        
    	
    	Lotto lotto = new Lotto();
    	Lottogesellschaft lottogesellschaft = new Lottogesellschaft();
        
        
        lotto.setLottozahlen(7);
        lotto.setLottozahlen(9);
        lotto.setLottozahlen(11);
        lotto.setLottozahlen(23);
        lotto.setLottozahlen(25);
        lotto.setLottozahlen(32);
        lotto.setLottozahlen(48);

        lotto.ausgabeLottoschein();
        
        // lotto.getLottozahl(2);
        
        lotto.auswertungLottoschein();
        
        // lottogesellschaft.auszahlungGewinn(155);
    }

}
