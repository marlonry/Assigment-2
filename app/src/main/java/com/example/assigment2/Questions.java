package com.example.assigment2;

import java.util.ArrayList;

/**
 * <p>This is the questions class where all the questions and answers are stored</p>
 * @author Marlon
 */
public class Questions {
    public String questions[] = {
            "What is the capital city of New Zealand?",
            "Which New Zealand city has the highest population?",
            "New Zealand's international rugby team is called what?",
            "What is the famous treaty, that New Zealanders get a holiday for?",
            "Who became prime minister of New Zealand in December, 2016?",
            "What is the Maori word for \"mountain\" ?",
            "What is the Maori word for New Zealand?",
            "Whose head will you find on all New Zealand coins?",
            "Name the sea that lies between Australia and New Zealand.",
            "Where is the longest road bridge in New Zealand?"
    };

    private String choices[][] = {
            {"Wellington", "Tauranga", "Rotorua", "Auckland"},
            {"Queenstown", "Auckland", "Auckland", "Venus"},
            {"All Blacks", "Panthers", "New Zealand Tigers", "All Whites"},
            {"Treaty of Waitangi", "Treaty of the Tiger", "Treaty of Waitangui", "Treaty of Wutangio"},
            {"Peter Parker", "Jacinda Ardern", "Bill English", "Jacinda Michaels"},
            {"Kio Tata", "Mangare", "Monga", "Maunga"},
            {"Ao Tata Roa", "Aotearoa", "Aoterara", "Aotarora"},
            {"Queen Elizabeth III", "Jacinda Ardern", "Queen Elizabeth II", "Queen Elizabeth"},
            {"Tasman", "Red Sea", "Australasia Sea", "North Sea"},
            {"Aoteroa", "Ratarao", "Rakaia", "Raimanoa"},
    };

    private String correctAnswers[] = {"Wellington", "Auckland", "All Blacks", "Treaty of Waitangi", "Bill English", "Maunga", "Aotearoa", "Queen Elizabeth II", "Tasman", "Rakaia"};

    /**
     * <p>This method gets the question</p>
     * @author Marlon
     */
    public String getQuestion(int position) {
        String question = questions[position];
        return question;
    }

    /**
     * <p>This method gets the first choice</p>
     * @author Marlon
     * @param position
     * @return String
     */
    public String getChoice0(int position) {
        String choice = choices[position][0];
        return choice;
    }

    /**
     * <p>This method gets the second choice</p>
     * @author Marlon
     * @param position
     * @return String
     */
    public String getChoice1(int position) {
        String choice = choices[position][1];
        return choice;
    }

    /**
     * <p>This method gets the third choice</p>
     * @author Marlon
     * @param position
     * @return String
     */
    public String getChoice2(int position) {
        String choice = choices[position][2];
        return choice;
    }

    /**
     * <p>This method gets the fourth choice</p>
     * @author Marlon
     * @param position
     * @return String
     */
    public String getChoice3(int position) {
        String choice = choices[position][3];
        return choice;
    }

    /**
     * <p>This method gets the correct answer choice</p>
     * @author Marlon
     * @param position
     * @return String
     */
    public String getCorrectAnswer(int position) {
        String answer = correctAnswers[position];
        return answer;
    }
}
