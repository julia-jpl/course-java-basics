public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;

    public Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    public int addBanknotes100(int number) {
        return this.numberBanknotes100 += number;
    }

    public int addBanknotes50(int number) {
        return this.numberBanknotes50 += number;
    }

    public int addBanknotes20(int number) {
        return this.numberBanknotes20 += number;
    }

    public String isPossibleIssue(int amount) {
        int totalSumInAtm = this.numberBanknotes20 * 20 + this.numberBanknotes50 * 50 + this.numberBanknotes100 * 100;
        int numberNeedBanknotes100 = 0;
        int numberNeedBanknotes50 = 0;
        int numberNeedBanknotes20 = 0;
        int number100per20 = 0;
        int number100per50 = 0;
        switch (amount % 100) {
            case 0:
                if (amount <= totalSumInAtm) {
                    numberNeedBanknotes100 = amount / 100;
                    if (numberNeedBanknotes100 <= this.numberBanknotes100) {
                        return "Possible";
                    } else {
                        amount = amount - this.numberBanknotes100 * 100;
                        numberNeedBanknotes50 = amount / 50;
                        if (numberNeedBanknotes50 <= this.numberBanknotes50) {
                            return "Possible";
                        } else {
                            numberNeedBanknotes20 = amount / 20;
                            if (numberNeedBanknotes20 <= this.numberBanknotes20) {
                                return "Possible";
                            } else {
                                number100per20 = this.numberBanknotes20 / 5;
                                amount = amount - number100per20 * 100;
                                numberNeedBanknotes50 = amount / 50;
                                if (numberNeedBanknotes50 <= this.numberBanknotes50) {
                                    return "Possible";
                                } else {
                                    return "Impossible";
                                }
                            }
                        }
                    }
                } else {
                    return "Impossible";
                }
            case 50:
                if (amount <= totalSumInAtm) {
                    numberNeedBanknotes100 = amount / 100;
                    amount = amount - numberNeedBanknotes100 * 100;
                    numberNeedBanknotes50 = amount / 50;
                    if (numberNeedBanknotes100 <= this.numberBanknotes100 && numberNeedBanknotes50 <= this.numberBanknotes50) {
                        return "Possible";
                    } else if (numberNeedBanknotes100 > this.numberBanknotes100) {
                        amount = amount - this.numberBanknotes100 * 100;
                        numberNeedBanknotes50 = amount / 50;
                        if (numberNeedBanknotes50 <= this.numberBanknotes50) {
                            return "Possible";
                        } else {
                            return "Impossible";
                        }
                    }
                } else {
                    return "Impossible";
                }
            case 20:
            case 40:
            case 60:
            case 80:
                if (amount <= totalSumInAtm) {
                    numberNeedBanknotes100 = amount / 100;
                    amount = amount - numberNeedBanknotes100 * 100;
                    numberNeedBanknotes20 = amount / 20;
                    if (numberNeedBanknotes100 <= this.numberBanknotes100 && numberNeedBanknotes20 <= this.numberBanknotes20) {
                        return "Possible";
                    } else {
                        if (numberNeedBanknotes20 > this.numberBanknotes20) {
                            return "Impossible";
                        }
                        if (numberNeedBanknotes100 > this.numberBanknotes100) {
                            amount = amount - this.numberBanknotes100 * 100;
                            numberNeedBanknotes50 = amount / 50;
                            if (numberNeedBanknotes50 <= this.numberBanknotes50 && numberNeedBanknotes20 <= this.numberBanknotes20) {
                                return "Possible";
                            } else if (numberNeedBanknotes50 > this.numberBanknotes50) {
                                number100per50 = this.numberBanknotes50 / 2;
                                amount = amount - number100per50 * 100;
                                numberNeedBanknotes20 = amount / 20;
                                if (numberNeedBanknotes20 <= this.numberBanknotes20) {
                                    return "Possible";
                                } else {
                                    return "Impossible";
                                }
                            }
                        }
                    }
                } else {
                    return "Impossible";
                }
            default:
                return "Impossible";
        }
    }
    public void getOptionsCombinationBanknotes(int amount) {
        String message1 = null;
        String message2 = null;
        String message3 = null;
        int totalSumInAtm = this.numberBanknotes20 * 20 + this.numberBanknotes50 * 50 + this.numberBanknotes100 * 100;
        int numberNeedBanknotes100 = 0;
        int numberNeedBanknotes50 = 0;
        int numberNeedBanknotes20 = 0;
        int amount1 = 0;
        int amount2 = 0;
        if (amount % 100 == 0) {
            numberNeedBanknotes100 = amount / 100;
            if (numberNeedBanknotes100 <= this.numberBanknotes100) {
                message1 = "$100 x " + numberNeedBanknotes100;
            } else {
                amount1 = amount - this.numberBanknotes100 * 100;
                numberNeedBanknotes50 = amount1 / 50;
                if ((numberNeedBanknotes50 <= this.numberBanknotes50) && (this.numberBanknotes100 != 0) ) {
                    message1 = "$100 x " + this.numberBanknotes100 + "$50 x " + numberNeedBanknotes50;
                }
                if ((numberNeedBanknotes50 <= this.numberBanknotes50) && (this.numberBanknotes100 == 0)) {
                    message1 = "$50 x " + numberNeedBanknotes50;
                }
                if (numberNeedBanknotes50 > this.numberBanknotes50) {
                    amount2 = amount1 - this.numberBanknotes50 * 50;
                    numberNeedBanknotes20 = amount2 / 20;
                    if (numberNeedBanknotes20 <= this.numberBanknotes20) {
                        message1 = "$100 x " + this.numberBanknotes100 + "$50 x " + this.numberBanknotes50 + "$20 x " + numberNeedBanknotes20;
                    } else {
                        message1 = "No options";
                    }
                }
            }
            numberNeedBanknotes50 = 0;
            numberNeedBanknotes50 = amount / 50;
            if (numberNeedBanknotes50 <= this.numberBanknotes50) {
                message2 = "$50 x " + numberNeedBanknotes50;
            }
        }
        System.out.println(message1);
        System.out.println(message2);
    }
}


