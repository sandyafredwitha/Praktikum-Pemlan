package TugasPraktikum01;

public class Books {
    public String[][] teknologi =  {
            {"The Inevitable: Understanding the 12 Technological Forces That Will Shape Our FutureThe Inevitable: Understanding the 12 Technological Forces That Will Shape Our Future", "Kevin Kelly", "336", "Penguin Books", "2017"}, 
            {"TheFourth Industrial Revolution", "Klaus Schwab", "192", "Currency", "2016"}, 
            {"The Singularity Is Near: When Humans Transcend Biology", "Ray Kurzweil", "672", "Penguin Books", "2006"}, 
            {"Weapons of Math Destruction: How Big Data Increases Inequality and Threatens Democracy", "Cathy O'Neil", "272", "Crown", "2016"}, 
            {"How We Got to Now: Six Innovations That Made the Modern World", "Steven Johnson", "304", "Riverhead Books", "2014"}, 
    };
    public String[][] filsafat =  {
            {"A History of Western Philosophy", "Bertrand Russell", "896", "Simon & Schuster", "1945"},
            {"The Stranger", "Albert Camus", "Bervariasi tergantung edisi", "Bervariasi tergantung edisi", "1942"},
            {"The Ethics of Ambiguity", "Simone de Beauvoir", "160", "Citadel Press", "1947"},
            {"The Consolations of Philosophy", "Alain de Botton", "272", "Vintage", "2000"},
            {"Sophie's World", "Jostein Gaarder", "544", "Farrar, Straus and Giroux", "1991"},
    };
    public String[][] sejarah =  {
            {"1491: New Revelations of the Americas Before Columbus", "Charles C. Mann", "576", "Vintage", "2005"},
            {"The Rise and Fall of the Third Reich: A History of Nazi Germany", "William L. Shirer", "1280", "Simon & Schuster", "1960"},
            {"The Silk Roads: A New History of the World", "Peter Frankopan", "672", "Vintage", "2015"},
            {"The Decline and Fall of the Roman Empire", "Edward Gibbon", "Bervariasi tergantung edisi", "Bervariasi tergantung edisi", "1776-1789"},
            {"The Crusades: The Authoritative History of the War for the Holy Land", "Thomas Asbridge", "784", "Harper Perennial", "2010"},
    };
    public String[][] agama =   {
            {"The Heart of Christianity: Rediscovering a Life of Faith", "Marcus J. Borg", "256", "HarperOne", "2003"},
            {"The Case for Christ", "Lee Strobel", "352", "Zondervan", "1998"} ,
            {"The Varieties of Religious Experience", "William James", "512", "Penguin Classics", "1902"},
            {"The God Delusion", "Richard Dawkins", "464", "Mariner Books", "2006"},
            {"Mere Christianity", "C.S. Lewis", "227","HarperOne", "1952"},
    };
    public String[][] psikologi =   {
            {"Drive: The Surprising Truth About What Motivates Us", "Daniel H. Pink", "288", "Riverhead Books", "2009"},
            {"Emotional Intelligence: Why It Can Matter More Than IQ", "Daniel Goleman", "368", "Bantam", "1995"},
            {"The Body Keeps the Score: Brain, Mind, and Body in the Healing of Trauma", "Bessel van der Kolk", "464", "Penguin Books", "2014"},
            {"Influence: The Psychology of Persuasion", "Robert B. Cialdini", "336", "Harper Business", "1984"},
            {"Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", "296", "Back Bay Books", "2007"},
    };
    public String[][] politik =    {
            {"The Republic", "Plato", "416", "Penguin Classics", "c. 380 BC"},
            {"The Road to Serfdom", "Friedrich Hayek", "274", "University of Chicago Press", "1944"},
            {"The Origins of Totalitarianism", "Hannah Arendt", "576", "Harcourt Brace Jovanovich", "1951"},
            {"The Clash of Civilizations and the Remaking of World Order", "Samuel P. Huntington", "368", "Simon & Schuster", "1996"},
            {"The End of History and the Last Man", "Francis Fukuyama", "464", "Free Press", "1992"},
    };
    public String[][] fiksi =    {
            {"To Kill a Mockingbird", "Harper Lee", "336", "Harper Perennial Modern Classics", "1960"},
            {"The Hobbit", "J.R.R. Tolkien", "310", "Houghton Mifflin Harcourt", "1937"},
            {"Pride and Prejudice", "Jane Austen", "432", "Penguin Classics", "1813"},
            {"The Great Gatsby", "F. Scott Fitzgerald", "180", "Scribner", "1925"},
            {"The Catcher in the Rye", "J.D. Salinger", "288", "Little, Brown and Company", "1951"},
    };

    public void booklist (String[][]type) {
        for(int i = 1; i <= type.length; i++){
            System.out.println("Book order-" + i);
            System.out.println("1. Title                : " + type[i-1][0]);
            System.out.println("2. Writer's name        : " + type[i-1][1]);
            System.out.println("3. Number of pages      : " + type[i-1][2]);
            System.out.println("4. Publisher name       : " + type[i-1][3]);
            System.out.println("5. Year publication     : " + type[i-1][4]);

        }
    }
}
