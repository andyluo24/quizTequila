package edu.illinois.cs.cs125.simplequizsoundeffect;

public class Question {
    /**
     * the question database
     */
    public String questionDatabase[] = {
            "What is the abbreviation of Massachusetts?",
            "What is the abbreviation of Pennsylvania?",
            "Which vegetable name is the original meaning of Chicago?",
            "What is the second largest city in the US?",
            "Where is the headquarter of Microsoft?",
            "What is the company that has the greatest market value in the stock market?",
            "Which president wants to build a wall between the US and Mexico?",
            "What is the best cafeteria at U of I?",
            "Who is the father of computer science?",
            "What is the meaning of 'X' in iPhone X?",
            "Who is the most handsome man in the world?",
            "What is the population in Hong Kong?",
            "How many states are in the United States?",
            "Where is Cancun?",
            "What country is also known as Persia?",
            "What is the main island of Japan?",
            "What city was once called New Amsterdam?",
            "Who is the best soccer player in the world?"
    };
    /**
     * the answer choices database
     */
    private String xuanze[][] = {
            {"PA", "CA", "VA", "MA", "LA"},
            {"PA", "CA", "VA", "MA", "LA"},
            {"potato", "tomato", "onion", "spinach", "peach"},
            {"New York", "Los Angeles", "Boston", "Philadelphia", "Seattle"},
            {"New York", "Los Angeles", "Seattle", "San Francisco", "Miami"},
            {"Apple", "Google", "Alibaba", "Amazon", "Tencent"},
            {"Obama", "Trump", "Bush", "Clinton", "Nixon"},
            {"PAR", "FAR", "ISR", "Ikenberry", "Armory"},
            {"Turing", "Thomas", "Geoff", "Benjamin", "Steve Jobs"},
            {"9", "10", "11", "12", "13"},
            {"Dali Su", "Andy Luo", "Geoff", "Shiqi Sun", "Tony Wu"},
            {"8000000", "8000000000", "10000000", "10", "10000000000"},
            {"20", "30", "40", "50", "60"},
            {"Spain", "Switzerland", "UK", "Mexico", "China"},
            {"Spain", "US", "UK", "Iran", "Singapore"},
            {"Honshu", "Gagi", "wuli", "Kishi", "Jiji"},
            {"London", "New York City", "Toronto", "Vancouver", "Willington"},
            {"Messi", "Messi", "Messi", "Messi", "Messi"}
    };
    /**
     * the correct answer for each question database.
     */
    private String ca[] = {"MA","PA","onion","Los Angeles","Seattle","Apple","Trump","Ikenberry","Turing","10","Dali Su","8000000","50","Mexico","Iran","Honshu","New York City", "Messi"};

    /**
     * get method for questions
     * @param i
     * @return
     */
    public String obtainq(int i) {
        String wenti = questionDatabase[i];
        return wenti;
    }

    /**
     * get method for choice 1
     * @param i
     * @return
     */
    public String oc1(int i) {
        String daan = xuanze[i][0];
        return daan;
    }

    /**
     * get method for choice 2
     * @param i
     * @return
     */
    public String oc2(int i) {
        String daan = xuanze[i][1];
        return daan;
    }

    /**
     * get method for choice 3
     * @param i
     * @return
     */
    public String oc3(int i) {
        String daan = xuanze[i][2];
        return daan;
    }

    /**
     * get method for choice 4
     * @param i
     * @return
     */
    public String oc4(int i) {
        String daan = xuanze[i][3];
        return daan;
    }

    /**
     * get method for choice 5
     * @param i
     * @return
     */
    public String oc5(int i) {
        String daan = xuanze[i][4];
        return daan;
    }

    /**
     * get method for correct answer
     * @param i
     * @return
     */
    public String gca(int i) {
        String daan = ca[i];
        return daan;
    }

}


