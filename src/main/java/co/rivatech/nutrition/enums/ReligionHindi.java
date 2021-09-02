package co.rivatech.nutrition.enums;

/**
 * @author vranjan
 * created 09/08/2021
 */
public enum ReligionHindi {
    HINDU("हिंदू"),
    MUSLIM("मुस्लिम"),
    SARNA("सरना/आदिवासी"),
    CHRISTIAN("ईसाई"),
    BUDDHISHT("बौद्ध"),
    JAIN("जैन"),
    OTHER("अन्य");

    private String hindiString;

    ReligionHindi(String hindiString) {
        this.hindiString = hindiString;
    }

    public static String valueOf(final ReligionHindi religionHindi) {
        return religionHindi.hindiString;
    }
}
