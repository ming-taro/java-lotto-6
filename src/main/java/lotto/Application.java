package lotto;

import lotto.constant.Rank;
import lotto.controller.LottoMachine;

public class Application {
    public static void main(String[] args) {
        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.start();
    }
}