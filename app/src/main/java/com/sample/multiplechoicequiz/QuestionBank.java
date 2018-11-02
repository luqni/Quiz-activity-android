package com.sample.multiplechoicequiz;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Apa warna bendera indonesia?",
            "2. siapa presiden pertama indonesia?",
            "3. siapa prseiden indonesia sekarang?",
            "4. tahun berapa indonesia merdeka",
            "5. Tahun berapa sekarang ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Merah - Putih", "putih merah", "kuning", "hijau"},
            {"Soeharto", "Jokowi", "SBY", "Ir Soekarno"},
            {"Megawati", "Prabowo", "Bj Habibi", "Jokowi"},
            {"1999", "2018", "1945", "2000"},
            {"1999", "2000", "2010", "2018"}
    };

    private String mCorrectAnswers[] = {"Merah - Putih", "Ir Soekarno", "Jokowi", "1945", "2018"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}