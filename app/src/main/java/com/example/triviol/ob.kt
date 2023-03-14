package com.example.triviol

object ob {
    const val USER_NAME :String = "user_name";
    const val TOTAL_QUESTIONS:String = "total_questions";
    const val TOTAL_SCORE :String = "total_score";
    const val QUIZ_NUMBER:String = "quiz_number";
    fun youtubeQuestions():ArrayList<Questionsweneed>{
        val youtubequestionslist = ArrayList<Questionsweneed>();
        val Ques1 = Questionsweneed(1,
                "What Is the Most Disliked video on YouTube?",R.drawable.pewdiepiew,
            "YouTube Rewind 2019","Sweatshirt By Jacob Sartorius","Baby By Justin Bieber","YouTube Rewind 2018",3);
        youtubequestionslist.add(Ques1);
        val Ques2 = Questionsweneed(2,"How many users are on YouTube",R.drawable.pewdiepiew,
                    "500 mil","2 bil","5 bil","250 mil",3);
        youtubequestionslist.add(Ques2);
        val Ques3 = Questionsweneed(3,"Where did the Youtube founders work before Youtube",R.drawable.pewdiepiew,
            "McDonalds","Paypal","vine","amazon",3);
        youtubequestionslist.add(Ques3);
        val Ques4 = Questionsweneed(4, "What year was youtube made",R.drawable.pewdiepiew,
            "2004","2005", "2008","2012",3);
        youtubequestionslist.add(Ques4);
        val Ques5 = Questionsweneed(5, "what year was youtube bought by Microsoft",R.drawable.pewdiepiew,
            "2008","2006","2004","2012",3);
        youtubequestionslist.add(Ques5);
        val Ques6 = Questionsweneed(6,"Who created YouTube",R.drawable.pewdiepiew,
            "Steve Jobs","Jawed Karem","Mickey Mouse","Steve Chen",3);
        youtubequestionslist.add(Ques6);
        val Ques7 = Questionsweneed(7,"What is the most viewed youtube video?",R.drawable.pewdiepiew,
                    "Despacito","I-Spy by Kyle",
                    "The Most liked video on Youtube By Mr Beast","None",3);
        youtubequestionslist.add(Ques7);
        val Ques8 = Questionsweneed(8,"What is Jacksepticeyes player name",R.drawable.pewdiepiew,
            "Jackaboy","Bumbum","booper dooper","salty buckets",3);
        youtubequestionslist.add(Ques8);
        val Ques9 = Questionsweneed(9,"what channel does top 10´s?",R.drawable.pewdiepiew,
            "mojowatch","watch mojo",
                    "shmosh","smoosh",3);
        youtubequestionslist.add(Ques9);
        val Ques10 = Questionsweneed(10,"What is 2020's second most popular YouTuber \n" +
                "                        PewDiePie's real name",R.drawable.pewdiepiew,
            "Rick Sticklebrick","Hendy Bobendy La Forge","Jimmy Whispers","Felix Arvid Ulf Kjellberg",3);
        youtubequestionslist.add(Ques10);
        return youtubequestionslist;
    }
    fun quizofbowlers():ArrayList<Questionsweneed>{
        val quizofbowler = ArrayList<Questionsweneed>();
        val ques1 = Questionsweneed(1,"Who is the most popular indian bowler?",R.drawable.texturepaper,
            "Ravindera Jadega","Bismila Khan","Roaz mirha Khan","Virat Kohli",3)
        quizofbowler.add(ques1);
        val ques2 = Questionsweneed(1,"Who is the most popular indian bowler?",R.drawable.texturepaper,
            "Ravindera Jadega","Bismila Khan","Roaz mirha Khan","Virat Kohli",3)
        quizofbowler.add(ques2);
        val ques3 = Questionsweneed(1,"Who is the most popular indian bowler?",R.drawable.texturepaper,
            "Ravindera Jadega","Bismila Khan","Roaz mirha Khan","Virat Kohli",3)
        quizofbowler.add(ques3);
        val ques4= Questionsweneed(1,"Who is the most popular indian bowler?",R.drawable.texturepaper,
            "Ravindera Jadega","Bismila Khan","Roaz mirha Khan","Virat Kohli",3)
        quizofbowler.add(ques4);
        val ques5 = Questionsweneed(1,"Who is the most popular indian bowler?",R.drawable.texturepaper,
            "Ravindera Jadega","Bismila Khan","Roaz mirha Khan","Virat Kohli",3)
        quizofbowler.add(ques5);
        val ques6 = Questionsweneed(1,"Who is the most popular indian bowler?",R.drawable.texturepaper,
            "Ravindera Jadega","Bismila Khan","Roaz mirha Khan","Virat Kohli",3)
        quizofbowler.add(ques6);
        val ques7 = Questionsweneed(1,"Who is the most popular indian bowler?",R.drawable.texturepaper,
            "Ravindera Jadega","Bismila Khan","Roaz mirha Khan","Virat Kohli",3)
        quizofbowler.add(ques7);
        val ques8 = Questionsweneed(1,"Who is the most popular indian bowler?",R.drawable.texturepaper,
            "Ravindera Jadega","Bismila Khan","Roaz mirha Khan","Virat Kohli",3)
        quizofbowler.add(ques8);
        val ques9 = Questionsweneed(1,"Who is the most popular indian bowler?",R.drawable.texturepaper,
            "Ravindera Jadega","Bismila Khan","Roaz mirha Khan","Virat Kohli",3)
        quizofbowler.add(ques9);
        val ques10 = Questionsweneed(1,"Who is the most popular indian bowler?",R.drawable.texturepaper,
            "Ravindera Jadega","Bismila Khan","Roaz mirha Khan","Virat Kohli",3)
        quizofbowler.add(ques10);
        return quizofbowler;
    }
}