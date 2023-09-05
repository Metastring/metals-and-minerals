package com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.ptcodes.qurmo.entity.drugCategory.otherCategory.PurificationProcess;

public class PurificationProcessParser {

    public static void parsePurificationProcessValues(String header, String value, PurificationProcess purificationProcess) {

        if (header.equals("Dhanyabhraka")) {
            purificationProcess.setDhanyabhraka(value);
        } else if (header.equals("Shodhana")) {
            purificationProcess.setShodhana(value);
        } else if (header.equals("Marakagana")) {
            purificationProcess.setMarakagana(value);
        } else if (header.equals("Marana")) {
            purificationProcess.setMarana(value);
        } else if (header.equals("Bhasma_Tests")) {
            purificationProcess.setBhasmaTests(value);
        } else if (header.equals("Amrutikarana")) {
            purificationProcess.setAmrutikarana(value);
        } else if (header.equals("Lohitikarana")) {
            purificationProcess.setLohitikarana(value);
        } else if (header.equals("Satvapatana")) {
            purificationProcess.setSatvamarana(value);
        } else if (header.equals("Satvashodhana")) {
            purificationProcess.setSatvashodhana(value);
        } else if (header.equals("Satvamarana")) {
            purificationProcess.setSatvamarana(value);
        } else if (header.equals("Satvamrudukarana")) {
            purificationProcess.setSatvamrudukarana(value);
        } else {
            purificationProcess.setDruti(value);
        }

    }
}
