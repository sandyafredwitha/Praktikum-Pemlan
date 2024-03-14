package TugasPraktikum02;

import java.util.Scanner;

public class MainBooks {    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("========== Welcome To Brawijaya's Library ==========");
        System.out.print("Enter the options according to the existing categories");
        int answer = scn.nextInt();
        if (answer == 1){
            Books book1 = new Books ("The Inevitable: Understanding the 12 Technological Forces That Will Shape Our FutureThe Inevitable: Understanding the 12 Technological Forces That Will Shape Our Future", "Kevin Kelly", "336", "Penguin Books", "2017", "Matahari terbit, burung berkicau, alam menyapa, hari dimulai");
            book1.displayInfo();
            Books book2 = new Books ("TheFourth Industrial Revolution", "Klaus Schwab", "192", "Currency", "2016","Gelombang laut, pasir pantai, angin sepoi, damai terasa");
            book2.displayInfo();
            Books book3 = new Books ("The Singularity Is Near: When Humans Transcend Biology", "Ray Kurzweil", "672", "Penguin Books", "2006", "Langit senja, warna-warni, indah terpancar, senyum terbawa");
            book3.displayInfo();
            Books book4 = new Books ("Weapons of Math Destruction: How Big Data Increases Inequality and Threatens Democracy", "Cathy O'Neil", "272", "Crown", "2016", "Musim gugur, daun berguguran, tanah tertutup, panorama memesona");
            book4.displayInfo();
            Books book5 = new Books ("How We Got to Now: Six Innovations That Made the Modern World", "Steven Johnson", "304", "Riverhead Books", "2014", "Pelangi menyilaukan, hujan reda, harapan muncul, bahagia bersama");
            book5.displayInfo();
            }
        else if (answer == 2){
            Books book1 = new Books ("A History of Western Philosophy", "Bertrand Russell", "896", "Simon &, Schuster", "1945", "Lorem ipsum dolor sit amet, consectetur adipiscing elit");
            book1.displayInfo();
            Books book2 = new Books ("The Stranger", "Albert Camus", "Bervariasi tergantung edisi", "Bervariasi tergantung edisi", "1942", "Proin tempor mauris vitae neque accumsan, nec efficitur justo aliquam");
            book2.displayInfo();
            Books book3 = new Books ("The Ethics of Ambiguity", "Simone de Beauvoir", "160", "Citadel Press", "1947", "Fusce ullamcorper justo at leo bibendum, non rhoncus elit consequat");
            book3.displayInfo();
            Books book4 = new Books ("The Consolations of Philosophy", "Alain de Botton", "272", "Vintage", "2000", "Sed vel ipsum a metus ullamcorper faucibus sed ac elit");
            book4.displayInfo();
            Books book5 = new Books ("Sophie's World", "Jostein Gaarder", "544", "Farrar, Straus and Giroux", "1991", "Nam auctor felis nec enim molestie, vitae fermentum risus ullamcorper");
            book5.displayInfo();
            }  
        else if (answer == 3){  
            Books book1 = new Books ("1491: New Revelations of the Americas Before Columbus", "Charles C. Mann", "576", "Vintage", "2005", "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas");
            book1.displayInfo();
            Books book2 = new Books ("The Rise and Fall of the Third Reich: A History of Nazi Germany", "William L. Shirer", "1280", "Simon & Schuster", "1960", "Nullam hendrerit, diam eget mattis aliquam, velit mauris fermentum justo");
            book2.displayInfo();
            Books book3 = new Books ("The Silk Roads: A New History of the World", "Peter Frankopan", "672", "Vintage", "2015", "Fusce ullamcorper justo at leo bibendum, non rhoncus elit consequat");
            book3.displayInfo();
            Books book4 = new Books ("The Decline and Fall of the Roman Empire", "Edward Gibbon", "Bervariasi tergantung edisi", "Bervariasi tergantung edisi", "1776-1789", "Sed vel ipsum a metus ullamcorper faucibus sed ac elit");
            book4.displayInfo();
            Books book5 = new Books ("The Crusades: The Authoritative History of the War for the Holy Land", "Thomas Asbridge", "784", "Harper Perennial", "2010", "Nam auctor felis nec enim molestie, vitae fermentum risus ullamcorper");
            book5.displayInfo();
        }
        else if (answer == 4){
            Books book1 = new Books ("The Heart of Christianity: Rediscovering a Life of Faith", "Marcus J. Borg", "256", "HarperOne", "2003", "Integer interdum lorem sit amet mauris vestibulum, eget consectetur nulla malesuada");
            book1.displayInfo();
            Books book2 = new Books ("The Case for Christ", "Lee Strobel", "352", "Zondervan", "1998", "Ut id ligula a magna facilisis fermentum eget eget purus");
            book2.displayInfo();
            Books book3 = new Books ("The Varieties of Religious Experience", "William James", "512", "Penguin Classics", "1902", "Phasellus sagittis eros nec nisl ullamcorper, nec volutpat elit tempor");
            book3.displayInfo();
            Books book4 = new Books ("The God Delusion", "Richard Dawkins", "464", "Mariner Books", "2006", "Duis rhoncus risus vel velit lacinia, non tincidunt turpis eleifend");
            book4.displayInfo();
            Books book5 = new Books ("Mere Christianity", "C.S. Lewis", "227", "HarperOne", "1952", "Aenean eget est vitae dui placerat commodo");
            book5.displayInfo();
        }
        else if (answer == 5){
            Books book1 = new Books ("Drive: The Surprising Truth About What Motivates Us", "Daniel H. Pink", "288", "Riverhead Books", "2009", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed gravida quam quis diam vehicula, sed sodales diam mattis");
            book1.displayInfo();
            Books book2 = new Books ("Emotional Intelligence: Why It Can Matter More Than IQ", "Daniel Goleman", "368", "Bantam", "1995", "Nulla facilisi. Fusce sed turpis eu magna ullamcorper tincidunt eget a justo");
            book2.displayInfo();
            Books book3 = new Books ("The Body Keeps the Score: Brain, Mind, and Body in the Healing of Trauma", "Bessel van der Kolk", "464", "Penguin Books", "2014", "Maecenas euismod ligula vel neque convallis, nec mattis nunc consectetur");
            book3.displayInfo();
            Books book4 = new Books ("Influence: The Psychology of Persuasion", "Robert B. Cialdini", "336", "Harper Business", "1984", "Duis eu odio vel elit rutrum consequat. Curabitur auctor justo id ipsum blandit, at consectetur dolor faucibus");
            book4.displayInfo();
            Books book5 = new Books ("Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", "296", "Back Bay Books", "2007", "Quisque auctor lectus sed elit bibendum, ac viverra libero suscipit");
            book5.displayInfo();
        }
        else if (answer == 6){
            Books book1 = new Books ("The Republic", "Plato", "416", "Penguin Classics", "c. 380 BC", "Proin congue odio at neque pellentesque, vel efficitur ligula vehicula");
            book1.displayInfo();
            Books book2 = new Books ("The Road to Serfdom", "Friedrich Hayek", "274", "University of Chicago Press", "1944", "Integer commodo nunc vitae eros eleifend, quis fringilla turpis consequat");
            book2.displayInfo();
            Books book3 = new Books ("The Origins of Totalitarianism", "Hannah Arendt", "576", "Harcourt Brace Jovanovich", "1951", "Etiam nec lacus nec ligula rutrum tempus. Nam euismod purus vel velit placerat, nec venenatis est placerat");
            book3.displayInfo();
            Books book4 = new Books ("The Clash of Civilizations and the Remaking of World Order", "Samuel P. Huntington", "368", "Simon & Schuster", "1996", "Ut efficitur odio nec orci tincidunt, sed vehicula felis gravida");
            book4.displayInfo();
            Books book5 = new Books ("The End of History and the Last Man", "Francis Fukuyama", "464", "Free Press", "1992", "Cras id velit sed ipsum consequat pulvinar. Nunc dignissim velit sed odio vehicula, eget blandit elit sagittis");
            book5.displayInfo();
        }
        else if (answer == 7){
            Books book1 = new Books ("To Kill a Mockingbird", "Harper Lee", "336", "Harper Perennial Modern Classics", "1960", "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae Integer ac consequat purus");
            book1.displayInfo();
            Books book2 = new Books ("The Hobbit", "J.R.R. Tolkien", "310", "Houghton Mifflin Harcourt", "1937", "Phasellus non justo eu felis fermentum congue. Sed consequat velit at ante consectetur, a congue mauris laoreet");
            book2.displayInfo();
            Books book3 = new Books("Pride and Prejudice", "Jane Austen", "432", "Penguin Classics", "1813", "Morbi ultricies ipsum id nulla condimentum, quis fermentum nunc blandit");
            book3.displayInfo();
            Books book4 = new Books ("The Great Gatsby", "F. Scott Fitzgerald", "180", "Scribner", "1925", "Nam sagittis libero ac risus efficitur, vitae malesuada sapien volutpat");
            book4.displayInfo();
            Books book5 = new Books ("The Catcher in the Rye", "J.D. Salinger", "288", "Little, Brown and Company", "1951", "Duis vel risus ut lorem varius efficitur a vel sem");
            book5.displayInfo();
        }
        else {
            System.out.println("Sorry, category number is not available\n");
            System.out.print("Please enter the category number correctly: ");
            answer = scn.nextInt();
                
                while (answer < 1 || answer > 7) {
                System.out.print("Please enter the category number correctly: ");
                answer = scn.nextInt();
                }
            }
        while (answer >= 1 && answer <= 7);
        System.out.println("========================================\nThank you for using this program\n========================================");
        }
}
