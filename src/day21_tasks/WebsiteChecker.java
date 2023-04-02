package day21_tasks;

public class WebsiteChecker {
    public static void main(String[] args) {

        String[] web = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com",
                "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};
        int countCom = 0;
        int countOrg = 0;
        int countEdu = 0;
        int others = 0;
        System.out.println(web[0]);
        for (int i = 0; i < web.length; i++) {

            if (web[i].substring(web[i].indexOf(".") + 1).equalsIgnoreCase("com")) {
                countCom++;
            } else if (web[i].substring(web[i].indexOf(".") + 1).equalsIgnoreCase("org")) {
                countOrg++;
            } else if (web[i].substring(web[i].indexOf(".") + 1).equalsIgnoreCase("edu")) {
                countEdu++;
            } else {
                others++;
            }
        }
        System.out.println("com" + countCom);
        System.out.println("org" + countOrg);
        System.out.println("edu" + countEdu);
    }

}
