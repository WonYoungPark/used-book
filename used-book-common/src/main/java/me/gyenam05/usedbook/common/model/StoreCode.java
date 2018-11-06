package me.gyenam05.usedbook.common.model;

/**
 * Created by wyparks2@gmail.com on 2018. 10. 13.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
public enum StoreCode {
    ALADIN_001(CompanyType.ALADIN, "001", "강남점"),

    YES24_001(CompanyType.YES24, "001", "강남점"),
    YES24_002(CompanyType.YES24, "002", "목동점"),
    YES24_003(CompanyType.YES24, "003", "부산 서면점"),
    YES24_005(CompanyType.YES24, "005", "수영점F1963"),
    YES24_006(CompanyType.YES24, "006", "홍대점");

    private CompanyType companyType;
    private String code;
    private String name;

    StoreCode(CompanyType companyType, String code, String name) {
        this.companyType = companyType;
        this.code = code;
        this.name = name;
    }
}
